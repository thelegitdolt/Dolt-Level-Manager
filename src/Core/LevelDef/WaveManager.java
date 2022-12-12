package Core.LevelDef;

import Core.LevelObject;
import Core.Values.WaveManagerValues;
import Core.Waves.Wave;

import java.util.ArrayList;
import java.util.HashMap;


public class WaveManager extends LevelObject {
    private final ArrayList<ArrayList<String>> WaveManager;

    private final Float MaxNextWaveHealthPercentage;
    private final Float MinNextWaveHealthPercentage;
    private final int[] FlagWaveVeteranOverrideTypes;
    private final int WaveSpendingCostIncrement;
    private final int WaveSpendingPoints;
    private final int ZombieCountdownHugeWaveDelay;
    private final boolean SuppressFlagZombie;
    private final int SpawnColEnd;
    private final int SpawnColStart;

    // ONLY CHANGE IF YOU HAVE MODERN DAY STAGE ENABLED!!!!
    private final String levelJam;

    public WaveManager(String aliases, ArrayList<Wave> Waves, Float maxNextWaveHealthPercentage, Float minNextWaveHealthPercentage, int[] flagWaveVeteranOverrideTypes, int waveSpendingCostIncrement, int waveSpendingPoints, int zombieCountdownHugeWaveDelay, boolean suppressFlagZombie, int spawnColEnd, int spawnColStart, String levelJam) {
        super(aliases);
        MaxNextWaveHealthPercentage = maxNextWaveHealthPercentage;
        MinNextWaveHealthPercentage = minNextWaveHealthPercentage;
        FlagWaveVeteranOverrideTypes = flagWaveVeteranOverrideTypes;
        WaveSpendingCostIncrement = waveSpendingCostIncrement;
        WaveSpendingPoints = waveSpendingPoints;
        SpawnColEnd = spawnColEnd;
        ZombieCountdownHugeWaveDelay = zombieCountdownHugeWaveDelay;
        SuppressFlagZombie = suppressFlagZombie;
        SpawnColStart = spawnColStart;
        this.levelJam = levelJam;
        int MaxWaves = 0;
        for (Wave wave : Waves) {
            if (wave.getInWave() > MaxWaves) {
                MaxWaves = wave.getInWave();
            }
        }
        ArrayList<ArrayList<String>> daWaves = new ArrayList<>();
        for (int i = 0; i < MaxWaves; i++) {
            daWaves.add(new ArrayList<>());
        }
        for (Wave wave : Waves) {
            daWaves.get(wave.getInWave() - 1).add("RTID" + wave.getAliases() + "@CurrentLevel)");
        }
        WaveManager = daWaves;
    }

    public static WaveManager FromItems(ArrayList<Wave> waves, HashMap<String, Object> items) {
        return new WaveManager("WaveManagerProperties", waves,
          items.containsKey(WaveManagerValues.MAXNEXTWAVEHEALTHPERCENTAGE) ? (Float) items.get(WaveManagerValues.MAXNEXTWAVEHEALTHPERCENTAGE) : null,
          items.containsKey(WaveManagerValues.MINNEXTWAVEHEALTHPERCENTAGE) ? (Float) items.get(WaveManagerValues.MINNEXTWAVEHEALTHPERCENTAGE) : null,
          items.containsKey(WaveManagerValues.FLAGWAVEVETERANOVERRIDETYPES) ? (int[]) items.get(WaveManagerValues.FLAGWAVEVETERANOVERRIDETYPES) : null,
          items.containsKey(WaveManagerValues.WAVESPENDINGCOSTINCREMENT) ? (int) items.get(WaveManagerValues.WAVESPENDINGCOSTINCREMENT) : null,
          items.containsKey(WaveManagerValues.WAVESPENDINGPOINTS) ? (int) items.get(WaveManagerValues.WAVESPENDINGPOINTS) : null,
          items.containsKey(WaveManagerValues.ZOMBIECOUNTDOWNHUGEWAVEDELAY) ? (int) items.get(WaveManagerValues.ZOMBIECOUNTDOWNHUGEWAVEDELAY) : null,
          items.containsKey(WaveManagerValues.SUPPRESSFLAGZOMBIE) ? (boolean) items.get(WaveManagerValues.SUPPRESSFLAGZOMBIE) : null,
          items.containsKey(WaveManagerValues.SPAWNCOLEND) ? (int) items.get(WaveManagerValues.SPAWNCOLEND) : null,
          items.containsKey(WaveManagerValues.SPAWNCOLSTART) ? (int) items.get(WaveManagerValues.SPAWNCOLSTART) : null,
          items.containsKey(WaveManagerValues.LEVELJAM) ? (String) items.get(WaveManagerValues.LEVELJAM) : null
          );
    }
}
