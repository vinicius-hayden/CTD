import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Program {

    public static void main(String[] args) {

        // It's an interface
//        List ourList = new ArrayList();
//
//        ourList.add("Felipe");
//        ourList.add("Julia");
//        ourList.add("Jade");
//        ourList.add("Natashy");
//        ourList.add("Bruno");
//
//        System.out.println("Iterating our list with FOR");
//
//        int i = 0;
//        for (i=0;i<ourList.size();i++) {
//            System.out.println(ourList.get(i));
//        }
//
//        System.out.println("Iterating our list with the ITERATOR");
//
//        Iterator iterator = ourList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        System.out.println("Iterating our list with For Each");
//
//        for (Object obj: ourList){
//            System.out.println(obj);
//        }
//
//        Set hs2 = new LinkedHashSet();
//
//        hs2.add("Felipe");
//        hs2.add("Julia");
//        hs2.add("Jade");
//        hs2.add("Natashy");
//        hs2.add("Bruno");
//
//        for (Object obj: hs2){
//            System.out.println(obj);
//        }

//        Set hs3 = new TreeSet();
//
//        hs3.add("Felipe");
//        hs3.add("Julia");
//        hs3.add("Jade");
//        hs3.add("Natashy");
//        hs3.add("Bruno");
//
//        for (Object obj: hs3){
//            System.out.println(obj);
//        }

        System.out.println("Hashmap");

        Map hashmap = new HashMap();
        hashmap.put(123, "Marcelo");
        hashmap.put(456, "Felipe");
        hashmap.put(321, "Bruno");
        hashmap.put(654, "Natashy");

        System.out.println("Searching for the key 654: ");
        System.out.println(hashmap.get(654));

        System.out.println("Iterating the HashMap: ");
        for (Object obj: hashmap.values()) {
            System.out.println(obj);
        }

    }

}
