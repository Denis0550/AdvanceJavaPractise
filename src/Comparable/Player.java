package Comparable;

public class Player implements Comparable<Player> {
    String name;
    int goals;

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    @Override
    public int compareTo(Player o) {
        return this.goals - o.goals;
    }
}
