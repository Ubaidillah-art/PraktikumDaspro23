import java.util.Scanner;
public class StudiKasusLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjangTanah, lebarTanah, sisiTaman;
        double diameterKolam =5;
        int luasTanah, luasTaman;
        double luasKolam, jariJari;
        double phi =3.14;
        
        System.out.println("Masukkkan panjang tanah!");
        panjangTanah = input.nextInt();
        System.out.println("Masukkan lebar tanah!");
        lebarTanah = input.nextInt();
        System.out.println("Masukkan sisi taman!");
        sisiTaman = input.nextInt();

        jariJari =diameterKolam/2;
        luasTanah =panjangTanah*lebarTanah;
        luasKolam =phi*jariJari*jariJari;
        luasTaman =sisiTaman*sisiTaman;

        System.out.println("Luas tanah asal pak tono = "+luasTanah);
        System.out.println("Luas kolam pak tono = "+luasKolam);
        System.out.println("Luas taman pak tono = "+luasTaman);
        System.out.println("Luas tanah yang tidak digunakan pak Tono adalah "+(luasTanah-luasTaman-luasKolam));
        input.close();
    } 
}