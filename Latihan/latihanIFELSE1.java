import java.util.Scanner;
public class latihanIFELSE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umur;

        System.out.println("Berapa umur pengunjung?");
        umur = sc.nextInt();
        
        if (umur >= 60) {
            System.out.println("Kategori : Lansia (tiket diskon)");
        }else if (umur >= 13){
            System.out.println("Kategori : Dewasa (tiket normal)");
        }else if (umur >= 6){
            System.out.println("Kategori : Anak-anak (tiket anak)");
        }else if (umur >= 0){
            System.out.println("Kategori : Balita (tiket gratis)");
        }else{
            System.out.println("Umur tidak valid");
        }
        sc.close();
    }

}
