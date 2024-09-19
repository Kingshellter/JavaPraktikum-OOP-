public class Student {
    public String nama, kelas, NIM, TTL, Prodi;
    public int TL, Umur;

    public Student(String _nama, String _NIM, String _kelas, int _TL, int _Umur){
        this.nama =_nama;
        this.NIM = _NIM;
        this.kelas = _kelas;
        this.TL = _TL;
        this.Umur = _Umur;
    }

    public Student(String __nama, String __NIM, String __kelas, String __TTL, String __Prodi){
        this.nama = __nama;
        this.NIM = __NIM;
        this.kelas = __kelas;
        this.TTL = __TTL;
        this.Prodi = __Prodi;
    }

    public void intro(){
        System.out.println("Halo, perkenalkan nama saya " + nama + " dengan NIM " + NIM + " dari kelas " + kelas + ". Saya lahir tahun " + TL + " dan saya sekarang berumur " + Umur + "tahun");
    }

    public void biodata(){
        System.out.println(
            "nama  = " + nama + 
            "\nNIM   = " + NIM +
            "\nkelas = " + kelas +
            "\nTTL   = " + TTL +
            "\nProdi = " + Prodi
        );
    }
}
