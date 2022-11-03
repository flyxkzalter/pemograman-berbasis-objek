/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab4.pkg5;

/**
 *
 * @author defaultuser0
 */
public class percabangan {
    public static void main(String[] args) {
        int nilai1, nilai2, nilai3;
        nilai1 = 9;
        nilai2 = 10;
        nilai3 = 8;
        
        
        System.out.println("nilai 1 = "+nilai1);
        System.out.println("nilai 2 = "+nilai2);
        System.out.println("nilai 3 = "+nilai3);
        System.out.print("Kesimpulan : ");
        
        if((nilai1 > nilai2) && (nilai1 > nilai3))  {
            System.out.println("Nilai 1 Terbesar");}
        if((nilai2 > nilai1) && (nilai2 > nilai3))  {
            System.out.println("Nilai 2 Terbesar");}
        if((nilai3 > nilai1) && (nilai3 > nilai2)) {
            System.out.println("Nilai 3 Terbesar");}
      
        }
}
