package Model;

public class Voucher extends Barang {
    private double pajak;
    private static int totalVoucher = 0;

    public Voucher(String nama, double harga, int stok, double pajak) {
        super(nama, harga, stok);
        this.pajak = pajak;
        totalVoucher++;
    }

    public double getPajak() {
        return pajak;
    }

    @Override
    public double getHargaJual() {
        return getHarga() + (getHarga() * pajak);
    }

    @Override
    public String getDetailBarang() {
        return "ID     : " + getId() + "\n" +
                "Nama   : " + getNama() + "\n" +
                "Nominal: " + String.format("%.0f", getHarga()) + "\n" +
                "Stok   : " + getStok() + "\n" +
                "Harga  : " + String.format("%.0f", getHargaJual());
    }
}
