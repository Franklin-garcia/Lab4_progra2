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

        Random rn = new Random();
        String[][] encriptar = new String[codigo.length()][codigo.length()];
        
        int[] pos = new int[codigo.length()];
        for (int i = 0; i < pos.length; i++) {
            pos[i] = rn.nextInt(pos.length);
            for (int j = 0; j < i; j++) {

                if (pos[j] == pos[i]) {
                    pos[i] = rn.nextInt(4);
                    j = -1;

                }

            }

        }
        for (int i = 0; i < codigo.length(); i++) {
            for (int j = 0; j < codigo.length(); j++) {
                encriptar[i][j] = "-";
            }
            encriptar[i][pos[i]] = "" + codigo.charAt(i);
        }
        
        return encriptar;

    }

    @Override
    public String transposicion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String binario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vigenere() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adelantaposiciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void encriptadomatrices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void declaraciondealfabeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
