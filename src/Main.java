public class Main {

    public static void main(String[] args) {

	IPerson person = new Ogrenci("Can","olcay", 345L);
    KişiselUlasimKarti dijitalKart= new KişiselUlasimKarti(person,123L,true);
    dijitalKart.bakiyeEkle(100);
    dijitalKart.ücretOde(100);

    IPerson person1 = new Memur("memur","deneme",123L);
    KişiselUlasimKarti memurkarti = new KişiselUlasimKarti(person1,1234L,false);
    memurkarti.bakiyeEkle(-10);
    memurkarti.ücretOde(100);


    IPerson person2 = new Yasli("ayşe","demir",456L);
    KişiselUlasimKarti yaslikarti = new KişiselUlasimKarti(person2,435L,true);
    yaslikarti.bakiyeEkle(150);
    yaslikarti.ücretOde(100);


    AnonimUlasimKarti anonimUlasimKarti = new AnonimUlasimKarti(789L);
    anonimUlasimKarti.bakiyeEkle(200);
    anonimUlasimKarti.ücretOde(100);


    IPerson person4 = new Memur("memur","deneme",123L);
    KişiselUlasimKarti memurkarti1 = new KişiselUlasimKarti(person4,756L,false);
    memurkarti.bakiyeEkle(200);
    memurkarti.ücretOde(100);

    }
}
