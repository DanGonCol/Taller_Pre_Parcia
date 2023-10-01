
package model;

public class Exentos extends Producto {
    
    private static final float valorIva = 0;

    public Exentos() {
    }

    public Exentos(long cantidad, long precio, long codigo, String nombre, long numeroFactura) {
        super(cantidad, precio, codigo, nombre, numeroFactura);
    }
        
    

}
