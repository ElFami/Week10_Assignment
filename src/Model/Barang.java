package Model;

public abstract class Barang {
    private String id;
    private double harga;
    private String nama;
    private int stok;

    private static int nextId = 1;

    public Barang(String nama, double harga, int stok) {
        this.id = "BRG" + nextId++;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double getHargaJual();

    public void minusStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
        }
    }

    public abstract String getDetailBarang();
}
