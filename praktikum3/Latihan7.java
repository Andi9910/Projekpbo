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
public class Latihan7 {
      public static void main(String[]args){
          Scanner scan = new Scanner(System.in).useDelimiter("\n");
          System.out.println("Siapakah Presiden pertama Indonesia?");
          System.out.println("A. Dr.Ir.H.Soekarno");
          System.out.println("B. B.J. Habibie");
          System.out.println("C. Megawati Soekarno Putri");
          System.out.println("D. Abdurrahman Wahid");
          char pilih = scan.next().charAt(0);
          switch(pilih){
          case 'a':
          System.out.println("Benar!");
          break;
          case 'b':
          System.out.println("Salah, Jawabannya adalah Dr.Ir.H.Soekarno");
          break;
          case 'c':
          System.out.println("Salah, Jawabannya adalah Dr.Ir.H.Soekarno");
          break;
          case 'd':
          System.out.println("Salah, Jawabannya adalah Dr.Ir.H.Soekarno");
          break;
          default:
          System.out.println("System Error");
          
          
      }
      }
}
