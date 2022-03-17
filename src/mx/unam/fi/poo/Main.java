/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.fi.poo;
import controlador.Sumadora;
/**
 * Clase principal
 * @author antonioayala
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Clase empaquetada");
        Sumadora sumadora = new Sumadora();
        System.out.println("suma="+sumadora.sumar(3, 4));
    }
}
