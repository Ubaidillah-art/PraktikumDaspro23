import java.util.Scanner;
public class TugasAntrean23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode layanan (1-4): ");
        int kodeLayanan = sc.nextInt();
        switch (kodeLayanan) {
            case 1:
                System.out.println("Layanan : Legalisir Ijazah");
                System.out.println("Loket   : Loket A");
                break;
            case 2:
                System.out.println("Layanan : Surat Keterangan Aktif Kuliah");
                System.out.println("Loket   : Loket B");
                break;
            case 3:
                System.out.println("Layanan : Pembayaran UKT");
                System.out.println("Loket   : Loket C");
                break;
            case 4:
                System.out.println("Layanan : Pengajuan Cuti Akademik");
                System.out.println("Loket   : Loket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }
        sc.close();
    }
}