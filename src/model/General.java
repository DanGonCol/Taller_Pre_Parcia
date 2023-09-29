
package model;

public class General extends Producto{
    
    private static final float valorIva = 0.19f;
    
    public General(long cantidad, long precio, long codigo, String nombre) {
        super(cantidad, precio, codigo, nombre);
    }
   
}
