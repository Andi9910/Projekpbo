/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author And_i
 */
public class Struktur {
    public static void main(String[]args){
    int nohari=3;
    
    switch (nohari){
    case 1:
        System.out.println("hari ke-" +nohari + " adalah hari minggu");
        break;
    case 2:
        System.out.println("hari ke-" +nohari + " adalah hari senin");
        break;
    case 3:
        System.out.println("hari ke-" +nohari + " adalah hari selasa");
        break;
    case 4:
        System.out.println("hari ke-" +nohari + " adalah hari rabu");
        break;
    case 5:
        System.out.println("hari ke-" +nohari + " adalah hari kamis");
        break;
    case 6:
        System.out.println("hari ke-" +nohari + " adalah hari jumat");
        break;
    case 7:
        System.out.println("hari ke-" +nohari + " adalah hari sabtu");
        break;
    default:
        System.out.println("tidak ada hari ke-" + nohari);
}
    }
}
