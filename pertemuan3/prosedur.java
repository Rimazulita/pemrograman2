/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author user
 */
public class prosedur {
    int panjang = 5;
    int lebar =10;
    
    void luaspersegipanjang () {
        int luas = panjang * lebar;
        
        System.out.println( "panjang = " + panjang);
        System.out.println("lebar=" + lebar);
        System.out.println("luas persegi panjang=" + luas);       
    }
    int kelilingpersegipanjang () {
        int keliling = 2*(panjang + lebar);
        return keliling;
        
    }
    public static void main (String[] args) {
        prosedur p = new prosedur ();
        p.luaspersegipanjang();
        System.out.println( "keliling persegi panjang =" + p.kelilingpersegipanjang());
    }
}
