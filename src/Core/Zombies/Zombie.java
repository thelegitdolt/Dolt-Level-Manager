package Core.Zombies;

public class Zombie {
    private final String Type;
    /** 6 means random
     *  7 means "previous lane"
     */
    private final int Lane;

    public Zombie(String type, int lane) {
        Type = type;
        Lane = lane;
    }

    public static Zombie New(String type, int lane) {
        return new Zombie(type, lane);
    }

    public static Zombie New(String type) {
        return new Zombie(type, 6);
    }
}
