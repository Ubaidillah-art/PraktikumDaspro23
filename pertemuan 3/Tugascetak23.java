import java.util.Scanner;
public class Tugascetak23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, biaya_cetak, total_biaya;

        System.out.println("Berapa lembar dokumen yang akan dicetak?");
        x = input.nextInt();

        biaya_cetak = x*500;
        total_biaya = biaya_cetak + 5000;

        System.out.println("Total biaya cetak adalah "+total_biaya);
        input.close();
    }
}