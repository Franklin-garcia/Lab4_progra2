/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_progra2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Franklin Garcia
 */
public class almacen_planta extends Almacen {

    private int numero_plantas;

    public almacen_planta() {
        super();
    }

    public almacen_planta(int numero_plantas, int tamaño_metros, int altura) {
        super(tamaño_metros, altura);
        this.numero_plantas = numero_plantas;
    }

    public int getNumero_plantas() {
        return numero_plantas;
    }

    public void setNumero_plantas(int numero_plantas) {
        this.numero_plantas = numero_plantas;
    }

    @Override
    public String toString() {
        return super.toString() + "almacen_planta{" + "numero_plantas=" + numero_plantas + '}';
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
    public String[][] transposicion(String codigo, String clave) {
        Random rn = new Random();
        String[][] transposicion = new String[codigo.length()][codigo.length()];

        int[] pos = new int[codigo.length()];

        for (int i = 0; i < pos.length; i++) {
            pos[i] = rn.nextInt(pos.length);
            for (int j = 0; j < i; j++) {

                if (pos[j] == pos[i]) {
                    pos[i] = rn.nextInt(pos.length);
                    j = -1;

                }

            }

        }

        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < codigo.length(); i++) {
            for (int j = 0; j < codigo.length(); j++) {
                transposicion[i][j] = "" + abc.charAt(rn.nextInt(26));
            }
        }
        for (int i = 0; i < codigo.length(); i++) {
            transposicion[pos[0]][i] = "" + codigo.charAt(i);
            transposicion[pos[1]][i] = "" + clave.charAt(i);
        }

        return transposicion;

    }

    @Override
    public String binario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vigenere(String codigo, String clave) {

    }

    private int random_adelanta() {
        Random ran = new Random();

        int tamaño = 1 + ran.nextInt(9);
        return tamaño;
    }

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
    public void encriptadomatrices() {

    }

    @Override
    public String declaraciondealfabeto(String codigo) {
        codigo = codigo.toLowerCase();
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
