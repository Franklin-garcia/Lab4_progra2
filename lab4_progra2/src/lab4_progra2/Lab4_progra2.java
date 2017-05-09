/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_progra2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin Garcia
 */
public class Lab4_progra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        
=======
        ArrayList<Persona> lista_persona = new ArrayList();
        ArrayList<Almacen> lista_almacen = new ArrayList();
        ArrayList<Producto> lista_producto = new ArrayList();
        String opcion = "";
        while (!opcion.equalsIgnoreCase("6")) {
            opcion = JOptionPane.showInputDialog("Ingrese opcion \n"
                    + "1-Agregar \n"
                    + "2-Modificar \n"
                    + "3-Eliminar \n "
                    + "4-Listar \n"
                    + "5-Transferir \n"
                    + "6-Salir \n");
            switch (opcion) {
                case "1": {
                    String op="";
                    while(!op.equalsIgnoreCase("4")){
                        op=JOptionPane.showInputDialog("Ingrese opcion \n"
                                + "1-Almacen \n"
                                + "2-Persona \n"
                                + "3-Producto \n"
                                + "4-Salir \n");
                        switch(op){
                            case "1":{
                                
                            }break;
                            case "2":{
                                
                            }break;
                            case "3":{
                                
                            }break;
                        }
                    }
                    
                }
                break;
                case "2": {

                }
                break;
                case "3": {

                }
                case "4": {

                }
                break;
                case "5": {

                }
                break;

            }
        }
>>>>>>> 4437e5c7da6b69a5d3d7c0a9b347324e92d8a72b
    }

}
