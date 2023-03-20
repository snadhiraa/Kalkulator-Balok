/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123210016_tugas2;

/**
 *
 * @author ASUS
 */
public class Persegipanjang implements Menghitungbangun{
    private double panjang, lebar;

    public Persegipanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double p) {
        panjang = p;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double l) {
        lebar = l;
    }
    
    @Override
    public double hitungluas() {
        return getPanjang()*getLebar();
    }

    @Override
    public double hitungkeliling() {
        return (getPanjang()*getLebar())*2;    
    }
}
