import java.util.Scanner;
public class ModifikasiFor25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlLulus=0, jmlTidakLulus=0;
        double nilai, tertinggi = 0, terendah = 100 ;

        for (int i=1; i<= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }if (nilai < terendah){
                terendah = nilai;
            }if (nilai >= 60){
                jmlLulus++;
            }else {
                jmlTidakLulus++;
            }
        }
        
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("jumlah mahasiswa lulus: " + jmlLulus);
        System.out.println("jumlah mahasiswa tidak lulus: " + jmlTidakLulus);
        sc.close();
    }
}

