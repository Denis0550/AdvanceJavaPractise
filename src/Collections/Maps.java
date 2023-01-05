package Collections;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

        Map<String, Integer> playerScores = new HashMap<>();
        playerScores.put("David", 1548);
        playerScores.put("Kate", 3542);
        playerScores.put("Sting", 8876);
        playerScores.put("Rob", 1877);
        playerScores.put("Mary", 784);
        playerScores.put("Ste", 1111);
        playerScores.put("Mike", 6684);
        playerScores.put("Nat", 7488);

        System.out.println(playerScores);

        int score1 = playerScores.get("Mary");
        //int score2 = playerScores.get("Perry");
        Integer score2 = playerScores.get("Perry");


        System.out.println(score1);
        System.out.println(score2);
        System.out.println("###########################################");

        System.out.println(playerScores.size());
        playerScores.put("Katrine", 4555);
        System.out.println(playerScores.size());

        Set set1 =playerScores.entrySet();
        Iterator i1 = set1.iterator();

        while (i1.hasNext()) {
            Map.Entry entry = (Map.Entry)i1.next();
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }


    }
}
