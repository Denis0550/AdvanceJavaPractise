package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerEx {
    public static void printPlayerList(List<Player> tempList){
        for(Player p : tempList){
            System.out.println(p.name +" | "+ p.goals);
        }
    }

    public static void main(String[] args) {
        Player player1 = new Player("Wayne Rooney", 253);
        Player player2 = new Player("Paul Scholes", 155);
        Player player3 = new Player("David Beckham", 85);
        Player player4 = new Player("Roy Keane", 51);
        Player player5 = new Player("Ole Gunnar Solskjaer", 126);

        List<Player> playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
        playerList.add(player5);

        printPlayerList(playerList);
        System.out.println("######################################");
        Collections.sort(playerList);
        printPlayerList(playerList);


    }
}
