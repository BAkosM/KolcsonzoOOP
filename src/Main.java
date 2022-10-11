import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Kolcsonozheto> katalogus = new ArrayList<Kolcsonozheto>();
    static List<Dvd> dvdk = new ArrayList<Dvd>();
    public static void main(String[] args) {
        Konyv konyv1 = new Konyv("A gyűrűs úr","R.J.J.Martinez","ABCDE-12345");
        Dvd dvd1 = new Dvd("War Star XIV. rész - A Viszavágók Birodalom",420);
        Dvd dvd2 = new Dvd("War Star XXX. rész - Egy remény de új",690);
        Dvd dvd3 = new Dvd("Maorak the movie",2);
        Ujsag ujsag1 = new Ujsag("Játszó srác",2007,23);

        katalogus.add(konyv1);
        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);
        katalogus.add(ujsag1);
        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);
        System.out.println();

        for (Kolcsonozheto k: katalogus){
            System.out.println(k.megjelenitendoNev()+""+k.meddigKolcsonozheto());            
        }
        Collections.sort(dvdk);
        for (Dvd d: dvdk) {
        System.out.println(d.megjelenitendoNev()+""+d.getHossz());
        }
    }
}