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
public class biodata2 {
      public static void main(String[] args){
        
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       try{
           
           System.out.print("Nama\t\t: ");
           String nama = input.readLine();
           
           System.out.print("NIM\t\t: ");
           int nim = Integer.parseInt(input.readLine());
           
           System.out.print("Semester\t: ");
           int semester = Integer.parseInt(input.readLine());
           
           System.out.print("Asal Kampus\t: ");
           String kampus = input.readLine();
           
           System.out.println("\t=====Biodata=====");
           System.out.println("Nama\t\t: "+nama);
           System.out.println("NIM\t\t: "+nim);
           System.out.println("Jurusan\t\t: "+semester);
           System.out.println("Asal Kampus\t: "+kampus);
           System.out.println("\t=================");
           
       }catch (IOException ex) {
           System.out.println("DATA ERROR!");
       }
    }
}

