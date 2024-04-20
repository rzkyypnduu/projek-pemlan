package Transaksi;

import Model.mobil;
import java.util.ArrayList;
import java.util.Scanner;

public class tMobil {
    private static ArrayList<mobil> listMobil = new ArrayList<>();

    public static int validateTahunKeluaran(Scanner input) {
        while (true) {
            System.out.print("Tahun Keluaran: ");
            if (input.hasNextInt()) {
                int tahunKeluaran = input.nextInt();
                input.nextLine(); // consume the newline character
                if (tahunKeluaran >= 1900 && tahunKeluaran <= 2025) {
                    return tahunKeluaran;
                } else {
                    System.out.println("Input tidak valid. Masukkan tahun keluaran antara 1900 dan 2025.");
                }
            } else {
                System.out.println("Input tidak valid. Masukkan tahun keluaran sebagai bilangan bulat.");
                input.nextLine(); // hapus input yang tidak valid
            }
        }
    }

    public static void tambahMobil(Scanner input) {
        System.out.println("Masukkan data mobil:");
        System.out.print("No. Plat: ");
        String noPlat = input.nextLine();
        System.out.print("Merk Mobil: ");
        String merkMobil = input.nextLine();
        System.out.print("Warna Mobil: ");
        String warnaMobil = input.nextLine();
        int tahunKeluaran = validateTahunKeluaran(input);
        System.out.print("Penyewa: ");
        String penyewa = input.nextLine();

        mobil newMobil = new mobil(noPlat, merkMobil, warnaMobil, tahunKeluaran, penyewa);
        listMobil.add(newMobil);
        System.out.println("Mobil berhasil ditambahkan.");
    }

    public static void hapusMobil(Scanner input) {
        System.out.print("Masukkan No. Plat mobil yang akan dihapus: ");
        String noPlat = input.nextLine();

        for (int i = 0; i < listMobil.size(); i++) {
            if (listMobil.get(i).getNoPlat().equals(noPlat)) {
                listMobil.remove(i);
                System.out.println("Mobil dengan No. Plat " + noPlat + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Mobil dengan No. Plat " + noPlat + " tidak ditemukan.");
    }

    public static void tampilkanData() {
        System.out.println("\nData Mobil:");
        for (mobil mobil : listMobil) {
            System.out.println("-----------------------------");
            System.out.println("No. Plat: " + mobil.getNoPlat());
            System.out.println("Merk Mobil: " + mobil.getMerkMobil());
            System.out.println("Warna Mobil: " + mobil.getWarnaMobil());
            System.out.println("Tahun Keluaran: " + mobil.getTahunKeluaran());
            System.out.println("Penyewa: " + mobil.getPenyewa());
        }
        System.out.println("-----------------------------");
    }

    public static void updateMobil(Scanner input) {
        System.out.print("Masukkan No. Plat mobil yang akan diperbarui: ");
        String noPlat = input.nextLine();

        for (mobil mobil : listMobil) {
            if (mobil.getNoPlat().equals(noPlat)) {
                System.out.println("Masukkan data baru untuk mobil dengan No. Plat " + noPlat + ":");
                System.out.print("Merk Mobil: ");
                mobil.setMerkMobil(input.nextLine());
                System.out.print("Warna Mobil: ");
                mobil.setWarnaMobil(input.nextLine());
                int tahunKeluaran = validateTahunKeluaran(input); // Memanggil metode validateTahunKeluaran
                mobil.setTahunKeluaran(tahunKeluaran);
                System.out.print("Penyewa: ");
                mobil.setPenyewa(input.nextLine());
                System.out.println("Data mobil berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Mobil dengan No. Plat " + noPlat + " tidak ditemukan.");
    }
}