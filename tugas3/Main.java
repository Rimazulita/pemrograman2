        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author user
 */
    public class Main {
    public static void main (String[] args){
        // Membuat daftar minuman
        Minuman kopiHitam = new Kopi("Kopi Hitam", 15000, "Robusta");
        Minuman tehHijau = new Teh("Teh Hijau", 12000, false);
        Minuman jusMangga = new Jus("Jus Mangga", 20000, "Mangga");
        
        

        // Menampilkan informasi setiap minuman
        System.out.println("Daftar Minuman di Kafe:");
        System.out.println("-----------------------");
        kopiHitam.tampilkanInfo();
        System.out.println("-----------------------");
        tehHijau.tampilkanInfo();
        System.out.println("-----------------------");
        jusMangga.tampilkanInfo();
        
        
        
    }
}
    
