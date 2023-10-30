public class MemoriaRam {

    // voltaje, latencia//
    public String marca;
    public Double precio;
    public String modelo;

    public String voltaje, latencia, tipo;

    public String getFullName() {
        return marca + " " + precio + " " + modelo + " " + voltaje + " " + latencia + " " + tipo;

        public String getMarca () {
            return marca;
        }
        public Double getPrecio () {
            return precio;
        }
        public String getVoltaje () {
            return voltaje;
        }
        public String getLatencia () {
            return latencia;
        }
        public String getTipo () {
        }

    }
}