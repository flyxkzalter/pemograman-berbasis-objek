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
public class latihan2 {
    public static void main(String[]args){
        int belanja = 0;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("total belanjaa : Rp ");
        belanja = scan.nextInt();
        
        if (belanja > 100000){
            System.out.println("Selamat anda mendapatkan diskon!");
          
        }
     System.out.println("terima kasih");
    }
}  
