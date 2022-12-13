package Core.LevelDef;

import Core.LevelObject;
import Core.Values.WaveManagerValues;
import Core.Waves.Wave;

import java.util.ArrayList;
import java.util.HashMap;


public class WaveManager extends LevelObject {
    private ArrayList<ArrayList<String>> WaveManager;

    private Float MaxNextWaveHealthPercentage;
    private Float MinNextWaveHealthPercentage;
    private int[] FlagWaveVeteranOverrideTypes;
    private Integer WaveSpendingCostIncrement;
    private Integer WaveSpendingPoints;
    private Integer ZombieCountdownHugeWaveDelay;
    private Boolean SuppressFlagZombie;
    private Integer SpawnColEnd;
    private Integer SpawnColStart;

    // ONLY CHANGE IF YOU HAVE MODERN DAY STAGE ENABLED!!!!
    private String levelJam;

    public WaveManager(String[] aliases, ArrayList<Wave> Waves, Float maxNextWaveHealthPercentage, Float minNextWaveHealthPercentage, int[] flagWaveVeteranOverrideTypes, Integer waveSpendingCostIncrement, Integer waveSpendingPoints, Integer zombieCountdownHugeWaveDelay, Boolean suppressFlagZombie, Integer spawnColEnd, Integer spawnColStart, String levelJam) {
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
        Integer MaxWaves = 0;
        for (Wave wave : Waves) {
            if (wave.getInWave() > MaxWaves) {
                MaxWaves = wave.getInWave();
            }
        }
        ArrayList<ArrayList<String>> daWaves = new ArrayList<>();
        for ( Integer i = 0; i < MaxWaves; i++) {
            daWaves.add(new ArrayList<>());
        }
        for (Wave wave : Waves) {
            daWaves.get(wave.getInWave() - 1).add("RTID" + wave.getAliases() + "@CurrentLevel)");
        }
        WaveManager = daWaves;
    }

    public static WaveManager New(ArrayList<Wave> waves) {
        return new WaveManager(new String[]{"WaveManagerProperties"}, waves,
          null, null, null, null, null, null, null, 
                null, null, null);
    }

    public void setFlagWaveVeteranOverrideTypes(int[] flagWaveVeteranOverrideTypes) {
        FlagWaveVeteranOverrideTypes = flagWaveVeteranOverrideTypes;
    }

    public void setLevelJam(String levelJam) {
        this.levelJam = levelJam;
    }

    public void setSuppressFlagZombie(Boolean suppressFlagZombie) {
        SuppressFlagZombie = suppressFlagZombie;
    }

    public void setSpawnColEnd(Integer spawnColEnd) {
        SpawnColEnd = spawnColEnd;
    }

    public void setMaxNextWaveHealthPercentage(Float maxNextWaveHealthPercentage) {
        MaxNextWaveHealthPercentage = maxNextWaveHealthPercentage;
    }

    public void setMinNextWaveHealthPercentage(Float minNextWaveHealthPercentage) {
        MinNextWaveHealthPercentage = minNextWaveHealthPercentage;
    }

    public void setSpawnColStart(Integer spawnColStart) {
        SpawnColStart = spawnColStart;
    }

    public void setWaveSpendingCostIncrement(Integer waveSpendingCostIncrement) {
        WaveSpendingCostIncrement = waveSpendingCostIncrement;
    }

    public void setWaveSpendingPoints(Integer waveSpendingPoints) {
        WaveSpendingPoints = waveSpendingPoints;
    }

    public void setZombieCountdownHugeWaveDelay(Integer zombieCountdownHugeWaveDelay) {
        ZombieCountdownHugeWaveDelay = zombieCountdownHugeWaveDelay;
    }
}
