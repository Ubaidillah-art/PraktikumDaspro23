import java.util.Scanner;
public class ifelseparkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kodeKendaraan, lamaParkir, biayaParkir = 0;
        String jenisKendaraan = "";
        System.out.println("--- SISTEM PARKIR MALL ONTOSENO ---");
        System.out.print("Masukkan jenis kendaraan (1 = motor, 2 = mobil) : ");
        kodeKendaraan = sc.nextInt();
        System.out.print("Masukkan lama parkir (jam) : ");
        lamaParkir = sc.nextInt();
        if (kodeKendaraan != 1 && kodeKendaraan != 2) {
            System.out.println("Error | Jenis kendaraan tidak valid");
            sc.close();
            return;
        }
        if (lamaParkir <= 0) {
            System.out.println("Error | Lama parkir tidak valid");
            sc.close();
            return;
        }sc.close();
        if (kodeKendaraan == 1) {
            jenisKendaraan = "motor";
           if (lamaParkir > 24 ) {
            biayaParkir = 50000;
           }else if (lamaParkir <= 2) {
            biayaParkir = 3000;
           }else{
            biayaParkir = 3000+(lamaParkir-2)*1500;
           }
        }else if (kodeKendaraan == 2) {
            jenisKendaraan = "mobil";
            if (lamaParkir <= 0){
                System.out.println("Error | Lama parkir tidak valid");
                return;
            }else if (lamaParkir > 24) {
                biayaParkir = 100000;
            }else if (lamaParkir <= 2) {
                biayaParkir = 6000;
            }else{
                biayaParkir = 6000+(lamaParkir-2)*3000;
            }
        }
        System.out.println("\nDetai Pembayaran");
        System.out.println("Jenis Kendaraan : "+jenisKendaraan);
        System.out.println("Lama Parkir (jam) : "+lamaParkir +"jam");
        System.out.println("Total Tarif : "+biayaParkir);
        sc.close();
    }
}