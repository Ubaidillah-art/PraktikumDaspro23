import java.util.Scanner;
public class sistemloginLMSkampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahLogin;
        System.out.print("masukkan password anda! ");
        String password = sc.next();
        System.out.print("masukkan status perangkat anda! (true/false) ");
        boolean statusPerangkat = sc.nextBoolean();
        if (password.equals("daspro2026")) {
            if (statusPerangkat) {
                System.out.println("Login Berhasil");
            }else{
                System.out.println("kode OTP telah dikirimkan ke email anda");
            }
            sc.close();
            return;
        }else {
            System.out.print("berapa kali anda login? ");
            jumlahLogin=sc.nextInt();
            if (jumlahLogin>=2){
               System.out.println("Akun anda dikunci selama 15 menit"); 
            }else{
                System.out.println("Password salah, silahkan coba lagi");
            }
        }
        sc.close();
    }
}
