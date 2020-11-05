/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan40_WarnaKepribadian;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan warna kepribadian
 */
public class User {
    public String namPengguna;
    Scanner scan = new Scanner(System.in);

    public void memasukkanNama() {
        System.out.print("NAMA KAMU : ");
        namPengguna = scan.next();
    }
}
