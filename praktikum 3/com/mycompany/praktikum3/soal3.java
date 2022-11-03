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
public class soal3 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in).useDelimiter("\n");
        int panjang, lebar, hasil, sisi;
        int pilihan;
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung keliling Persegi");
        System.out.println("Masukkan Panjang Sisi Persegi");
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("pilihan = ");
        pilihan = input.nextInt();
        switch(pilihan){
            
            case 1 :
                Scanner panjangi = new Scanner(System.in).useDelimiter("\n");
                System.out.println("Masukkan Panjang Sisi Persegi = " );
                panjang = panjangi.nextInt();
                
                hasil = panjang*panjang;
                System.out.println("Luas persegi adalah : " + hasil + " cm");
                
                break;
            case 2:
            
            Scanner sisip = new Scanner(System.in).useDelimiter("\n");
            System.out.println("masukkan panjang sisi persegi = ");
            sisi = sisip.nextInt();
            
            hasil = 4*sisi;
            System.out.println("luas persegi adalah : " + hasil + " cm");
            
            break;
            case 3:
                System.out.println("Sistem Eror");
                break;
            
            
                
        }
        
    }
    }
    

