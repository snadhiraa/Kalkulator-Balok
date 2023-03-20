/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123210016_tugas2;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("==========");
        System.out.println("Hitung Balok");
        System.out.println("==========");
            
        double p,l,t;
        System.out.println("Input Panjang : ");
        p = input.nextInt();
        System.out.println("Input Lebar : ");
        l = input.nextInt();
        System.out.println("Input Tinggi : ");
        t = input.nextInt();
        Balok balok = new Balok(p,l,t);
        Persegipanjang pp = new Persegipanjang(p,l);
                    
        System.out.println("Luas Persegi Panjang : " + pp.hitungluas());
        System.out.println("Keliling Persegi Panjang : " + pp.hitungkeliling());
        System.out.println("Volume Tabung : " + balok.hitungvolume());
        System.out.println("Luas Permukaan Tabung : " + balok.hitungluaspermukaan());
              
    }
}
