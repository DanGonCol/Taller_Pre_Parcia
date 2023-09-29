
package model;

import java.util.ArrayList;

public class Producto {
    
    private long cantidad;
    private long precio;
    private long codigo;
    private String nombre;
    private static Producto[] productos = new Producto[100];

    public Producto() {
    }

    public Producto(long cantidad, long precio, long codigo, String nombre) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Producto[] getProductos() {
        return productos;
    }

    public static void setProductos(Producto[] productos) {
        Producto.productos = productos;
    }

    @Override
    public String toString() {
        return "Producto{" + "cantidad=" + cantidad + ", precio=" + precio + ", codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
    public static void  IvaUnitario(){
        
    }
}
