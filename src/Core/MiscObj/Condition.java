package Core.MiscObj;

public class Condition {
    private final String Condition;
    private final int Duration;

    public Condition(String condition, int duration) {
        Condition = condition;
        Duration = duration;
    }

    public static Condition New(String cond, int dur) {
        return new Condition(cond, dur);
    }
}
