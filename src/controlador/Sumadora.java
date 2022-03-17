/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 * Clase que suma dos numeros
 * @author antonioayala
 */
public class Sumadora {
    
    /**
     * Constructor vacío
     */
    public Sumadora() {
    }
    
    /**
     * Método que realiza la suma de los numeros a y b
     * @param a primer numero a sumar
     * @param b segundo numero a sumar
     * @return Regresa la suma de dos numeros
     */
    public double sumar(double a, double b){
        double suma = a + b;
        return suma;
    }
    
}
