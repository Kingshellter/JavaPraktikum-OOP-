
abstract class Hewan {
    public final void kegiatan() {
        makan();
        bergerak();
        bersuara();
    }
    protected abstract void makan();
    protected abstract void bergerak();
    protected abstract void bersuara();
}

class Kucing extends Hewan {
    @Override
    protected void makan() {
        System.out.println("kucing makan ikan paus");
    }
    @Override
    protected void bergerak() {
        System.out.println("kucing berjalan menggunakan 4 kaki");
    }
    @Override
    protected void bersuara() {
        System.out.println("kucing bersuara miaw miaw");
    }
}


class Burung extends Hewan {
    @Override
    protected void makan(){
        System.out.println("burung makan biji-bijian");
    }
    @Override
    protected void bergerak(){
        System.out.println("burung terbang menggunakan sayap");
    }
    @Override
    protected void bersuara(){
        System.out.println("burung bersuara cihuy");
    }
}

class Ikan extends Hewan {
    @Override
    protected void makan(){
        System.out.println("ikan makan plankton");
    }
    @Override
    protected void bergerak(){
        System.out.println("ikan berenang dengan menggunakan sirip");
    }
    @Override
    protected void bersuara(){
        System.out.println("ikan bersuara blukutuk blukutuk");
    }
}
