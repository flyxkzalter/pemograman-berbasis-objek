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
public class percabanganinput {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in).useDelimiter("\n");
        int nilai1, nilai2, nilai3;

        System.out.println("Masukkan nilai 1 = ");
        nilai1=scan.nextInt();
        
        System.out.println("Masukkan nilai 2 = ");
        nilai2=scan.nextInt();
        
        System.out.println("Masukkan nilai 3 = ");
        nilai3=scan.nextInt();
        
        System.out.print("Kesimpulan : ");
        
        if((nilai1 > nilai2) && (nilai1 > nilai3))  {
            System.out.println("Nilai 1 Terbesar");}
        
        if((nilai2 > nilai1) && (nilai2 > nilai3)) {
            System.out.println("Nilai 2 Terbesar");}
            
        if((nilai3 > nilai1) && (nilai3 > nilai2)) {
            System.out.println("Nilai 3 Terbesar");}
        
        else;
            System.out.println("Semua nilai sama besarnya");
  }    
}
