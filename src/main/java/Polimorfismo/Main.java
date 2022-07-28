package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GH67","Ferrari", "A89");
        misVehiculos[1] = new VehiculoTurismo("78HJ","Audi", "PI89",4);
        misVehiculos[2] = new VehiculoDeportivo("45GH","Toyota", "TR9",500);
        misVehiculos[3] = new VehiculoFurgoneta("JI8","Toyota", "YT9",2000);

        for(Vehiculo vehiculos: misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }

    }
}
