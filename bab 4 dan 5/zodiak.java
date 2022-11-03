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
public class zodiak {
    public static void main(String[] args) {
        System.out.println("***Ramalan Zodiak Terbaru***");
        Scanner h1 = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan angka mulai dari 1-12 : ");
        int angka = h1.nextInt();
    
    switch (angka){
        case 1 :
            System.out.println( + angka + " adalah Zodiak Aries ");
            break;
        case 2 :
            System.out.println( + angka + " adalah Zodiak Taurus  ");
            break;
        case 3 :
             System.out.println( + angka + " adalah Zodiak Gemini ");
             break;
        case 4 :
            System.out.println( + angka + " adalah Zodiak Cancer ");
            break;
        case 5 :
            System.out.println( + angka + " adalah Zodiak Leo ");
            break;
        case 6 :
            System.out.println( + angka + " adalah Zodiak Virgo ");
            break;
        case 7 :
            System.out.println( + angka + " adalah Zodiak Libra ");
            break;
        case 8 :
            System.out.println( + angka + " adalah Zodiak Scorpio ");
            break;
        case 9 :
            System.out.println( + angka + " adalah Zodiak Sagitarius ");
            break;
        case 10 :
            System.out.println( + angka + " adalah Zodiak Capricorn ");
            break;
        case 11 :
            System.out.println( + angka + " adalah Zodiak Aquarius ");
            break;  
        case 12 :
            System.out.println( + angka + " adalah Zodiak Pisces ");
            break;
        }
    }
}
