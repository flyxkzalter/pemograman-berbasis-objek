/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum3;
import java.util.Scanner;
/**
 *
 * @author defaultuser0
 */
public class soal2 {
       public static void main(String[] args) {
        Scanner h1 = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan bulan (angka) : ");
        int angka = h1.nextInt();
    
    switch (angka){
        case 1 :
            System.out.println( + angka + " Januari ");
            break;
        case 2 :
            System.out.println( + angka + " Februari  ");
            break;
        case 3 :
             System.out.println( + angka + " Maret ");
             break;
        case 4 :
            System.out.println( + angka + " April ");
            break;
        case 5 :
            System.out.println( + angka + " Mei ");
            break;
        case 6 :
            System.out.println( + angka + " Juni ");
            break;
        case 7 :
            System.out.println( + angka + " Juli ");
            break;
        case 8 :
            System.out.println( + angka + " Agustus ");
            break;
        case 9 :
            System.out.println( + angka + " September ");
            break;
        case 10 :
            System.out.println( + angka + " Oktober ");
            break;
        case 11 :
            System.out.println( + angka + " November ");
            break;  
        case 12 :
            System.out.println( + angka + " Desember ");
            break;
            default :
            System.out.println("Sistem Eror");
        }
    }
}

