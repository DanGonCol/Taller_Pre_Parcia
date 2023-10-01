
package model;

import static controller.Controlador.facturas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Factura {    
    
    private static long numero = 0;
    private String fecha = "";
    private String cliente = "";
    public static ArrayList<Producto> listaProductos = new ArrayList<>();

    public Factura() {
    }

    
    public Factura(long numero,String fecha,String cliente) {        
        this.cliente = cliente;
        this.fecha = fecha;
        
    }    

    public String getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }   
  
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        String productosStr = "";
        for (Producto producto : listaProductos) {
            productosStr += producto.toString() + "\n";
        }
        return "Factura{" + 
               "numero=" + numero + 
               "\nfecha=" + fecha + 
               "\ncliente=" + cliente + 
               "\nproductos=" + productosStr + 
               '}';
    }


    public static void registrarFactura() {
        numero++;

        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la factura");

        String cliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");

        if ( fecha.isEmpty() || cliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hacen falta datos para poder crear la factura.");
            return;
        }
        Factura objFac = new Factura();
        objFac.setNumero(numero);
        objFac.setFecha(fecha);
        objFac.setCliente(cliente);
        ArrayList<Producto> productosFactura = new ArrayList<>();
        for (Producto producto : Factura.listaProductos) {
            if (producto.getNumeroFactura() == numero) {
                productosFactura.add(producto);
            }
        }
        objFac.setListaProductos(productosFactura);
        facturas.add(objFac);
    }
   
}
