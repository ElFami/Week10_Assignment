package Model;

public class Order {
    private String id;
    private Barang barang;
    private int jumlah;
    private double total;
    private static int totalOrder = 0;

    public Order(Barang barang, int jumlah) {
        this.barang = barang;
        this.jumlah = jumlah;
        this.total = barang.getHargaJual() * jumlah;
        totalOrder++;

        String prefix = (barang instanceof Handphone) ? "OH" : "OV";
        this.id = prefix + (totalOrder - 1);
    }

    public String getId() {
        return id;
    }

    public Barang getBarang() {
        return barang;
    }

    public String getNamaBarang() {
        if (barang instanceof Voucher) {
            return barang.getNama() + " " + String.format("%.0f", barang.getHarga());
        } else {
            return barang.getNama();
        }
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getTotal() {
        return total;
    }

    public String getDetailOrder() {
        return "ID    : " + id + "\n" +
                "Nama  : " + getNamaBarang() + "\n" +
                "Jumlah: " + jumlah + "\n" +
                "Total : " + String.format("%.0f", total);
    }
}