package Polimorfismo;

public class VehiculoTurismo extends Vehiculo{
    private int nPuertas;

    public int getnPuertas() {
        return nPuertas;
    }


    public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas= nPuertas;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nNumero de Puertas: "+nPuertas;
    }
}
