package SobrecargaDeMetodos;

public class Persona {
    private String nombre;
    private String dni;
    private int edad;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public void Persona(String dni) {
        this.dni = dni;
    }

    public void Persona(int edad) {
        this.edad = edad;
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
