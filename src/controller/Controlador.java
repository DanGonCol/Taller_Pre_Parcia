
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Arrays;
import model.Factura;
import static model.Factura.registrarFactura;
import static model.Producto.registrarProducto;

public class Controlador {

    public static ArrayList<Factura> facturas = new ArrayList<>();
    
    public static void menu(){      
        String menu = "1. NUEVA FACTURA \n2. IMPRIMIR FACTURAS  \n3. Salir";
        String submenu = "1. NUEVO PRODUCTO \n2. REGRESAR ";
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    registrarFactura();
                    int subopcion;
                    do {
                        subopcion = Integer.parseInt(JOptionPane.showInputDialog(submenu));
                        switch (subopcion) {
                            case 1:
                                
                                registrarProducto();
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Regresando");
                                break;                            
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida");
                        }
                    } while (subopcion != 2);
                    break;
                case 2:
                    for (int i = 0; i<facturas.size(); i++){
                        JOptionPane.showMessageDialog(null, facturas.get(i).toString());
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 3);
    }
      
    public void arranque(){
        menu();      
    }  
}



    
