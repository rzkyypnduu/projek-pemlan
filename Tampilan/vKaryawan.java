package Tampilan;
import Transaksi.tKaryawan;
import java.util.Scanner;

public class vKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== FILKOM APPS ===");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Tampilkan Data Karyawan");
            System.out.println("3. Hapus Karyawan");
            System.out.println("4. Update Data Karyawan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            int choice = input.nextInt();
            input.nextLine(); // Membuang newline karakter setelah nextInt()

            switch (choice) {
                case 1:
                    tKaryawan.tambahKaryawan(input);
                    break;
                case 2:
                    tKaryawan.tampilkanData();
                    break;
                case 3:
                    tKaryawan.hapusKaryawan(input);
                    break;
                case 4:
                    tKaryawan.updateKaryawan(input);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
                    break;
            }
        }

        input.close(); // Menutup scanner setelah digunakan
    }
}