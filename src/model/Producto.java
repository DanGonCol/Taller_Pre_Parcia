
package model;

public class Producto {
    
    private long cantidad;
    private long precio;
    private long codigo;
    private String nombre = "";
    
    public Producto() {
    }

    // Constructor lleno
    public Producto(long cantidad, long precio, long codigo, String nombre) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Getters
    public long getCantidad() {
        return cantidad;
    }

    public long getPrecio() {
        return precio;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    // Setters
    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString
    @Override
    public String toString() {
        return "ClaseEjemplo{" +
                "cantidad=" + cantidad +
                ", precio=" + precio +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    
    public static void  IvaUnitario(){
        
    }
}
