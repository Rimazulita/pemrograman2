/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author user
 */
public class Kopi extends Minuman{
    private String jeniskopi;
    
    //constructor
    public Kopi(String nama, double harga, String jenisKopi){
        super(nama,harga);
        //memanggil konstruktor kelas induk
        this.jeniskopi = jenisKopi;
        
    }
    //override method untuk menampilkan informasi kopi
    public void tampilkanInfo(String jenisKopi) {
        super.tampilkanInfo();
        System.out.println("Jenis Kopi: " + jenisKopi);
    }
}
