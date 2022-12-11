package Core.Zombies;

import Core.Zombies.ZombieProperties.ZombieProperties;
import jdk.internal.net.http.common.*;


public class CustomZombie extends Zombie {
    private final Pair<String, ZombieProperties> Type;

    public CustomZombie(Pair<String, ZombieProperties> type, int lane) {
        super(null, lane);
        this.Type = type;
    }
}
