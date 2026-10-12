import java.util.Scanner;
public class tugas2SeleksiAsisten23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang mendapatkan sanksi akademik? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();
        if (mahasiswaAktif && !sedangDisanksi) {
            System.out.print("Masukkan nilai Dasar Pemrograman (0-100): ");
            double nilaiDaspro = sc.nextDouble();
            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            boolean punyaSertifikat = sc.nextBoolean();
            if (nilaiDaspro >= 80 || punyaSertifikat) {
                System.out.println("\nAnda lolos ke tahap wawancara.");
                System.out.print("Masukkan nilai wawancara (0-100): ");
                double nilaiWawancara = sc.nextDouble();
                if (nilaiWawancara >= 75) {
                    System.out.println("\nAnda diterima sebagai Asisten Praktikum.");
                } else {
                    System.out.println("\ngagal! nilai wawancara kurang dari 75.");
                }
            } else {
                System.out.println("\ngagal: Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi.");
            }
        } else {
            System.out.println("\ngagal: Status mahasiswa tidak aktif atau sedang mendapatkan sanksi akademik.");
        }
        sc.close();
    }
}