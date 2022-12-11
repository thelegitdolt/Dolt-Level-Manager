package Core.Waves;

import Core.MiscObj.Condition;
import Core.MiscObj.SpawnZombieWaveObjData;
import Core.Util.DUtil;
import Core.Zombies.Zombie;

import java.util.ArrayList;

public class SpawnZombiesWave {
    public static final String STAGGERED_PATTERN = "ZombieSpawnerPatternStaggered";
    private final String[] aliases;
    private transient final int inWave;
    private String objclass = "SpawnZombiesJitteredWaveActionProps";

    private final SpawnZombieWaveObjData objdata;

    public SpawnZombiesWave(String[] name, int inWave, SpawnZombieWaveObjData objdata) {
        this.aliases = name;
        this.inWave = inWave;
        this.objdata = objdata;
    }

    /**
     * For if you want to easily copy waves.
     * Returns a new Wave with a different inWave.
     */
    private SpawnZombiesWave asWave(int inwave) {
        return new SpawnZombiesWave(aliases, inwave, objdata);
    }

    public int getInWave() {
        return inWave;
    }

    public String getAliases() {
        return aliases[0];
    }

    /**
     * Simple constructor that returns a SpawnZombieWave with only Zombies in it.
     */
    public static SpawnZombiesWave New(ArrayList<Zombie> zombies, int inwave){
        return new SpawnZombiesWave(new String[]{"Wave" + inwave + DUtil.getAlphaNumericString(8)}, inwave, new SpawnZombieWaveObjData(null, zombies,null, 0));
    }

    public static SpawnZombiesWave New(ArrayList<Zombie> zombies, int inwave, int PF){
        return new SpawnZombiesWave(new String[]{"Wave" + inwave + DUtil.getAlphaNumericString(8)},
                inwave,
                new SpawnZombieWaveObjData(
                        null,
                        zombies,
                        null,
                        PF)
        );
    }

    public static SpawnZombiesWave StaggeredWave(ArrayList<Zombie> zombies, int inwave, int PF){
        return new SpawnZombiesWave(new String[]{"Wave" + inwave + DUtil.getAlphaNumericString(8)},
                inwave,
                new SpawnZombieWaveObjData(
                        STAGGERED_PATTERN,
                        zombies,
                        null,
                        PF)
        );
    }

    public static SpawnZombiesWave ForcedConditionWave(ArrayList<Zombie> zombies, int inwave, int PF, Condition condition){
        return new SpawnZombiesWave(new String[]{"Wave" + inwave + DUtil.getAlphaNumericString(8)},
                inwave,
                new SpawnZombieWaveObjData(
                        null,
                        zombies,
                        condition,
                        PF)
        );
    }
}
