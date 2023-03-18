/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasKelPertama;

/**
 *
 * @author ASUS
 */
import java.io.IOException;
import java.util.Scanner;

public class TugasKelompokPertama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi variabel

        String NamaPemesan;
        Double NasGor = 9999.99,
                AyamBakar = 12345.67,
                SteakSirloin = 21108.40,
                Kwetiaw = 13579.13,
                KambingGuling = 98763.43,

                JmlOrang,
                JmlPesanNasGor,
                JmlPesanAyamBakar,
                JmlPesanSteakSirloin,
                JmlPesanKwetiaw,
                JmlPesanKambingGuling,

                hrgNasgor,
                hrgAyamBakar,
                hrgSteakSirloin,
                hrgKwetiaw,
                hrgKambingGuling,

                totalHarga,
                diskon = 0.10,
                totalDiskon,
                totalHargaSetelahDiskon,
                totalBayarMasingMasing;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                  TK1 - Aplikasi Pemesanan - Kelompok 4 ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Anggota Kelompok 4");
        System.out.println("1. BAYU TIRTA SUKMANA");
        System.out.println("2. FIOREL AL ZAHRA");
        System.out.println("3. YUDHA DWIPRIATMA");
        System.out.println("4. CHATLEA CINTA PUTRI WIDYANTO");
        System.out.println(" ");

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("                    Selamat Datang di Restoran BUNGAR");

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println(" ");

        System.out.print("Pesanan Atas Nama: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        NamaPemesan = keyboard.nextLine();
        // Tampilkan output lagi
        System.out.print("Pesan Untuk Berapa Orang: ");
        // menggunakan scanner lagi
        JmlOrang = keyboard.nextDouble();

        // Menampilkan Menu dan Harga
        System.out.println(" ");
        System.out.println("                             Menu Spesial Hari Ini");
        System.out.println("===============================================================================");
        System.out.println(" ");
        System.out.println("1. Nasi Goreng Spesial " + "@" + " " + "Rp." + " " + NasGor);
        System.out.println("2. Ayam Bakar Spesial " + "@" + " " + "Rp." + " " + AyamBakar);
        System.out.println("3. Steak Sirloin Spesial " + "@" + " " + "Rp." + " " + SteakSirloin);
        System.out.println("4. Kwetiaw Siram Spesial " + "@" + " " + "Rp." + " " + Kwetiaw);
        System.out.println("5. Kambing Guling Spesial " + "@" + " " + "Rp." + " " + KambingGuling);
        System.out.println(" ");

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("                                 Pesanan Anda ");

        System.out.println("");
        // Menampilkan Jumlah Pesanan Per-Menu
        System.out.print("1. Nasi Goreng Spesial : ");
        // menggunakan scanner lagi
        JmlPesanNasGor = keyboard.nextDouble();
        System.out.print("2. Ayam Bakar Spesial : ");
        // menggunakan scanner lagi
        JmlPesanAyamBakar = keyboard.nextDouble();
        System.out.print("3. Steak Sirloin Spesial : ");
        // menggunakan scanner lagi
        JmlPesanSteakSirloin = keyboard.nextDouble();
        System.out.print("4. Kwetiaw Siram Spesial : ");
        // menggunakan scanner lagi
        JmlPesanKwetiaw = keyboard.nextDouble();
        System.out.print("5. Kambing Guling Spesial : ");
        // menggunakan scanner lagi
        JmlPesanKambingGuling = keyboard.nextDouble();
        System.out.println("");

        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("                         Selamat Menikmati Makanan Anda ");

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("");
        hrgNasgor = JmlPesanNasGor * NasGor;
        hrgAyamBakar = JmlPesanAyamBakar * AyamBakar;
        hrgSteakSirloin = JmlPesanSteakSirloin * SteakSirloin;
        hrgKwetiaw = JmlPesanKwetiaw * Kwetiaw;
        hrgKambingGuling = JmlPesanKambingGuling * KambingGuling;
        totalHarga = hrgNasgor + hrgAyamBakar + hrgSteakSirloin + hrgKwetiaw + hrgKambingGuling;
        totalDiskon = totalHarga * diskon;
        totalHargaSetelahDiskon = totalHarga - totalDiskon;
        totalBayarMasingMasing = totalHargaSetelahDiskon / JmlOrang;

        // Hitung Pesanan

        System.out.println("Nama Pemesan: " + NamaPemesan);
        System.out.println("Pesanan untuk : " + JmlOrang + " Orang");
        System.out.println("");
        System.out.println("Detail Pembelian :");
        System.out.println("");
        System.out.println(
                "1. Nasi Goreng Spesial " + " " + JmlPesanNasGor + " " + " Porsi" + " " + "x" + " " + "Rp." + " "
                        + NasGor + " " + "=" + " " + "Rp." + " " + hrgNasgor);
        System.out.println(
                "2. Ayam Bakar Spesial " + " " + JmlPesanAyamBakar + " " + " Porsi" + " " + "x" + " " + "Rp." + " "
                        + AyamBakar + " " + "=" + " " + "Rp." + " " + hrgAyamBakar);
        System.out.println(
                "3. Steak Sirloin Spesial " + " " + JmlPesanSteakSirloin + " " + " Porsi" + " " + "x" + " " + "Rp."
                        + " "
                        + SteakSirloin + " " + "=" + " " + "Rp." + " " + hrgSteakSirloin);
        System.out.println(
                "4. Kwetiaw Siram Spesial " + " " + JmlPesanKwetiaw + " " + " Porsi" + " " + "x" + " " + "Rp." + " "
                        + Kwetiaw + " " + "=" + " " + "Rp." + " " + hrgKwetiaw);
        System.out.println(
                "5. Kambing Guling Spesial " + " " + JmlPesanKambingGuling + " " + " Porsi" + " " + "x" + " " + "Rp."
                        + " "
                        + KambingGuling + " " + "=" + " " + "Rp." + " " + hrgKambingGuling);
        System.out.println("===============================================================================");
        System.out.println("");
        System.out.println(" Total Pembelian : " + "Rp." + " " + totalHarga);
        System.out.println(" Diskon 10% (Masa Promosi) : " + "Rp." + " " + totalHarga * diskon);
        System.out.println(" ");

        System.out.println("===============================================================================");
        System.out.println(" Total Pembelian Setelah Diskon 10 %: " + "Rp." + " " + totalHargaSetelahDiskon);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(
                " Pembelian Per orang " + "(untuk " + JmlOrang + " orang)" + " " + "Rp." + " "
                        + totalBayarMasingMasing);
        System.out.println("===============================================================================");

        System.out.println("");
        System.out.println("                    Terimakasih Atas Kunjungan Anda");
        System.out.println("");

        System.out.println("===============================================================================");
        System.out.print("                    ...tekan ENTER untuk keluar...                ");
        
         try{
            System.in.read();
        }catch(IOException ioe) {
            System.exit(0); // Generally used to indicate successful termination.
        }
        System.exit(0);
    }
}
