class Pekerja2 {
    public Pekerja2(){}

    public void tanyaIdentitas(){
        System.out.println("Saya pekerja biasa");
    }
}

class CEO2 extends Pekerja{
    public CEO2(){}
    public void tanyaIdentitas(){
        System.out.println("Saya seorang CEO");
    }
    public void tanyaPendapatan(){
        System.out.println("Pendapatan saya 100 juta");
    }
}

class Karyawan2 extends Pekerja{
    public Karyawan2(){}
    public void tanyaIdentitas(){
        System.out.println("Saya seorang karyawan");
    }
}

public class Downcasting {
    public static void main(String[] args) {
        CEO2 c = new CEO2();
        Pekerja p = new CEO();
        c = (CEO2)p;
        c.tanyaPendapatan();
    }
}
