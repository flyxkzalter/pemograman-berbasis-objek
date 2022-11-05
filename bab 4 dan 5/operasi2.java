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
public class operasi2 {
     public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       try{
           
        System.out.print("masukkan Nilai 1 : ");
        int n1 = Integer.parseInt(input.readLine());
        System.out.print("masukkan Nilai 2 : ");
        int n2 = Integer.parseInt(input.readLine());
        
        int h1 =(n1 + n2) * (n2 + n1);
        int h2 = n1 / 4 * n2;
        
        System.out.println("===== Output 1 =====");
        System.out.println("h1 = "+h1);
        System.out.println("h2 = "+h2);
        System.out.println("====================");
        
        boolean b1 = (h1 >= h2);
        boolean b2 = (h2 >= h1);
        boolean b3 = (h1 % 4) == (++h2 % 5);
        boolean b4 = (b1 ^ b3) && (b2 || b3);
        boolean b5 = b2 || (b3 &&(b2 ^ b1));
   
        System.out.println("===== Output 2 =====");
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        System.out.println("b5 = " + b5);
        System.out.println("====================");
        
       } catch (IOException ex) {
           System.out.print("DATA ERROR");
       }
    }
}

