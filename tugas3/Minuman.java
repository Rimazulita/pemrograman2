/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author user
 */
public class Minuman {
    protected String nama;
    protected double harga;
    
    public Minuman(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
        
    }
     
    //Method untuk menampilkan informasi minuman
    public void tampilkanInfo() {
        System.out.println("Nama Minuman: " + nama);
        System.out.println("Harga: Rp " + harga);
    }
}
