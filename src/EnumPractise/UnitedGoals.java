package EnumPractise;

public enum UnitedGoals {
    WAYNE_ROONEY(253),
    BOBBY_CHARLTON(249),
    DENIS_LAW(237),
    JACK_ROWLEY(237),
    DENNIS_VIOLLET(211),
    GEORGE_BEST(179),
    JOE_SPENCE(168),
    RYAN_GIGGS(168),
    MARK_HUGHES(163),
    PAUL_SCHOLES(163);

    int value;

    UnitedGoals( int value) {
        this.value = value;
        System.out.println("Total goals: " + value);
    }

    int showNumberOfGoals() {
        return value;
    }


}
