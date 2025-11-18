import Model.*;

public class Main {
    public static void main(String[] args) {

        Barang[] daftarBarang = new Barang[5];

        daftarBarang[0] = new Handphone("Samsung Note 9", 4000000, 10, "Hitam");
        daftarBarang[1] = new Handphone("iPhone", 12000000, 5, "Silver");
        daftarBarang[2] = new Voucher("Google Play", 100000, 20, 0.10);
        daftarBarang[3] = new Voucher("Steam Wallet", 120000, 15, 0.08);

        for (Barang b : daftarBarang) {
            if (b != null) {
                System.out.println(b.getDetailBarang());
                System.out.println("--------------------");
            }
        }
    }
}
