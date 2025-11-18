import br.com.teste.atividadespraticas.Animal;
import br.com.teste.atividadespraticas.Cachorro;

/*
Crie uma classe Animal e uma classe Cachorro que herda de Animal.
Em seguida, crie um objeto da classe Cachorro e faça o casting para
a classe Animal.
*/

/*
Modifique o Exercício 2 para incluir uma verificação usando instanceof
para garantir que o objeto seja do tipo correto antes de fazer o casting.
 */

public class MainAnimal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        //Todo cachorro eh um animal
        Animal animal = cachorro;

        /*
        //Valido se o animal e um cachorro...
        if (animal instanceof Cachorro){
            System.out.println("É um cachorro...");
            //Downcasting
            cachorro = (Cachorro) animal;
        }
        */
         //Outra forma de validar e já fazer o casting
        if (animal instanceof Cachorro cachorroCast){
            System.out.println("É um cachorro...");
        }



    }
}
