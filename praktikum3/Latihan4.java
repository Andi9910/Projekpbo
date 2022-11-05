/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.praktikum3;
import java.util.Scanner;
/**
 *
 * @author And_i
 */
public class Latihan4 {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in).useDelimiter("\n");
       System.out.println("apakah anda mahasiswa ITS Mandiri, Muhammad Andi Salam) (Y jika setuju)");
       String jawaban=scan.next();
       if ("Y".equals(jawaban)){
           System.out.println("Selamat berjuang di ITS Mandiri");
       }else{
           System.out.println("Selamat datang di ITS Mandiri");
       }
   } 
}
