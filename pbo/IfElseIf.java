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
public class IfElseIf {
    public static void main (String[] args) {
        int nilai;
      System.out.print("Masukkan Nilai Anda : ");
        Scanner da = new Scanner(System.in);
   nilai= da.nextInt();

   
   if (nilai <= 55) {
       System.out.println("E");
   }
   else if (nilai <= 65){
       System.out.println("D");
   }
   else if (nilai <= 75){
       System.out.println("C");
   }
   else if (nilai <= 85){
       System.out.println("B");
   }
   else if (nilai <= 100){
       System.out.println("A");
   }
   else if ((nilai <= 0) || (nilai > 100)){
            System.out.println("ERROR"); 
   }
   }
    }




