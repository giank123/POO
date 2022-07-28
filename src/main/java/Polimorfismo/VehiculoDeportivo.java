package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }


    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nCilindrada: "+cilindrada;
    }
}
