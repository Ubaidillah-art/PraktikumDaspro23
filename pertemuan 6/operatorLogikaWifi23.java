import java.util.Scanner;
public class operatorLogikaWifi23 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean mahasiswa;
    boolean dosen;
    boolean akunDiblokir;

    System.out.print("Apakah penggguna mahasiswa? (true/false)");
    mahasiswa = sc.nextBoolean();
    System.out.print("Apakah penggguna dosen? (true/false)");
    dosen = sc.nextBoolean();
    System.out.print("Apakah Akun sedang diblokir? (true/false)");
    akunDiblokir = sc.nextBoolean();
    
    if ((mahasiswa || dosen) && !akunDiblokir) {
        System.out.println("Akses Wifi Diberikan");
    }else{
        System.out.println("Akses Wifi Ditolak");
    }
    sc.close();
    }
}
