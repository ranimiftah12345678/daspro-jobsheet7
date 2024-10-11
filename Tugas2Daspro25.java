import java.util.Scanner;
public class Tugas2Daspro25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durasi, totalPembayaran = 0;
        String jenisKendaraan;
        
        while (true) {
            System.out.print("Masukkan durasi parkir (jam) atau 0 untuk keluar: ");
            durasi = scanner.nextInt();
            
            if (durasi == 0) {
                break; 
            }

            System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
            jenisKendaraan = scanner.next();

            int pembayaran = 0;

            if (durasi > 5) {
                pembayaran = 12500; 
            } else {
                if (jenisKendaraan.equalsIgnoreCase("mobil")) {
                    pembayaran = durasi * 3000; 
                } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
                    pembayaran = durasi * 2000; 
                } else {
                    System.out.println("Jenis kendaraan tidak valid.");
                    continue; 
                }
            }

            totalPembayaran += pembayaran;
            System.out.println("Pembayaran untuk durasi " + durasi + " jam dan jenis kendaraan " + jenisKendaraan + ": Rp " + pembayaran);
        }

        System.out.println("Total pembayaran keseluruhan: Rp " + totalPembayaran);
        scanner.close();
    }
}

