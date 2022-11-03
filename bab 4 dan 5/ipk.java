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
public class ipk {
     public static void main(String[] args) {
     
        Scanner inp = new Scanner(System.in);
        //Input Nama
        System.out.print("Masukkan IPK Anda = ");
        float nilai = inp.nextFloat();
        
        if(nilai < 3.00) {
            System.out.println("Cukup");}
        
        else if(nilai < 3.49) {
            System.out.println("Memuaskan");}
   
        else if(nilai < 3.74) {
            System.out.println("Sangat Memuaskan ");}
        else {
            System.out.println("Cum Laude ");}
        }
}
