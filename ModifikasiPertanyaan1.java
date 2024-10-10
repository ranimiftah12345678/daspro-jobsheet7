import java.util.Scanner;
public class ModifikasiPertanyaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai;
        int lulus = 0, tidakLulus = 0, i;
        i = 1;

        while ( i<=10 ) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai >= 60) {
                lulus++;
            }else {
                tidakLulus++;
            } 
            i++;
        }
        
        System.out.println("Banyak mahasiswa lulus: " + lulus);
        System.out.println("Banyak mahasiswa tidak lulus: " + tidakLulus);
        sc.close();
    }
}

