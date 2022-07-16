/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
int numero=0;
	 Scanner escaner = new Scanner(System.in);
	System.out.println("Escribe un numero: \n");
	numero = escaner.nextInt();

	////////Obtener las unidades,decenas,centenas////////	
	int millares=numero/1000;
	int centenas=(numero-(millares*1000))/100;
	int decenas=(numero- (millares*1000 + centenas*100))/10;
	int unidades=numero-(millares*1000 + centenas*100 + decenas*10 );

	System.out.println("Millares = "+ millares);
	System.out.println("Centenas = "+ centenas);
	System.out.println("Decenas = "+ decenas);
	System.out.println("Unidades = "+ unidades);
    }
}
