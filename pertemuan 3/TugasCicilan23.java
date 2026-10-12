import java.util.Scanner;
public class TugasCicilan23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x, y, z;
        double sisa_harga, bunga, cicilan_pokok, cicilan_bulanan;
        
        System.out.println("Masukkan harga laptop!");
        x = input.nextInt();
        System.out.println("Masukkan uang muka!");
        y = input.nextInt();
        System.out.println("Berapa bulan waktu menyicil?");
        z = input.nextInt();

        sisa_harga = x - y;
        bunga = 0.02 * sisa_harga;
        cicilan_pokok = sisa_harga + bunga;
        cicilan_bulanan = cicilan_pokok / z;

        System.out.println("jumlah cicilan yang perlu dibayar setiap bulan adalah : ");
        System.out.println(cicilan_bulanan);
        input.close();
    }
}