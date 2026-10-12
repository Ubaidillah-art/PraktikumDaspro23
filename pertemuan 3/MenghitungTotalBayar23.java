import java.util.Scanner;
public class MenghitungTotalBayar23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        System.out.println("Masukkan harga pakaian yang dibeli!");
        harga=sc.nextInt();
        
        potongan=diskon*harga;
        jml_bayar=harga-potongan;
        System.out.println("Jumlah yang anda harus bayar adalah Rp. "+jml_bayar);
        sc.close();
    }
}