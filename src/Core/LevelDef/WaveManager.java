package Core.LevelDef;

import Core.Waves.Wave;

import java.util.ArrayList;


public class WaveManager {
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

    // ONLY CHANGE IF YOU HAVE MODERN DAY STAGE ENABLED: Failure to do so will cause Exception!
    private final String levelJam;

    public WaveManager(ArrayList<Wave> Waves, Float maxNextWaveHealthPercentage, Float minNextWaveHealthPercentage, int[] flagWaveVeteranOverrideTypes, int waveSpendingCostIncrement, int waveSpendingPoints, int zombieCountdownHugeWaveDelay, boolean suppressFlagZombie, int spawnColEnd, int spawnColStart, String levelJam) {
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
}
