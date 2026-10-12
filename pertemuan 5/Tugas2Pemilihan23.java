import java.util.Scanner;
public class Tugas2Pemilihan23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- VALIDASI JUMLAH SKS YANG DIAMBIL MAHASISWA ---");
        System.out.print("Berapa SKS yang diambil mahasiswa? ");
        int SKS = sc.nextInt();

        if (SKS > 24) {
            System.out.println("SKS melebihi batas");
        }else {
            System.out.println("KRS valid");
        }
        sc.close();
    }
}
