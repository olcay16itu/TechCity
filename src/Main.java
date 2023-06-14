public class Main {

    public static void main(String[] args) {
	IPerson person = new Ogrenci("Can","olcay", 12345L);
    KişiselUlasimKarti dijitalKart= new KişiselUlasimKarti(person,123L,true);
    dijitalKart.bakiyeEkle(100);
    dijitalKart.ücretOde(100);
    }
}
