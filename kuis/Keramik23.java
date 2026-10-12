package kuis;
import java.util.Scanner;
public class Keramik23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ukuranKeramik = 0.6 * 0.6;
        int panjangRuangan, lebarRuangan, jumlahKeramik, jagaJaga, totalKeramik, totalBiaya;
        double luasRuangan;

        System.out.println("Masukkan lebar ruangan anda!(meter)");
        lebarRuangan = sc.nextInt();

        System.out.println("Masukkan panjang ruangan anda!(meter)");
        panjangRuangan = sc.nextInt();

        luasRuangan = panjangRuangan * lebarRuangan;
        jumlahKeramik = (int) (luasRuangan / ukuranKeramik);
        jagaJaga = (int) (jumlahKeramik * 0.1);
        totalKeramik = jumlahKeramik + jagaJaga;
        totalBiaya = totalKeramik * 45000;

        System.out.println("Total biaya belanja keramik untuk ruangan anda adalah Rp " + totalBiaya);
        sc.close();
    }
}
