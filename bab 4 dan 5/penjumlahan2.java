/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab4.pkg5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author defaultuser0
 */
public class penjumlahan2 {
      public static void main(String[] args){
         BufferedReader n1 = new BufferedReader(new InputStreamReader(System.in));
         try{
             
         
        System.out.print("Masukkan Nilai A : ");
        int nilaiA = Integer.parseInt(n1.readLine());
        
        System.out.print("Masukkan Nilai B : ");
        int nilaiB = Integer.parseInt(n1.readLine());
        
        int jumlah = nilaiA + nilaiB;
        
        System.out.println("Nilai A = " + nilaiA);
        System.out.println("Nilai B = " + nilaiB);
        System.out.println("Jumlah = " + jumlah);
        
    } catch (IOException ex) {
        System.out.println("DATA ERROR");
        }
    }
}

