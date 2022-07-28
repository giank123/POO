package Clase_Metodo_Abstracto;

public class Main {
    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animalCarnivoro=new AnimalCarnivoro();

        planta.alimentarse();
        animalCarnivoro.alimentarse();
    }
}
