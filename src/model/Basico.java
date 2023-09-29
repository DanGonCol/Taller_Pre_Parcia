
package model;

public class Basico extends Producto{
    
    private static final float valorIva = 0.05f;

    public static float getValorIva() {
        return valorIva;
    }
   
    public Basico(long cantidad, long precio, long codigo, String nombre) {
        super(cantidad, precio, codigo, nombre);
    }

    
}
