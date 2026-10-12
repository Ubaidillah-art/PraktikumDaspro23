import java.util.Scanner;
public class MenghitungLuasPersegiPanjang {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int panjang;
    int lebar;
    int luas;

    System.out.println("Masukkan nilai panjang!");
    panjang=sc.nextInt();
    System.out.println("Masukkan nilai lebar!");
    lebar=sc.nextInt();

    luas=panjang*lebar;
    System.out.println("Luas persegi panjang adalah "+luas);
    sc.close();
    }
}