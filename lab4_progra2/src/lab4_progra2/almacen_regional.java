/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_progra2;

import java.util.Random;

/**
 *
 * @author Franklin Garcia
 */
public class almacen_regional extends Almacen {
    private String nombre;

    public almacen_regional() {
        super();
    }

    public almacen_regional(String nombre, int tamaño_metros, int altura) {
        super(tamaño_metros, altura);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString()+ "almacen_regional{" + "nombre=" + nombre + '}';
    }
    
    @Override
    public String[][] riel(String codigo) {

        String[][] encriptar = new String[3][codigo.length()];

        int[] pos = new int[codigo.length()];

        int suma = 1;
        int cont = 0;

        for (int i = 0; i < codigo.length(); i++) {
            pos[i] = cont;

            cont += suma;
            if (cont == 3) {
                suma = -1;
                cont = 1;
            }
            if (cont == -1) {
                suma = 1;
                cont = 1;

            }

        }

        for (int i = 0; i < codigo.length(); i++) {
            for (int j = 0; j < codigo.length(); j++) {
                encriptar[i][j] = "-";
            }
            encriptar[i][pos[i]] = "" + codigo.charAt(i);
        }

        for (int i = 0; i < codigo.length(); i++) {
            encriptar[pos[i]][i] = "" + codigo.charAt(i);
        }

        return encriptar;

    }
    

    @Override
    public String transposicion(String codigo, String clave) {
        
      
        String transpos= "";


        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < codigo.length(); i++) {
            char letra = codigo.charAt(i);
            char letra2 = codigo.charAt(i);
            
            int pos = (letra - 65) + (letra -65);
            
            if(pos>26){
                pos-=26;
            }
            
            transpos = "" + abc.charAt(pos);
            
        }

        return transpos;

    }
    public String revertransposicion(String codigo, String clave){
        String transpos= "";


        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < codigo.length(); i++) {
            char letra = codigo.charAt(i);
            char letra2 = codigo.charAt(i);
            
            int pos = (letra - 65) - (letra -65);
            
            if(pos<0){
                pos+=26;
            }
            
            transpos = "" + abc.charAt(pos);
            
        }

        return transpos;
        
        
    }
    

    @Override
    public String binario(String codigo) {
        String nuevo_codigo="",nuevo="";
        for (int i = codigo.length()-1; i >0 ; i--) {
             nuevo_codigo+=codigo.charAt(i); 
        }
        int x=0;
        for (int i = 0; i < nuevo_codigo.length(); i++) {
               x=nuevo_codigo.charAt(i);
               nuevo=Integer.toBinaryString(x);
        }
        return nuevo;
    }
    

    private int random_adelanta() {
        Random ran = new Random();

        int tamaño = 1 + ran.nextInt(9);
        return tamaño;
    }

    @Override
    public String adelantaposiciones(int tamaño, String codigo) {
        String corrido = " ";
        for (int i = 0; i < codigo.length(); i++) {
            char a = (char) (codigo.charAt(i) + tamaño);
            if (codigo.charAt(i) == ' ') {
                corrido += " ";
            } else {
                corrido += a;
            }
        }
        return corrido.replaceAll("$", " ");
    }


    @Override
    public String declaraciondealfabeto(String codigo) {
        codigo = codigo.toUpperCase();
        Random rn = new Random();
        String newcodigo = "";
        for (int i = 0; i < codigo.charAt(i); i++) {
            char letra = codigo.charAt(i);

            switch (letra) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                    newcodigo += "" + (1 + rn.nextInt(100));

                    break;
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    newcodigo += "" + (1 + rn.nextInt(100));

                    break;
                default:
                    newcodigo += "" + letra;

            }

        }//fin del for

        return newcodigo;

    }
    
}
