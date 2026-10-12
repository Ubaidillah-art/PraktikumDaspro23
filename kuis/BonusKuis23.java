package kuis;
import java.util.Scanner;
public class BonusKuis23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int detik, menit, jam;

        System.out.println("Masukkan detik yang ingin dikonversi!");
        detik = sc.nextInt();
        jam = detik / 3600;
        detik %= 3600;
        menit = detik / 60;
        detik %= 60;

        System.out.println("Hasil konversi : " + jam + " jam " + menit + " menit " + detik + " detik");
        sc.close();
    }
}

