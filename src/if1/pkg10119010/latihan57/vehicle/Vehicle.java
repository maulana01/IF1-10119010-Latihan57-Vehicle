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
public class Vehicle {
    private String myBrand, myModel;
    
    public Vehicle() {
    }
    
    public String getBrand() {
        return this.myBrand;
    }
    
    public void setBrand(String brand) {
        this.myBrand = brand;
    }
    
    public String getModel() {
        return this.myModel;
    }
    
    public void setModel(String model) {
        this.myModel = model;
    }
}
