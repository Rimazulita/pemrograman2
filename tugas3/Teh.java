/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author user
 */
    class Teh extends Minuman {
    private boolean denganEs;

    public Teh(String nama, double harga, boolean denganEs) {
        super(nama, harga);
        this.denganEs = denganEs;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Dengan Es: " + (denganEs ? "Ya" : "Tidak"));
    }
    }