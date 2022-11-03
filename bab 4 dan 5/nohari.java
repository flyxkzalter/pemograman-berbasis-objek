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
public class nohari {
       public static void main(String[] args) {
        int noHari;
        Scanner h1 = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan nomor hari :");
        noHari = h1.nextInt();
    switch (noHari){
        case 1  :
            System.out.println("Hari ke-" + noHari + "adalah Minggu");
            break;
        case 2 :
            System.out.println("Hari ke-" + noHari + "adalah Senin");
            break;
        case 3 :
             System.out.println("Hari ke-" + noHari + "adalah Selasa");
             break;
        case 4 :
            System.out.println("Hari ke-" + noHari + "adalah Rabu");
            break;
        case 5 :
            System.out.println("Hari ke-" + noHari + "adalah Kamis");
            break;
        case 6 :
            System.out.println("Hari ke-" + noHari + "adalah Jumat");
            break;
        case 7 :
            System.out.println("Hari ke-" + noHari + "adalah Sabtu");
            break;
        default:
         System.out.println("Tidak ada hari ke-" +noHari+ "yang ada inputan");
        }
    }
}
