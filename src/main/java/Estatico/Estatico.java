package Estatico;

//Los metodos y atributos estáticos no le pertenecen a los objetos sino a la clase.
//No se necesita instanciar un objeto para poder utilizarlos  e.g ( User user1 = new User();)

public class Estatico {
    private static String frase = "Primera fase";

    public static int sumar (int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    public static void main(String[] args) {
//        Estatico ob1 = new Estatico();
//        ob1.frase = "Segunda Frase";
//        System.out.println(ob1.frase);

        System.out.println(Estatico.frase);
        System.out.println(Estatico.sumar(10,2));


    }
}
