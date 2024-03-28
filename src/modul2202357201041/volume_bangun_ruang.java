/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2202357201041;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class volume_bangun_ruang {

    public double luas_lingkaran(double diameter) {
        double jari2 = (diameter / 2);
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }

    public double volume_tabung(double diameter, double tinggi) {
        double luas = luas_lingkaran(diameter);
        double volume = (luas * tinggi);
        return volume;
    }

    public double volume_kerucut(double diameter, double tinggi) {
        double luas = luas_lingkaran(diameter);
        double volume = (luas * tinggi) / 3.0;
        return volume;
    }

    public double volume_bola(double diameter) { 
        double jari2 = diameter / 2.0;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jari2, 3);
        return volume;
    }

    public static void main(String[] args) {
        volume_bangun_ruang mt= new volume_bangun_ruang ();
        String pilihanString = JOptionPane.showInputDialog(null,
                "Pilih bangun ruang:\n1. Tabung\n2. Kerucut\n3 Bola",
                "Pilihan", JOptionPane.QUESTION_MESSAGE);

        int pilihan = Integer.parseInt(pilihanString);

        double diameter, tinggi;

        if (pilihan == 1) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan diameter lingkaran: "));
            tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan diameter lingkaran"));
            double volume_tabung = mt.volume_tabung(diameter, tinggi);
            JOptionPane.showInputDialog(null, "Volume Tabung: " + volume_tabung);
            System.out.println("Volume Tabung: " + volume_tabung);

        } else if (pilihan == 2) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan diameter linkaran"));
            tinggi = Double.parseDouble(JOptionPane.showInputDialog(null, "Volume Kerucut: " ));
            double volume_kerucut = mt.volume_kerucut(diameter,tinggi);
            
        }else if (pilihan == 3) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan diameter lingkaran: "));
            double volume_bola = mt.volume_bola(diameter);
            JOptionPane.showMessageDialog(null, "Volume Bola: " + volume_bola);
            System.out.println("Volume bola: "+ volume_bola);
            
        }else {
            JOptionPane.showMessageDialog(null, "Pilihan tidak ada");
        } 
        System.exit(0);
    }
}
