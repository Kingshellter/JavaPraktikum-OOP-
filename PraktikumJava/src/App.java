public class App {
    public static void main(String[] args) throws Exception {
        Hewan kucing = new Hewan("jhon", "miawmiawni***");
        Hewan ikan = new Hewan("nemo", "blukutuk blukutuk");
        System.out.println("============HEWAN============");
        kucing._kucing();
        ikan._ikan();
        System.out.println("=============================\n");

        System.out.println("===========student===========");
        Student Mahasiswa = new Student("Maulana Gian", "L0123077", "C", 2004, 20);
        Mahasiswa.intro();
        System.out.println("============karmas===========");
        Student Mahasiswa1 = new Student("Maulana Gian", "L0123077", "C", "Klaten, 18-06-2004", "Informatika");
        Mahasiswa1.biodata();
        System.out.println("=============================");

    }
}
