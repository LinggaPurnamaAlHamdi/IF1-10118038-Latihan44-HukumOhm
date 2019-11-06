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
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    
    public Baterai() {  
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus ysng mengalir pada suatu kawat penghantar \n"
                + "akan berbanding lurus dengan beda potensial \n"
                + "pada ujung-ujung kawat penghantar tersebut\n"
                + "asalkan suhu kawat dijaga konstan.\n");
    }
    
    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
}
