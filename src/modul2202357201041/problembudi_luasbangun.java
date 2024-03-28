/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2202357201041;

import javax.swing.JOptionPane;
        
public class problembudi_luasbangun {
    
    public static double LuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;   
    }
    
    public static double LuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;   
    }
    public static double LuasLingkaran(double jarijari) {
         return Math.PI * Math.pow(jarijari, 2);
    }
    
    public static void main(String[] args) {
        
       double panjangpersegipanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan panjang persegi panjang: "));
       double lebarPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan lebar persegi panjang: "));
       double luaspersegipanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan luas persegi panjang: "));
       JOptionPane.showMessageDialog(null, "Luas Persegi panjang: " + luaspersegipanjang);
       System.out.println("Luas Persegi Panjang: " + luaspersegipanjang);
        
       double alassegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukan alas segitiga: "));
       double tinggisegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukan tinggi segitiga: "));
       double luassegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukan luas segitiga: "));
       JOptionPane.showMessageDialog(null, "Luas segitiga: " + luassegitiga);
       System.out.println("Luas segitiga: " + luassegitiga);
       
       double jariJarilingkaran= Double.parseDouble(JOptionPane.showInputDialog("Masukan jari-jari lingkaran: "));
       double luaslingkaran = Double.parseDouble(JOptionPane.showInputDialog("Masukan luas lingkaran: "));
       JOptionPane.showMessageDialog(null, "Luas lingkaran: " + luaslingkaran);
       System.out.println("Luas lingkaran: " + luaslingkaran);
       
    }
            
          
    
}
