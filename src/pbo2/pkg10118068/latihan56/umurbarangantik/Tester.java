/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan56.umurbarangantik;

/**
 *	
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Membuat program berbasis object untuk mendapatkan informasi
 * barang antik seperti nama dan tahun
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio FM");
        
        System.out.println("Nama barang Antik : " + radio.getName());
        radio.tampilUmur();
    }
    
}
