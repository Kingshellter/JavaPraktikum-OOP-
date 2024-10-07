public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Kucing ===");
        Hewan tom = new Kucing();
        tom.kegiatan();
        
        System.out.println("\n=== Burung ===");
        Hewan merpati = new Burung();
        merpati.kegiatan();
        
        System.out.println("\n=== Ikan ===");
        Hewan nemo = new Ikan();
        nemo.kegiatan();

    }
}
