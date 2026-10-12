public class ContohTipeData23 {
    public static void main(String[] args) {
        char golonganDarah = 'A';
        byte jarak = (byte) 130;
        short jumlahPendudukDalamSatuDusun = 1025;
        float suhu = 66.5F;
        double berat = 0.987654321;
        long saldo = 666666666;
        int angkaDesimal = 0x10;

        System.out.println("Golongan darah\t: " + (byte) golonganDarah);
        System.out.println("Jarak\t\t: " + jarak);
        System.out.println("Jumlah penduduk dalam satu dusun\t: " + jumlahPendudukDalamSatuDusun);
        System.out.println("Suhu\t\t: " + suhu);
        System.out.println("Berat\t\t: " + (float) berat);
        System.out.println("Saldo\t\t: " + saldo);
        System.out.println("Angka desimal\t: " + angkaDesimal);
    }
}