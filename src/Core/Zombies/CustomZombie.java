package Core.Zombies;

import Core.Zombies.ZombieProperties.ZombieProperties;
import jdk.internal.net.http.common.*;


public class CustomZombie extends Zombie {
    private final transient Pair<String, ZombieProperties> Props;
    private final String Type;

    public CustomZombie(Pair<String, ZombieProperties> props, String lane) {
        super(null, lane);
        this.Props = props;
        this.Type = "RTID(" + Props.first + "@CurrentLevel)";
    }

    public static CustomZombie New(Pair<String, ZombieProperties> Props) {
        return new CustomZombie(Props, null);
    }

    public static CustomZombie New(Pair<String, ZombieProperties> Props, int lane) {
        String Lane = null;
        if (lane < 4) Lane = String.valueOf(lane);
        else if (lane == 5) Lane = "prev";
        return new CustomZombie(Props, Lane);
    }

    public Pair<String, ZombieProperties> getProps() {
        return Props;
    }

    public String getType() {
        return Type;
    }
}
