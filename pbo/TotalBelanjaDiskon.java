/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;
import java.util.Scanner;
/**
 *
 * @author And_i
 */
public class TotalBelanjaDiskon { 
public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
       System.out.println("=====Total Belanja Anda=====");
       int total_belanja;
       double total_akhir;
       System.out.print("Total Belanja = Rp.");
       total_belanja = input.nextInt();
       System.out.println(""); 
       if ((total_belanja >= 100000) && (total_belanja <= 500000)) {
           total_akhir = total_belanja - (0.1*total_belanja);
            System.out.println("Selamat, anda mendapat diskon 10%");}
       else if ((total_belanja >=500000) && (total_belanja <= 1000000)){
           total_akhir = total_belanja - (0.2*total_belanja);
            System.out.println("Selamat, anda mendapat diskon 20%");}
      else if (total_belanja > 1000000) {
            total_akhir = total_belanja - (0.3*total_belanja);
            System.out.println("Selamat, anda mendapat diskon 30%");}
        else {
        total_akhir=total_belanja;
}
        System.out.println("Total setelah diskon = Rp. " +total_akhir);
        System.out.println("");
        System.out.println("****Terima Kasih****");
    }
}
