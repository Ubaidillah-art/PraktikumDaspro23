import java.util.Scanner;
public class Tugas1Pemilihan23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean isLunas = sc.nextBoolean();
        
        String pesan = (isLunas) ? "Silahkan cetak KRS" : "Registrasi ditolak";
        System.out.println(pesan);
        sc.close();
    }
}