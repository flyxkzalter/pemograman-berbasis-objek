/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab4.pkg5;

import java.util.Scanner;
/**
 *
 * @author defaultuser0
 */
public class inptscanner {
     public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int nilai1, nilai2;

    System.out.print("Masukkan nilai1 = ");
    nilai1 = s1.nextInt();
    System.out.print("Masukkan nilai2 = ");
    nilai2 = s1.nextInt();

    int jumlah = nilai1 + nilai2;
    System.out.println("Jumlah = " + jumlah);
    }
}
