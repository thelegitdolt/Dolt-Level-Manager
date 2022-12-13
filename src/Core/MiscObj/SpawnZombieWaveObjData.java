package Core.MiscObj;

import Core.Zombies.Zombie;
import java.util.ArrayList;

public class SpawnZombieWaveObjData {
    private String ZombieSpawnPattern;
    private final ArrayList<Zombie> Zombies;
    private Condition ForcedCondition;
    private Integer AdditionalPlantfood;

    public SpawnZombieWaveObjData(String zombieSpawnPattern, ArrayList<Zombie> zombies, Condition forcedCondition, Integer additionalPlantfood) {
        ZombieSpawnPattern = zombieSpawnPattern;
        Zombies = zombies;
        ForcedCondition = forcedCondition;
        AdditionalPlantfood = additionalPlantfood;
    }

    public static SpawnZombieWaveObjData New(ArrayList<Zombie> Zombies) {
        return new SpawnZombieWaveObjData(null, Zombies, null, null);
    }

    public void setPattern (String ZSP) {
        this.ZombieSpawnPattern = ZSP;
    }

    public void setFC (Condition condition) {
        this.ForcedCondition = condition;
    }

    public void setPF (Integer PF) {
        this.AdditionalPlantfood = PF;
    }
}
