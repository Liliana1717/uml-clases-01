
public class PlacaBase {
    // sockets, slots,conectores,conectividad, chipset//
    public String marca;
    public Double precio;
    public String modelo;
    public String sockets, slots, conectores, conectividad, chipset;

    public String getFullName() {

        return marca + " " + precio + " " + modelo + " " + sockets + " " + slots + " " + conectores + " " + conectividad + " " + chipset;
    }


    public String getMarca() {
        return marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSockets() {
        return sockets;
    }

    public String getSlots() {
        return slots;
    }

    public String getConectores() {
        return conectores;
    }

    public String getConectividad() {
        return conectividad;
    }

    public String getChipset() {
        return chipset;
    }
}
