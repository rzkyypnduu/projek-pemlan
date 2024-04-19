package Transaksi;

import Model.karyawan;
import java.util.ArrayList;
import java.util.Scanner;


public class tKaryawan {
    private static ArrayList<karyawan> listKaryawan = new ArrayList<>();

    private static String getGender(Scanner input) {
        while (true) {
            System.out.print("Jenis Kelamin ('L' untuk Laki-laki, 'P' untuk Perempuan): ");
            String gender = input.nextLine();
            if (gender.equalsIgnoreCase("L") || gender.equalsIgnoreCase("P")) {
                return gender;
            } else {
                System.out.println("Input tidak valid. Masukkan 'L' untuk Laki-laki atau 'P' untuk Perempuan.");
            }
        }
    }

    private static String getCategory(Scanner input) {
        while (true) {
            System.out.print("Kategori ('travel' untuk Supir Travel, 'rent' untuk Supir Rental, 'admin' untuk Staff Admin): ");
            String category = input.nextLine();
            if (category.equalsIgnoreCase("travel") || category.equalsIgnoreCase("rent") || category.equalsIgnoreCase("admin")) {
                return category;
            } else {
                System.out.println("Input tidak valid. Masukkan 'travel' untuk Supir Travel, 'rent' untuk Supir Rental, atau 'admin' untuk Staff Admin.");
            }
        }
    }

    public static void tambahKaryawan(Scanner input) {
        System.out.println("Masukkan data karyawan:");
        System.out.print("Nama: ");
        String name = input.nextLine();
        System.out.print("Alamat: ");
        String address = input.nextLine();
        System.out.print("ID: ");
        String id = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("No. HP: ");
        String phone = input.nextLine();
        String gender = getGender(input); 
        String category = getCategory(input);

        karyawan newKaryawan = new karyawan(name, address, id, email, phone, gender, category);
        listKaryawan.add(newKaryawan);
        System.out.println("Karyawan berhasil ditambahkan.");
    }

    public static void tampilkanData() {
        System.out.println("\nData Karyawan:");
        for (karyawan karyawan : listKaryawan) {
            System.out.println("-----------------------------");
            System.out.println("Nama: " + karyawan.getName());
            System.out.println("Alamat: " + karyawan.getAddress());
            System.out.println("ID: " + karyawan.getId());
            System.out.println("Email: " + karyawan.getEmail());
            System.out.println("No. HP: " + karyawan.getPhone());
            System.out.println("Jenis Kelamin: " + karyawan.getGender());
            System.out.println("Kategori: " + karyawan.getCategory());
        }
        System.out.println("-----------------------------");
    }

    public static void hapusKaryawan(Scanner input) {
        System.out.print("Masukkan ID karyawan yang akan dihapus: ");
        String id = input.nextLine();

        for (int i = 0; i < listKaryawan.size(); i++) {
            if (listKaryawan.get(i).getId().equals(id)) {
                listKaryawan.remove(i);
                System.out.println("Karyawan dengan ID " + id + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Karyawan dengan ID " + id + " tidak ditemukan.");
    }


    public static void updateKaryawan(Scanner input) {
        System.out.print("Masukkan ID karyawan yang akan diperbarui: ");
        String id = input.nextLine();

        for (karyawan karyawan : listKaryawan) {
            if (karyawan.getId().equals(id)) {
                System.out.println("Masukkan data baru untuk karyawan dengan ID " + id + ":");
                System.out.print("Nama: ");
                karyawan.setName(input.nextLine());
                System.out.print("Alamat: ");
                karyawan.setAddress(input.nextLine());
                System.out.print("Email: ");
                karyawan.setEmail(input.nextLine());
                System.out.print("No. HP: ");
                karyawan.setPhone(input.nextLine());
                System.out.print("Jenis Kelamin: ");
                karyawan.setGender(input.nextLine());
                System.out.print("Kategori: ");
                karyawan.setCategory(input.nextLine());
                System.out.println("Data karyawan berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Karyawan dengan ID " + id + " tidak ditemukan.");
    }
}