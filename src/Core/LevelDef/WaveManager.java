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

    public WaveManager(ArrayList<Wave> Waves) {
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
