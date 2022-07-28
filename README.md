# PROGRAMACION ORIENTADA A OBJETOS

- DEFINICION: 
  * Miembros
    1. Atributos (Caracteristicas):
       * Color
       * Marca
       * Km  
    2. Metodos (Acciones):
       * encender
       * acelerar
       * frenar
  
  * Clase
    - Es un conjunto de objetos con caracteristicas similares.
    
  * Constructor
    - Es un metodo especial de una clase que se invoca siempre que se crea un objeto de esa clase
    1. Cuando se crea un objeto: 
       * Se asigna memoria para el objeto.
       * Se inicializan los atributos de ese objeto.
       * Se invoca al constructor de la clase que puede ser uno entre varios.
    
    2. Caracteristicas
       * Tienen el mismo nombre de la Clase.
       * No devuelve ningun valor.
       * Debe declararse como público.

  * Sobrecarga de metodos.
    - Se diferencias por la cantidad o tipo de parametros que tienen. 
    - (sobrecarga de metodos aplica tanto para metodos constructores y metodos normales)
    ``` bash
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
    ```
  * Modificadores de Acceso
     - Restricciones para atributos y metodos
    1. private : Misma clase
    2. default : mismo paquete
    3. public : En todo el aplicativo
    4. protected : Desde la clase hija (clase a heredar)

  * Encapsulacion
     - Ocultar los atributos y metodos para que solo puedan ser accedidos de la misma clase. 
        1. Modificador de Acceso (PRIVATE)
        2. Medotos accesores:  (GETTERS Y SETTERS)
       ``` bash
          public class Clase1 {
            private int edad;

             public void setEdad(int edad) {
             this.edad = edad;
              }

             public int getEdad() {
             return edad;
            }
          }
       ```
       ``` bash
             public class Clase2 {
               public static void main(String[] args) {
                 Clase1 objeto1= new Clase1();

                 objeto1.setEdad(10);
                 System.out.println(objeto1.getEdad());
                  }
                 }
    
       ```
  * Constante
     - Algo que no va a poder cambiar , quedara asi todo el programa.
     - Prohibido poner el metodo Setter a una constante.
     ``` bash
            private final String nombre;
   
            public void setNombre(String nombre) {
               this.nombre = nombre;
            }
       ```
  * Estático
      - Miembros de clase
      - Los metodos y atributos estáticos no le pertenecen a los objetos sino a la clase.
      - No se necesita instanciar un objeto para poder utilizarlos  e.g ( User user1 = new User();)
     ``` bash
            public class Estatico {
            private static String frase = "Primera fase";

               public static int sumar (int n1, int n2) {
               int suma = n1 + n2;
               return suma;
            }

              public static void main(String[] args) {
              System.out.println(Estatico.frase);
              System.out.println(Estatico.sumar(10,2));
             }}
            }
       ```
  * Herencia
      - La herencia es una forma de reutilización de software en la que se crea una nueva clase al absorber los miembros de una ya existente.
      -  Se podrian acceder a sus miembros por el modificador de acceso "protected" , en Persona
     ``` bash
            public class Persona {
                  private String nombre;
                  private String apellido;
                  private int edad;

               public Persona(String nombre, String apellido, int edad) {
                  this.nombre = nombre;
                  this.apellido = apellido;
                  this.edad = edad;
            }
       ```  
      ``` bash
            public class Estudiante extends Persona {
            private int codigoEstudiante;
            private float notaFinal;


                public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
                  super(nombre, apellido, edad);

                  this.codigoEstudiante= codigoEstudiante;
                  this.notaFinal = notaFinal;
                }
       ```  
      ``` bash
            public class Main {
               public static void main(String[] args) {
                 Estudiante estudiante= new Estudiante("Alejandro", "Taboada", 21, 123,15.6f);
               }
            }
       ```  

  * Sobre escritura de Miembros
      - Una subclase hereda todos los métodos de su superclase que son accesibles a dicha subclase a menos que la subclase sobreescriba los métodos.
      - Una subclase sobreescribe un método de su superclase cuando define un método con las mismas características ( nombre, número y tipo de argumentos) que el método de la superclase.
      - Las subclases emplean la sobreescritura de métodos la mayoría de las veces para agregar o modificar la funcionalidad del método heredado de la clase padre.

     ``` bash
            class ClaseA
                         {
             void miMetodo(int var1, int var2)
             { ... }

              String miOtroMetodo( )
               { ... }
               }

              class ClaseB extends ClaseA
                {
               /* Estos métodos sobreescriben a los métodos
               de la clase padre */

                void miMetodo (int var1 ,int var2)
               { ... }

                String miOtroMetodo( )
               { ... }
               }
       ```
  * Clases y metodos Abstractos
    1. Clase Abstracta
      - Se utilizan solo como super clases.
      - No se pueden instancias objetos
      - Sirve para proporcionar una super clase apropiada a partir de la cual heredan otras clases. (Bosquejo de lo que tendran sus clases hijas)
      - (Va a estar en la supperclase pero no sabes como implementarlo xk es muy generico)
      - Al tener un metodo abstracto tiene que tener una clase abstracta.
      - Los metodos abstractos no se implementan solo se definen.
      - Se coloca "abstract" en la superclase para que se implementen los metodos abstractos en las clases hijas.
      - Que se debe hacer? ,  pero no el.. como ?

  * Polimorfismo
    - Es una relacion de tipo herencia, un objeto de la superclase puede almacenar un objeto de cualquiera de sus subclases.
    - Esto significa que la clase padre o superclase es compatible con los tipos que derivan de ella. Pero no al revés.
    
    1. Poli     = "muchos"
    2. Morfismo = "forma"
    - Las Muchas formas como puede actuar un objeto. Dependiendo del contexto que lo pongas
    - Un objeto de la clase padre Guarde lo que es la instanciacion de una de sus hijas.
  
  * Interface
    - Contrato que se deben hacer sin proveeder ninguna funcionalidad
    - Uso de N cantidad de interfaces que necesite
    - metodo vacio de que se debe hacer pero no el como se debe hacer.
    - Para evitar la herencia multiple
    - 
  



   
  
