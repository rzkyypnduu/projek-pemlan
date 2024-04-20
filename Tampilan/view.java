package Tampilan;
import Transaksi.tKaryawan;
import Transaksi.tMobil;
import java.util.Scanner;

public class view {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== FILKOM APPS ===");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Tampilkan Data Karyawan");
            System.out.println("3. Hapus Karyawan");
            System.out.println("4. Update Data Karyawan");
            System.out.println("====================");
            System.out.println("5. Tambah Mobil");
            System.out.println("6. Tampilkan Data Mobil");
            System.out.println("7. Hapus Mobil");
            System.out.println("8. Update Data Mobil");
            System.out.println("9. Keluar");
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
                    tMobil.tambahMobil(input);
                    break;
                case 6:
                    tMobil.tampilkanData();
                    break;
                case 7:
                    tMobil.hapusMobil(input);
                    break;
                case 8:
                    tMobil.updateMobil(input);
                    break;
                case 9:
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