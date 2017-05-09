/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_progra2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
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

        Scanner lectura = new Scanner(System.in);
        ArrayList<Persona> lista_persona = new ArrayList();
        ArrayList<Almacen> lista_almacen = new ArrayList();
        ArrayList<Producto> lista_producto = new ArrayList();
        String opcion = "";
        while (!opcion.equalsIgnoreCase("5")) {
            opcion = JOptionPane.showInputDialog("Ingrese opcion \n"
                    + "1-Almacen \n"
                    + "2-Personas \n"
                    + "3-Productos \n"
                    + "4-Reportes \n"
                    + "5-Salir \n");
            switch (opcion) {
                case "1": {
                    String op = JOptionPane.showInputDialog("Ingrese opcion \n"
                            + "1-Crear \n"
                            + "2-Acceder a un almacen \n");
                    switch (op) {
                        case "1": {
                            String opp = "";
                            opp = JOptionPane.showInputDialog("Ingrese opcion \n"
                                    + "1-Planta \n"
                                    + "2-Regionales \n"
                                    + "3-Plataforma \n"
                                    + "4-Temporales \n");
                            if (opp.equals("1")) {
                                int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño"));
                                int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura"));

                                int plantas = Integer.parseInt(JOptionPane.showInputDialog("numero de plantas"));
                                lista_almacen.add(new almacen_planta(tamaño, altura, plantas));

                                String res = "", e = "";
                                while (!res.equalsIgnoreCase("2")) {
                                    for (Persona t : lista_persona) {
                                        if (t instanceof Empleado) {
                                            e += "\n" + lista_persona.indexOf(t) + " " + t;
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos de empleado a agregar"));
                                    for (Almacen r : lista_almacen) {
                                        e += "\n" + lista_almacen.indexOf(r) + " " + r;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen"));
                                    ((Almacen) lista_almacen.get(pos2)).getLista_empleado().add((Empleado) lista_persona.get(pos));
                                    res = JOptionPane.showInputDialog("1-Si \n"
                                            + "2-No \n");
                                }
                                while (!res.equalsIgnoreCase("2")) {
                                    for (Persona t : lista_persona) {
                                        if (t instanceof Cliente) {
                                            e += "\n" + lista_persona.indexOf(t) + " " + t;
                                        }
                                    }
                                    System.out.println(e);
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos de cliente a agregar"));

                                    for (Almacen r : lista_almacen) {
                                        e += "\n" + lista_almacen.indexOf(r) + " " + r;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen"));
                                    ((Almacen) lista_almacen.get(pos2)).getLista_clientes().add((Cliente) lista_persona.get(pos));
                                    res = JOptionPane.showInputDialog("1-Si \n"
                                            + "2-No \n");
                                }
                                while (!res.equalsIgnoreCase("2")) {
                                    for (Producto t : lista_producto) {
                                        e += "\n" + lista_persona.indexOf(t) + " " + t;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos de cliente a agregar"));

                                    for (Almacen r : lista_almacen) {
                                        e += "\n" + lista_almacen.indexOf(r) + " " + r;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen"));
                                    ((Almacen) lista_almacen.get(pos2)).getLista_producot().add(lista_producto.get(pos));
                                    res = JOptionPane.showInputDialog("1-Si \n"
                                            + "2-No \n");
                                }
                                JOptionPane.showMessageDialog(null, "Se agrefo todo con exito");
                            } else if (opp.equals("2")) {
                                int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño"));
                                int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura"));
                                String nombre = JOptionPane.showInputDialog("Ingrese nombre del departamento");
                                lista_almacen.add(new almacen_regional(nombre, tamaño, altura));
                                String res = "", e = "";
                                while (!res.equalsIgnoreCase("2")) {
                                    for (Persona t : lista_persona) {
                                        if (t instanceof Empleado) {
                                            e += "\n" + lista_persona.indexOf(t) + " " + t;
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos de empleado a agregar"));
                                    for (Almacen r : lista_almacen) {
                                        e += "\n" + lista_almacen.indexOf(r) + " " + r;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen"));
                                    ((Almacen) lista_almacen.get(pos2)).getLista_empleado().add((Empleado) lista_persona.get(pos));
                                    res = JOptionPane.showInputDialog("1-Si \n"
                                            + "2-No \n");
                                }
                                while (!res.equalsIgnoreCase("2")) {
                                    for (Persona t : lista_persona) {
                                        if (t instanceof Cliente) {
                                            e += "\n" + lista_persona.indexOf(t) + " " + t;
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos de cliente a agregar"));

                                    for (Almacen r : lista_almacen) {
                                        e += "\n" + lista_almacen.indexOf(r) + " " + r;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen"));
                                    ((Almacen) lista_almacen.get(pos2)).getLista_clientes().add((Cliente) lista_persona.get(pos));
                                    res = JOptionPane.showInputDialog("1-Si \n"
                                            + "2-No \n");
                                }
                                while (!res.equalsIgnoreCase("2")) {
                                    for (Producto t : lista_producto) {
                                        e += "\n" + lista_persona.indexOf(t) + " " + t;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos de cliente a agregar"));

                                    for (Almacen r : lista_almacen) {
                                        e += "\n" + lista_almacen.indexOf(r) + " " + r;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen"));
                                    ((Almacen) lista_almacen.get(pos2)).getLista_producot().add(lista_producto.get(pos));
                                    res = JOptionPane.showInputDialog("1-Si \n"
                                            + "2-No \n");
                                }
                                JOptionPane.showMessageDialog(null, "Se agrefo todo con exito");
                            } else if (opp.equals("3")) {
                                int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño"));
                                int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura"));
                                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuemro de clientes"));
                                lista_almacen.add(new almacen_plataforma(numero, tamaño, altura));
                                String res = "", e = "";
                                while (!res.equalsIgnoreCase("2")) {
                                    for (Persona t : lista_persona) {
                                        if (t instanceof Empleado) {
                                            e += "\n" + lista_persona.indexOf(t) + " " + t;
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos de empleado a agregar"));
                                    for (Almacen r : lista_almacen) {
                                        e += "\n" + lista_almacen.indexOf(r) + " " + r;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen"));
                                    ((Almacen) lista_almacen.get(pos2)).getLista_empleado().add((Empleado) lista_persona.get(pos));
                                    res = JOptionPane.showInputDialog("1-Si \n"
                                            + "2-No \n");
                                }
                                while (!res.equalsIgnoreCase("2")) {
                                    for (Persona t : lista_persona) {
                                        if (t instanceof Cliente) {
                                            e += "\n" + lista_persona.indexOf(t) + " " + t;
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos de cliente a agregar"));

                                    for (Almacen r : lista_almacen) {
                                        e += "\n" + lista_almacen.indexOf(r) + " " + r;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen"));
                                    ((Almacen) lista_almacen.get(pos2)).getLista_clientes().add((Cliente) lista_persona.get(pos));
                                    res = JOptionPane.showInputDialog("1-Si \n"
                                            + "2-No \n");
                                }
                                while (!res.equalsIgnoreCase("2")) {
                                    for (Producto t : lista_producto) {
                                        e += "\n" + lista_persona.indexOf(t) + " " + t;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos de cliente a agregar"));

                                    for (Almacen r : lista_almacen) {
                                        e += "\n" + lista_almacen.indexOf(r) + " " + r;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen"));
                                    ((Almacen) lista_almacen.get(pos2)).getLista_producot().add(lista_producto.get(pos));
                                    res = JOptionPane.showInputDialog("1-Si \n"
                                            + "2-No \n");
                                }
                                JOptionPane.showMessageDialog(null, "Se agrefo todo con exito");
                            } else if (opp.equals("4")) {
                                int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño"));
                                int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura"));
                                lista_almacen.add(new almacen_temporal(tamaño, altura));
                                String res = "", e = "";
                                while (!res.equalsIgnoreCase("2")) {
                                    for (Persona t : lista_persona) {
                                        if (t instanceof Empleado) {
                                            e += "\n" + lista_persona.indexOf(t) + " " + t;
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos de empleado a agregar"));
                                    for (Almacen r : lista_almacen) {
                                        e += "\n" + lista_almacen.indexOf(r) + " " + r;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen"));
                                    ((Almacen) lista_almacen.get(pos2)).getLista_empleado().add((Empleado) lista_persona.get(pos));
                                    res = JOptionPane.showInputDialog("1-Si \n"
                                            + "2-No \n");
                                }
                                while (!res.equalsIgnoreCase("2")) {
                                    for (Persona t : lista_persona) {
                                        if (t instanceof Cliente) {
                                            e += "\n" + lista_persona.indexOf(t) + " " + t;
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos de cliente a agregar"));

                                    for (Almacen r : lista_almacen) {
                                        e += "\n" + lista_almacen.indexOf(r) + " " + r;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen"));
                                    ((Almacen) lista_almacen.get(pos2)).getLista_clientes().add((Cliente) lista_persona.get(pos));
                                    res = JOptionPane.showInputDialog("1-Si \n"
                                            + "2-No \n");
                                }
                                while (!res.equalsIgnoreCase("2")) {
                                    for (Producto t : lista_producto) {
                                        e += "\n" + lista_persona.indexOf(t) + " " + t;
                                    }
                                    JOptionPane.showMessageDialog(null, e);
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese pos de cliente a agregar"));

                                    for (Almacen r : lista_almacen) {
                                        e += "\n" + lista_almacen.indexOf(r) + " " + r;
                                    }

                                    JOptionPane.showMessageDialog(null, e);
                                    int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese almacen"));
                                    ((Almacen) lista_almacen.get(pos2)).getLista_producot().add(lista_producto.get(pos));
                                    res = JOptionPane.showInputDialog("1-Si \n"
                                            + "2-No \n");
                                }
                                JOptionPane.showMessageDialog(null, "Se agrefo todo con exito");
                            }
                        }

                        case "2": {

                        }
                        break;
                    }
                }
                break;

               case "2": {
                    String o=JOptionPane.showInputDialog("Ingrese opcion \n"
                            + "1-Empleado \n"
                            + "2-Clientes \n");
                    switch(){
                        
                    }
                }
                break;
                case "3": {
                    String oppp = JOptionPane.showInputDialog("Ingrese opcion \n"
                            + "1.Agregar \n"
                            + "2-Modificar \n"
                            + "3.Eliminar \n"
                            + "4.Listar \n");
                    switch (oppp) {
                        case "1": {
                            //fecha de emisión, vida útil, precio, tamaño, descripción, nombre y número de productos. 
                            int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia de emision"));
                            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes de emision"));
                            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de emision"));
                            Date fecha;
                            Calendar c = new GregorianCalendar(año, mes, dia);
                            fecha = c.getTime();
                            int vida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese vida util"));
                            int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio"));
                            int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño"));
                            String descripcion = JOptionPane.showInputDialog("descripcion");
                            String nombre = JOptionPane.showInputDialog("Nombre");
                            int productos = Integer.parseInt(JOptionPane.showInputDialog("numero de producots"));
                            lista_producto.add(new Producto(fecha, vida, precio, tamaño, descripcion, nombre, productos));
                            JOptionPane.showMessageDialog(null, "Todo seagrego con exito");
                        }
                        break;
                        case "2": {
                            String e = "";
                            for (Producto p : lista_producto) {
                                e += "\n" + lista_producto.indexOf(p) + " " + p;
                            }
                            JOptionPane.showMessageDialog(null, e);
                            int pos = Integer.parseInt(JOptionPane.showInputDialog("Posicion"));
                            int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia de emision"));
                            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes de emision"));
                            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de emision"));
                            Date fecha;
                            Calendar c = new GregorianCalendar(año, mes, dia);
                            fecha = c.getTime();
                            int vida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese vida util"));
                            int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio"));
                            int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño"));
                            String descripcion = JOptionPane.showInputDialog("descripcion");
                            String nombre = JOptionPane.showInputDialog("Nombre");
                            int productos = Integer.parseInt(JOptionPane.showInputDialog("numero de producots"));
                            ((Producto) lista_producto.get(pos)).setDescripcion(descripcion);
                            ((Producto) lista_producto.get(pos)).setEmision(fecha);
                            ((Producto) lista_producto.get(pos)).setNombre(nombre);
                            ((Producto) lista_producto.get(pos)).setNumero_productos(productos);
                            ((Producto) lista_producto.get(pos)).setPrecio(precio);
                            ((Producto) lista_producto.get(pos)).setTamaño(tamaño);
                            ((Producto) lista_producto.get(pos)).setVida_util(vida);
                            JOptionPane.showMessageDialog(null, "Se modficio con exito");
                        }
                        break;
                        case "3": {
                            String e = "";
                            for (Producto p : lista_producto) {
                                e += "\n" + lista_producto.indexOf(p) + " " + p;
                            }
                            JOptionPane.showMessageDialog(null, e);
                            int pos = Integer.parseInt(JOptionPane.showInputDialog("Posicion"));
                            lista_producto.remove(pos);
                            JOptionPane.showMessageDialog(null, "Se elimino con exito");
                        }
                        break;
                        case "4": {
                            String e = "";
                            for (Producto p : lista_producto) {
                                e += "\n" + lista_producto.indexOf(p) + " " + p;
                            }
                            JOptionPane.showMessageDialog(null, e);
                        }
                        break;
                    }
                }
                break;
            }

        }

    }

}
