import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        LinkedHashSet  lhset = new LinkedHashSet();
        lhset.add("Egemen ");
        lhset.add("gizem ");
        lhset.add("Naz Ecem ");
        lhset.add("Tekkanat");
        lhset.add("Bilgisayar");
        lhset.add("Egemen");

        Iterator i = lhset.iterator();

        while(i.hasNext()){
            System.out.println("Koleksiyon Ögeleri :" + i.next());
        }



    }
}