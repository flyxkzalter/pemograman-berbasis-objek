/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab4.pkg5;
import javax.swing.JOptionPane;
/**
 *
 * @author defaultuser0
 */
public class JOPbiodata {
       public static void main(String[] args) {
       
      String nama = JOptionPane.showInputDialog("Masukkan nama anda!");
      int nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIM Anda!"));
      String jurusan = JOptionPane.showInputDialog("Masukkan Jurusan Anda!");
      String kampus = JOptionPane.showInputDialog("Masukkan Asal Kampus Anda!");
      
      System.out.println("*****Biodata Mahasiswa Institut Teknologi Sapta Mandiri*****");
      System.out.println("Nama \t\t: "+nama);
      System.out.println("NIM \t\t: "+nim);
      System.out.println("Jurusan \t: "+jurusan);
      System.out.println("Asal Kampus\t: "+kampus);
      System.out.println("************************************************************");
    }
}
