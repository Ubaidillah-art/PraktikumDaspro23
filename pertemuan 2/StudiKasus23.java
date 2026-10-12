import java.util.Scanner;
public class StudiKasus23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int simpananPensiun, tunjanganAnak, gajiPokok, jmlAnak, tunjangan;

        System.out.println("Masukkan gaji pokok anda!");
        gajiPokok = input.nextInt();
        System.out.println("Masukkan jumlah anak anda!");
        jmlAnak = input.nextInt();
        System.out.println("Masukkan nominal tunjangan per anak!");
        tunjanganAnak = input.nextInt();

        simpananPensiun =gajiPokok/10;
        tunjangan = jmlAnak*tunjanganAnak;

        System.out.println("Gaji pokok anda = "+gajiPokok);
        System.out.println("Tunjangan anak anda = "+tunjanganAnak);
        System.out.println("Potongan untuk simpanan pensiun anda = "+simpananPensiun);
        System.out.println("Gaji bersih anda adalah = "+(gajiPokok+tunjangan-simpananPensiun));
        input.close();
    }
}