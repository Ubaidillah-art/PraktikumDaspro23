import java.util.Scanner;
public class biayalaundry {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int beratCucian, tarifPerKilo=0, totalBiaya=0;
        System.out.println("--- PROGRAM MENGHITUNG BIAYA LAUNDRY ---");
        System.out.print("Masukkan berat cucian anda (kg)");
        beratCucian=sc.nextInt();
        if (beratCucian<3 && beratCucian>0) {
            tarifPerKilo = 7000;
            totalBiaya = beratCucian*7000;
        }else if (beratCucian>=3 && beratCucian<=6) {
            tarifPerKilo = 6000;
            totalBiaya = 6000*beratCucian;
        }else if (beratCucian>6) {
            tarifPerKilo=5000;
            totalBiaya=beratCucian*5000;
        }else{
            System.out.println("Berat cucian laundry anda tidak valid");
        }
        System.out.println("\nBerat cucian pakaian anda sebesar : "+beratCucian +" kg");
        System.out.println("Per kilo cucian anda dikenakan tarif Rp. "+tarifPerKilo);
        System.out.println("Total biaya laundry anda sebesar Rp. "+totalBiaya);
        sc.close();    
    }
}