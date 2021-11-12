
package jajargenjang;
import java.util.Scanner;
public class JajarGenjang {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
       Genjang []sdArray=new Genjang[5];
        for(int i=1;i<=5;i++){
       Genjang sd = new Genjang ();
        System.out.print("Masukkan tinggi : ");
        sd.tinggi = sc.nextInt();
        System.out.print("Masukkan panjang : ");
        sd.panjang = sc.nextInt();
        System.out.print("Masukkan sisimiring : ");
        sd.sisimiring = sc.nextInt();
            System.out.println( );
        int seluruh = sd.hitungLuas();
        int luruh = sd.hitungKeliling();
        System.out.println("Luas Jajargenjang adalah :  " + seluruh);
        System.out.println("Keliling Jajargenjang adalah : " + luruh);
            System.out.println( );
    }
}
}
    

