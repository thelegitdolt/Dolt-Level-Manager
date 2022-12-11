package Core.Zombies;

public class Zombie {
    private final String Type;
    private final String Lane;

    public Zombie(String type, String lane) {
        Type = type;
        Lane = lane;
    }

    public static Zombie FromString(String type, String lane) {
        return new Zombie("RTID(" + type + "@ZombieTypes)", lane);
    }
    public static Zombie New(String type, int lane) {
        String hi = null;
        if (lane < 5) {
            hi = String.valueOf(lane);
        }
        else if (lane == 5){
            hi = "prev";
        }
        return new Zombie("RTID(" + type + "@ZombieTypes)", hi);
    }

    public static Zombie New(String type) {
        return new Zombie("RTID(" + type + "@ZombieTypes)", null);
    }

    public String getLane() {
        return Lane;
    }

    public String getType() {
        return Type;
    }
}
