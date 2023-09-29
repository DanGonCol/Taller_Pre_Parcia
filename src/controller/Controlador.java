
package controller;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.Factura;

public class Controlador {

    public static ArrayList<Factura> facturas = new ArrayList<>();
        
public static void registrarFactura() {
    String numeroStr = JOptionPane.showInputDialog("Ingrese el número de la factura");
    long numero = Long.parseLong(numeroStr);

    String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la factura");

    String cliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");

    if (numeroStr.isEmpty() || fecha.isEmpty() || cliente.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Hacen falta datos para poder crear la factura.");
        return;
    }
    Factura objFac = new Factura();
    objFac.setNumero(numero);
    objFac.setFecha(fecha);
    objFac.setCliente(cliente);
    facturas.add(objFac);
}
    
public void arranque(){
registrarFactura();

}    
    
}



    
