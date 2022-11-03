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
public class nilaihuruf {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        int nilai;
        
        System.out.print("Masukkkan Nilai Anda = ");
        nilai= n1.nextInt();
        
        System.out.print("Kesimpulan : ");
        if ((nilai > 0)&&(nilai <= 55)) {
            System.out.println("Nilai Anda adalah E"); }
        
        else if ((nilai >= 55)&&(nilai <= 65)) {
            System.out.println("Nilai Anda adalah D"); }
        
        else if ((nilai >= 65)&&(nilai <= 75)) {
            System.out.println("Nilai Anda C"); }       
        
        else if ((nilai >= 75)&&(nilai <= 85)) {
            System.out.println("Nilai Anda B"); }
      
        else if ((nilai >= 85)&&(nilai <= 100)) {
            System.out.println("Nilai Anda A");}
       
        else if ((nilai < 1) && (nilai > 100)) {    
            System.out.println("ERROR"); }
        
        else {
            System.out.println("ERROR");}
    }
}
