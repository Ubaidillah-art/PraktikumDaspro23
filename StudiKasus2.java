import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        String nama = "";
        String jenisKegiatan = "";
        int juara, dokumen, statusPendanaan;
        System.out.print("Nama Mahasiswa    : ");
        nama = sc.next();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA)  : ");
        jenisKegiatan = sc.next();
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Masukkan Peringkat Juara : ");
            juara = sc.nextInt();
            System.out.print("Jumlah dokumen yang diupload : ");
            dokumen = sc.nextInt();
            if (juara > 0 && juara <= 3) {
                if (dokumen > 0 && dokumen == 4) {
                System.out.println("Status : Dana diberikan");
                }else{
                System.out.println("Dokumen tidak lengkap ( kurang "+(4-dokumen)+" dokumen ), Dana tidak diberikan");
                }
            }else{
                System.out.println("Dana tidak diberikan");
            }
        }
        sc.close();
    }
}
