/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2202357201041;

/**
 *
 * @author user
 */
public class Modul2202357201041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int bil = 10;
        String b[] = {"a", "b", "c"};
        try {
            System.out.println(bil / 0);
            System.out.println(b[3]);
        } catch (ArithmeticException ai) {
            System.out.println("Eror Aritmetik ");
            System.out.println(ai.getMessage());
        }catch (ArrayIndexOutOfBoundsException n) {
            System.out.println(n.getMessage());
        }catch (Exception e) {
            System.out.println("Ada error");
            System.out.println(e.getMessage());
        }
    }
    
}
