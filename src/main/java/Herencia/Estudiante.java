package Herencia;

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;


    public Estudiante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);

        this.codigoEstudiante= codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    // Lo accedemos porque los atributos de la clase padre tiene el modificador de acceso "protected".
    public void mostrarDatos() {
     //   System.out.println("Nombre: "+ nombre+" \nApellido: "+apellido);
        System.out.println("Nombre: "+ getNombre()+
                " \nApellido: "+getApellido()+
                " \nEdad: "+getEdad()+
                " \nCodigo Estudiante: "+codigoEstudiante+
                " \nNota Final: "+notaFinal);


    }

}
