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

}
