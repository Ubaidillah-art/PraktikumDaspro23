import java.util.Scanner;
public class seragamkuliah {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      boolean seragam;
      System.out.print("Masukkan kode hari : ");
      int kodeHari=sc.nextInt();
      switch (kodeHari) {
            case 1:
                System.out.print("Pakai seragam? (true/false) ");
                seragam = sc.nextBoolean();
                if (seragam) {
                    System.out.println("Seragam sesuai, boleh mengikuti kelas");
                }else {
                    System.out.println("Seragam tidak sesuai, dapat sanksi dan tidak boleh mengikuti kelas");
                }
                break;
            case 2:
                System.out.print("Pakai seragam? (true/false) ");
                seragam = sc.nextBoolean();
                if (seragam) {
                    System.out.println("Seragam sesuai, boleh mengikuti kelas");
                }else {
                    System.out.println("Seragam tidak sesuai, dapat sanksi dan tidak boleh mengikuti kelas");
                }
                break;
            case 3:
                System.out.println("Boleh memakai pakaian bebas yang rapi dan sopan");
                break;
            case 4:
                System.out.println("Boleh memakai pakaian bebas yang rapi dan sopan");
                break;
            case 5:
                System.out.print("Pakai seragam? (true/false) ");
                seragam = sc.nextBoolean();
                if (seragam) {
                    System.out.println("Seragam sesuai, boleh mengikuti kelas");
                }else {
                    System.out.println("Seragam tidak sesuai, dapat sanksi dan tidak boleh mengikuti kelas");
                }
                break;
            case 6:
                System.out.println("Tidak ada perkuliahan di hari ini");
                break;
            case 7:
                System.out.println("Tidak ada perkuliahan di hari ini");
                break;
            default:
                System.out.println("Kode hari tidak valid");
                break;
        }
      sc.close();
    }
}
