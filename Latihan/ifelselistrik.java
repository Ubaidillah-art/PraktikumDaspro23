import java.util.Scanner;
public class ifelselistrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kodeDaya, pemakaianListrik, biayaPemakaian, biayaAdmin, ppn, totalBayar;
        String kategoriDaya = "";
        System.out.println("\n--- SISTEM TAGIHAN LISTRIK PERUMAHAN ---");
        System.out.print("Masukkan kode daya (1 = 900 VA, 2 = 1.300 VA) : ");
        kodeDaya = sc.nextInt();
        if (kodeDaya != 1 && kodeDaya != 2){
            System.out.println("!! KODE YANG ANDA MASUKKAN INVALID !!");
            sc.close();
            return;
        }
        System.out.print("Masukkan pemakaian listrik (kWh) : ");
        pemakaianListrik = sc.nextInt();
        if (pemakaianListrik < 0) {
            System.out.println("!! DATA YANG ANDA MASUKKAN INVALID !!");
            sc.close();
            return;
        }
        if (kodeDaya == 1) {
            kategoriDaya = "900 VA";
            biayaPemakaian = 1350*pemakaianListrik;
            biayaAdmin = 20000;
        }else {
            kategoriDaya = "1.300 VA";
            biayaPemakaian = 1450*pemakaianListrik;
            biayaAdmin = 30000;
        }
        if (pemakaianListrik > 500) {
            ppn = biayaPemakaian*10/100;
        }else{
            ppn = 0;
        }
        totalBayar = biayaPemakaian+ppn+biayaAdmin;
        System.out.println("\nDetail Tagihan Listrik :");
        System.out.println("Kategori daya     : "+kategoriDaya);
        System.out.println("Pemakaian Listrik : "+(double)pemakaianListrik+" kWh");
        System.out.println("Biaya Pemakaian   : Rp. "+biayaPemakaian);
        System.out.println("PPN (10%)         : Rp. "+ppn);
        System.out.println("Biaya Admin       : Rp. "+biayaAdmin);
        System.out.println("Total Bayar       : Rp. "+totalBayar);
        sc.close();
    }
}