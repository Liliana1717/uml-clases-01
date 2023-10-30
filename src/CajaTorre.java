public class CajaTorre {
    public String marca;
    public Double precio;
    public String modelo;
    public String placabase, memoriaram, procesador, tarjetagrafica, discoduro;

    public String getFullName() {

        return marca + " " + precio + " " + modelo + " " + placabase + " " + memoriaram + " " + procesador + " " + tarjetagrafica + " " + discoduro;
    }

    public String getMarca() {
        return marca;
    }

    public Double getPrecio() {
        return precio;}

    public String getModelo() {

        return modelo;
    }

    public String getPlacaBase() {
        return placabase;
    }

    public String getMemoriaRam() {
        return memoriaram;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetagrafica;
    }

    public String getDiscoDuro() {
        return discoduro;
    }
}