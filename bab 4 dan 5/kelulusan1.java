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
public class kelulusan1 {
      public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //Input Nama
        System.out.print("Masukkan Nama Anda = ");
        String nama = inp.nextLine();
        //Input NIM
        System.out.print("Masukkan NIM = ");
        String nim = inp.nextLine();
        //Input Nilai
        System.out.print("Masukkan Nilai = ");
        int nilai = inp.nextInt();
        //PRINT
        if (nilai >= 75) {
            System.out.println("Selamat, Anda Lulus!");}
        else {
            System.out.println("Anda Tidak Lulus");}
        }
}
