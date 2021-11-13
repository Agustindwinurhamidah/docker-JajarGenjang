
import java.util.Scanner;

public class kubus {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int sisi , volume;

        System.out.println(“program perhitungan volume kubus”);

        System.out.println(“masukkan sisi kubus”);

        sisi = sc.nextInt();

               

        volume = (sisi*sisi*sisi);

        System.out.println(“volume kubus adalah "+volume);

    }

}
    

