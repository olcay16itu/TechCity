public class Memur extends Person implements IPerson{
    public Memur(String ad, String soyad, Long tcNo) {
        super(ad, soyad, tcNo);
    }

    @Override
    public double ucretHesapla(double ucret){
        return (ucret*0.75);
    }
}
