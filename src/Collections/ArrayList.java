package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<String> names = new java.util.ArrayList<>();
        names.add("John");
        names.add("Mick");
        names.add("Alex");
        names.add("Steven");
        names.add("Ben");
        names.add("Clark");
        names.add("Bob");
        names.add("Robert");

        System.out.println(names);

        names.set(5, "FERDINAND");
        names.add(2,"JACK");

        System.out.println(names);
        System.out.println(names.size());

        names.remove("John");

        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
            System.out.println("iterator: " + i.next());
        }
        for (String efl: names) {
            System.out.println(efl);
        }
        Collections.sort(names);
        System.out.println(names);
        names.sort(Collections.reverseOrder());
        System.out.println(names);

        System.out.println("#############################");
        names.clear();
        System.out.println(names);





    }
}
