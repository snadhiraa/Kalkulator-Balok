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
public class Balok extends Persegipanjang implements Menghitungruang{
    private double tinggi;

    public Balok(double t, double p, double l) {
        super(p, l);
        tinggi = t;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungvolume() {
        return super.hitungluas() * tinggi;
    }

    @Override
    public double hitungluaspermukaan() {
        return 2*(super.hitungluas() + (super.getLebar() * tinggi) + (super.getPanjang()*tinggi));
    }
}
