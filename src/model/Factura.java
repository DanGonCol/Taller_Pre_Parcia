
package model;

import java.util.ArrayList;

public class Factura {
    
    
    private long numero;
    private String fecha = "";
    private String cliente = "";
    private ArrayList<String> listaProductos = new ArrayList<>();

      // Constructor vacío
   public Factura() {
   }

   // Constructor lleno
   public Factura(long numero, String fecha, String cliente, ArrayList<String> listaProductos) {
      this.numero = numero;
      this.fecha = fecha;
      this.cliente = cliente;
      this.listaProductos = listaProductos;
   }

   // Getters
   public long getNumero() {
      return numero;
   }

   public String getFecha() {
      return fecha;
   }

   public String getCliente() {
      return cliente;
   }

   public ArrayList<String> getListaProductos() {
      return listaProductos;
   }

   // Setters
   public void setNumero(long numero) {
      this.numero = numero;
   }

   public void setFecha(String fecha) {
      this.fecha = fecha;
   }

   public void setCliente(String cliente) {
      this.cliente = cliente;
   }

   public void setListaProductos(ArrayList<String> listaProductos) {
      this.listaProductos = listaProductos;
   }

   // Método toString
   @Override
   public String toString() {
      return "ClaseEjemplo{" +
              "numero=" + numero +
              ", fecha='" + fecha + '\'' +
              ", cliente='" + cliente + '\'' +
              ", listaProductos=" + listaProductos +
              '}';
   }
    
}
