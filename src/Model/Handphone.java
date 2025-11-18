package Model;

public class Handphone extends Barang {
    private String warna;
    private static int totalHandphone = 0;
    private static final double PPN_HP = 0.05;

    public Handphone(String nama, double harga, int stok, String warna) {
        super(nama, harga, stok);
        this.warna = warna;
        totalHandphone++;
    }

    public String getWarna() {
        return warna;
    }

    @Override
    public double getHargaJual() {
        return getHarga() + (getHarga() * PPN_HP);
    }

    @Override
    public String getDetailBarang() {
        return "ID    : " + getId() + "\n" +
                "Nama  : " + getNama() + " " + getWarna() + "\n" +
                "Stok  : " + getStok() + "\n" +
                "Harga : " + String.format("%.0f", getHargaJual());
    }
}
