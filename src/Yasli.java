public class Yasli extends Person implements IPerson{
    public Yasli(String ad, String soyad, Long tcNo) {
        super(ad, soyad, tcNo);
    }
    public double ucretHesapla(double ucret){
        return (ucret*0.50);
    }
}
