/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notas_poo;
import java.util.Scanner;
/**
 *
 * @author roxo2
 */
public class resultado_notas {
    public static void main(String[] args) {
        System.out.println("bienvenido al sistema de notas de algebra");
        notas nota = new notas();
        Scanner teclado = new Scanner (System.in);
        double[] notas = new double[15];
        double suma = 0, promedio;
        
        System.out.println("Ingrese 15 numeros (entre 0 y 5):");
        for (int i = 0; i < 15; i++) {
            System.out.println("ingrese el numero " + i);
            notas[i] = teclado.nextDouble();
            suma += notas[i];

        }
        promedio = suma/15;
        nota.establecer(notas);
        nota.calculos();
        
        System.out.println("la nota mayor es: " + nota.getMayor());
        System.out.println("el porcentaje de personas con mas de 3 es: " + nota.getSup());
        System.out.println("el promedio de notas es: " + promedio);
        System.out.println("el estudiante numero: " + nota.getposi()+ " tiene la peor nota");
        
        
        
        
    }
}
