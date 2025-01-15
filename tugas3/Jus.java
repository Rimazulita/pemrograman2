/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author user
 */
    class Jus extends Minuman {
    private String rasa;

    public Jus(String nama, double harga, String rasa) {
        super(nama, harga);
        this.rasa = rasa;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Rasa: " + rasa);
    }
}