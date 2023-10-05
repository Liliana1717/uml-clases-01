public class Procesador {
    //  estados,atributos,propiedades
    public String marca;
    public String modelo;
    public Double precio;

    // comportamientos o metodo (funciones)
    // public (+) metodo accesible desde cualquier clase
    // string:tipo devuelvo por el metodo
    public String getNombreCompleto() {
        //concatenar cadenas con +
        //AMD 7800 32.2

        return marca + " " + modelo + " " + precio;
    }

    public String getMarca() {
        return marca;


    }

    public String getModelo() {
        return modelo;
    }

    public Double getPrecio() {
        return precio;
    }
}