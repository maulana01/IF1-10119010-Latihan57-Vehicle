/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan57.vehicle;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini menampilkan macam-macam kendaraan dengan konsep OOP
 */
public class Bicycle extends Vehicle {
    private int myGearCount;
    
    public Bicycle() {
        super();
        System.out.println("Bicycle");
    }
    
    public int getGearCount() {
        return this.myGearCount;
    }
    
    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}
