package EnumPractise;

public class MainOne {
    public static void main(String[] args) {
        UnitedGoals player = UnitedGoals.valueOf("WAYNE_ROONEY");
        System.out.println("Answer via Enum " + player.showNumberOfGoals());

        player = UnitedGoals.valueOf("PAUL_SCHOLES");
        System.out.println("Answer via Enum " + player.showNumberOfGoals());

        UnitedGoals player2 = UnitedGoals.DENIS_LAW;
        System.out.println(player2);

        Level myVar = Level.MEDIUM;
        System.out.println(myVar);



    }
}
