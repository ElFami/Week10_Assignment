class Pekerja {
    public Pekerja(){}

    public void tanyaIdentitas(){
        System.out.println("Saya pekerja biasa");
    }
}

class CEO extends Pekerja{
    public CEO(){}
    public void tanyaIdentitas(){
        System.out.println("Saya seorang CEO");
    }
}

class Karyawan extends Pekerja{
    public Karyawan(){}
    public void tanyaIdentitas(){
        System.out.println("Saya seorang karyawan");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja();
        pekerja.tanyaIdentitas();

        CEO ceo = new CEO();
        ceo.tanyaIdentitas();

        Karyawan karyawan = new Karyawan();
        pekerja = (Pekerja)karyawan;
        pekerja.tanyaIdentitas();
    }
}
