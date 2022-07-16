/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 12; j++) {
                n = i * j;
                System.out.println(i + "*" + j + "=" + n);
            }
        }
    }
}
