package Core.Zombies;

import Core.MiscObj.Condition;
import Core.MiscObj.SpawnZombieWaveObjData;
import Core.Util.DUtil;

import java.util.ArrayList;

public class SpawnZombiesWave {
    // Staggered Pattern for bowling levels
    public static final String STAGGERED_PATTERN = "ZombieSpawnerPatternStaggered";
    private final String[] name;
    private transient final int inWave;

    private final String objclass;
    private final SpawnZombieWaveObjData objdata;

    public SpawnZombiesWave(String[] name, int inWave, SpawnZombieWaveObjData objdata) {
        this.name = name;
        this.inWave = inWave;
        this.objclass = "SpawnZombiesJitteredWaveActionProps";
        this.objdata = objdata;
    }

    /**
     * For if you want to easily copy waves.
     * Returns a new Wave with a different inWave.
     */
    private SpawnZombiesWave asWave(int inwave) {
        return new SpawnZombiesWave(name, inwave, objdata);
    }

    public int getInWave() {
        return inWave;
    }

    public String getName() {
        return name[0];
    }

    /**
     * @param
     * @return This exact wave, but in a different Wave
     */
    private static SpawnZombiesWave New(ArrayList<Zombie> zombies, int inwave){
        return new SpawnZombiesWave(new String[]{"Wave" + inwave + DUtil.getAlphaNumericString(8)}, inwave, new SpawnZombieWaveObjData(null, zombies,null, 0));
    }

    private static SpawnZombiesWave New(ArrayList<Zombie> zombies, int inwave, int PF){
        return new SpawnZombiesWave(new String[]{"Wave" + inwave + DUtil.getAlphaNumericString(8)},
                inwave,
                new SpawnZombieWaveObjData(
                        null,
                        zombies,
                        null,
                        PF)
        );
    }

    private static SpawnZombiesWave StaggeredWave(ArrayList<Zombie> zombies, int inwave, int PF){
        return new SpawnZombiesWave(new String[]{"Wave" + inwave + DUtil.getAlphaNumericString(8)},
                inwave,
                new SpawnZombieWaveObjData(
                        STAGGERED_PATTERN,
                        zombies,
                        null,
                        PF)
        );
    }

    private static SpawnZombiesWave ForcedConditionWave(ArrayList<Zombie> zombies, int inwave, int PF, Condition condition){
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
