/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) {

        enemy monster = new enemy();
        zombi zumbi = new zombi();
        pocong hantupocong = new pocong();
        burung a = new burung();
        
        monster.attack();
        zumbi.attack();
        hantupocong.attack();
        a.fly();
       
    }
}
