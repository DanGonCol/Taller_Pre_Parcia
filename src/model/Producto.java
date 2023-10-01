
package model;

import javax.swing.JOptionPane;
import static model.Factura.listaProductos;
public class Producto {
    
    private long cantidad;
    private long precio;
    private long codigo;
    private String nombre;
    private static long  numeroFactura = 0;

    public Producto() {
    }

    public Producto(long cantidad, long precio, long codigo, String nombre, long numeroFactura) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroFactura = numeroFactura;
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

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    @Override
    public String toString() {
        return "Producto{" 
                + "cantidad=" + cantidad + 
                "\nprecio=" + precio + 
                "\ncodigo=" + codigo + 
                "\nnombre=" + nombre + 
                "\nnumeroFactura=" + numeroFactura + '}';
    }
    
    
    
    public static void  IvaUnitario(){
        
    }  
    
    public static void registrarProducto() {
        String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad del producto");
        long cantidad = Long.parseLong(cantidadStr);

        String precioStr = JOptionPane.showInputDialog("Ingrese el precio del producto");
        long precio = Long.parseLong(precioStr);

        String codigoStr = JOptionPane.showInputDialog("Ingrese el código del producto");
        long codigo = Long.parseLong(codigoStr);

        Factura objFac = new Factura();
        numeroFactura = objFac.getNumero();

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto");

        if (cantidadStr.isEmpty() || precioStr.isEmpty() || codigoStr.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hacen falta datos para poder crear el producto.");
            return;
        }

        Producto objPro = new Producto();
        objPro.setCantidad(cantidad);
        objPro.setPrecio(precio);
        objPro.setCodigo(codigo);
        objPro.setNombre(nombre);
        objPro.setNumeroFactura(numeroFactura);        
        listaProductos.add(objPro);
        
    }


    
}
