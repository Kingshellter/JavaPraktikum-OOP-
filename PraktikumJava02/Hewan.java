public class Hewan {
    public String name, voice;

    public Hewan(String _name, String _voice){
        this.name = _name;
        this.voice = _voice;
    }

    public void _kucing(){
        System.out.println("kucing saya bernama " + name + " dan bersuara " + voice);
    }

    public void _ikan(){
        System.out.println("Ikan saya bernama " + name + " dan bersuara " + voice);
    }

    private int tujuan;
    private int kecepatan;
    private int energi;

    public Hewan(int tujuan, int kecepatan, int energi){
        setTujuan(tujuan);
        setKecepatan(kecepatan); 
        setEnergi(energi);
    }

    public void setTujuan(int tujuan){
        this.tujuan = tujuan;
    }

    public int getTujuan(){
        return tujuan;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void setEnergi(int energi){
        this.energi = energi;
    }

    public int getEnergi(){
        return energi;
    }

    public void jalan(){
        while (getEnergi() > 0){
            setTujuan(getTujuan() - getKecepatan());
            setEnergi(getEnergi() - (getKecepatan()/2));
            System.out.println("tujuan = " + getTujuan() + " km, kecepatan = " + getKecepatan() +" km/jam, sisa energi = " + getEnergi());
            if (getTujuan() <= 0){
                System.out.println("sudah sampai tujuan");
                break;
            }
        }

        if (getEnergi() <= 0){
            System.out.print("energi habis");
        }

    }

    public void isiEnergi(int tambahEnergi){
        setEnergi(getEnergi() + tambahEnergi);
        System.out.println("energi terisi sejumlah = " + tambahEnergi + " sisa energi = " + getEnergi());
    }
//edit private memakai set get
//setter getter
}
