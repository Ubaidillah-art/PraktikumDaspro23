import java.util.Scanner;
public class tugas2DiskonBuku {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int kodeBuku, hargaAwal, jumlahBuku, totalBayar;
    double diskon = 0;
    String jenisBuku = "";
    System.out.print("Apakah Anda Membeli Buku Hari Rabu? (true/false) ");
    boolean rabu = sc.nextBoolean();
    if (rabu) {
        System.out.print("Masukkan Kode Buku : (1 = kamus, 2 = novel, 3 = lain-lain) ");
        kodeBuku = sc.nextInt();
        System.out.print("Masukkan Harga Awal buku! ");
        hargaAwal = sc.nextInt();
        System.out.print("Masukkan Jumlah Buku yang dibeli! ");
        jumlahBuku = sc.nextInt();
        if (kodeBuku != 1 && kodeBuku != 2 && kodeBuku != 3) {
            System.out.println("KODE YANG ANDA MASUKKAN INVALID");
            sc.close();
            return;
        }
        if (kodeBuku == 1 && jumlahBuku > 2) {
            jenisBuku = "Kamus";
            diskon = hargaAwal*0.02 + hargaAwal*0.10;
        }else if (kodeBuku == 1 && jumlahBuku <= 2) {
            diskon = hargaAwal*0.10;
        }else if (kodeBuku == 2 && jumlahBuku > 3) {
            jenisBuku = "Novel";
            diskon = hargaAwal*0.07 + hargaAwal*0.02;
        }else if (kodeBuku == 2 && jumlahBuku <= 3) {
            diskon = hargaAwal*0.07 + hargaAwal*0.01;
        }else if (kodeBuku == 3 && jumlahBuku > 3) {
            jenisBuku = "lain-lain"; 
            diskon = hargaAwal*0.05;
        }
        totalBayar = hargaAwal - (int) diskon;
        System.out.println("\nJenis Buku               : "+jenisBuku);
        System.out.println("Jumlah Buku              : "+jumlahBuku);
        System.out.println("Harga Awal Buku          : "+hargaAwal);
        System.out.println("Diskon                   : "+diskon);
        System.out.println("Total Yang Harus Dibayar : "+totalBayar);
        sc.close(); 
    }else{
        System.out.println("Tidak Ada Potongan Untuk Hari Ini");
    }  
}  
}