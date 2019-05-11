

package pl6;
import java.util.Scanner;
/**
 * PL6.java
 * purpose: Calculates the area of a circle and the volume of a sphere.
 * @author Andika Surya
 * @version 1.0 5/09/2019
 */
public class PL6 {
    
    double jariJari, kelilingLingkaran, volumeLingkaran;/**inisialisai variable*/
    Scanner input = new Scanner(System.in);/**memberi method pada Scanner*/

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

 
     
    public void enter(){
        System.out.println("Enter a radius to use for both a circle");/** mencetak perintah kepada user */
        System.out.print("and a sphere: ");/** mencetak perintah kepada user */
        jariJari=input.nextDouble();/** memberikan akses input kepada user */
        setJariJari(jariJari);/** memberi nilai atau menyiapkan angka yang sudah di input oleh user */
        
        volume v = new volume(); /** memberi method kelas volume */
        volumeLingkaran = v.vol(this);/** memberi nilai pada variable volumeLingkaran dengan cara memaggil method vol() di kelas volume */
        System.out.println("Volume Bola: "+volumeLingkaran);/** mencetak volume bola */
        
        keliling k = new keliling();/**memberi method kelas keliling*/
        kelilingLingkaran = k.kel(this);/** memberi nilai pada variable kelilingLingkaran dengan cara memaggil method kel() di kelas keliling */
        System.out.println("Keliling Lingkaran: "+kelilingLingkaran);/** mencetak k */
    }
   
    
}
