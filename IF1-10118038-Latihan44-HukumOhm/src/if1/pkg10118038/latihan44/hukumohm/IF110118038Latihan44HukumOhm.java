/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan44.hukumohm;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Hukum Ohm
 */
public class IF110118038Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai baterai1 = new Baterai();
        Baterai baterai2 = new Baterai(3,12);
        System.out.println("Kuat Arus : " + baterai2.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + baterai2.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + baterai2.hitungTegangan() + " volt");
    }
    
}
