import br.com.atv.atividadespraticas.Animal;
import br.com.atv.atividadespraticas.Cachorro;
import br.com.atv.atividadespraticas.Gato;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println("---------------------------");
        animal.emitirSom();
        System.out.println("---------------------------");
        cachorro.emitirSom();
        cachorro.abanarRabo();
        System.out.println("---------------------------");
        gato.emitirSom();
        gato.arranharMoveis();
        System.out.println("---------------------------");


    }
}
