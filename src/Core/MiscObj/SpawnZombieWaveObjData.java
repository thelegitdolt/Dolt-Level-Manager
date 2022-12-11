package Core.MiscObj;

import Core.Zombies.Zombie;
import java.util.ArrayList;

public class SpawnZombieWaveObjData {
    private final String ZombieSpawnPattern;
    private final ArrayList<Zombie> Zombies;
    private final Condition ForcedCondition;
    private final int AdditionalPlantfood;

    public SpawnZombieWaveObjData(String zombieSpawnPattern, ArrayList<Zombie> zombies, Condition forcedCondition, int additionalPlantfood) {
        ZombieSpawnPattern = zombieSpawnPattern;
        Zombies = zombies;
        ForcedCondition = forcedCondition;
        AdditionalPlantfood = additionalPlantfood;
    }
}
