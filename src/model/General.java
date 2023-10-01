
package model;

public class General extends Producto{
    
    private static final float valorIva = 0.19f;

    public General() {
    }

    public General(long cantidad, long precio, long codigo, String nombre, long numeroFactura) {
        super(cantidad, precio, codigo, nombre, numeroFactura);
    }
    
    General Cereal_Preparado  = new General();
    General Cereal_Preparado2 = new General();
    General Cereal_Preparado3 = new General();
    General Cereal_Preparado4 = new General();
    
    
    
   
}
