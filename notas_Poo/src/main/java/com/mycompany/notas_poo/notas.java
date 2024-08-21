/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notas_poo;

/**
 *
 * @author roxo2
 */
public class notas {
    private double notas[];
    private int pos;
    private double mayor;
    private double menor;
    private double sup = 0;
    
    public notas ()
    {}

    public void establecer (double notas[]){
    this.notas = notas;
    }
    
    public void calculos(){
        mayor = notas[0];
        menor = notas[0];
        for (int i = 0; i < 15; i++) {
            if (notas[i]> mayor) {
                mayor= notas[i];
            }
            if (menor > notas[i]) {
                menor= notas[i];
                pos = i;
            }
            if (notas[i]>3) {
                sup++;
            }
        }
        sup = (sup/15)*100;   
    }
    
    public double getMayor(){
    return mayor;
    }
    
    public double getposi(){
    return pos;
    }
    
    public double getSup(){
    return sup;
    }
}


