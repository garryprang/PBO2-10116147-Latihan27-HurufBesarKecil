/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk mengubah format teks.
 */

public class PBO210116147Latihan27HurrufBesarKecil {

    public static void main(String[] args) {
        String Kalimat;
        System.out.print("Masukkan kalimat\t: ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        String Besar = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        System.out.println();
        System.out.println("======= HASIL FORRMATTING =======");
        System.out.println("Huruf kapital\t\t: " + Besar);
        System.out.println("Huruf kecil\t\t: " + Kecil);
        System.out.println("\nDeveloped by Garry Prang");
    }
    
}
