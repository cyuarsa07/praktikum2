/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungkeramik;

/**
 *
 * @author Chiesa Yuarsa
 */
public class HitungKeramik {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Keramik p1 = new Keramik(100);
        //Keramik A
        System.out.println("Keramik A");
        System.out.println("Ukuran : 30 cm x 30 cm");
        System.out.println("Untuk luas lantai 100m Total Harga Rp" + p1.keramikA());
        System.out.println("--------------------------------------------------------");
        //keramik B
        System.out.println("Keramik B");
        System.out.println("Ukuran : 40 cm x 40 cm");
        System.out.println("Untuk luas lantai 100m Total Harga Rp" + p1.keramikB());
        System.out.println("--------------------------------------------------------");
        //keramik C
        System.out.println("Keramik C");
        System.out.println("Ukuran : 30 cm x 40 cm");
        System.out.println("Untuk luas lantai 100m Total Harga Rp" + p1.keramikC());
        System.out.println("--------------------------------------------------------");
    }
}
