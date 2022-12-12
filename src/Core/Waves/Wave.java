package Core.Waves;

import Core.LevelObject;

public class Wave extends LevelObject {
    private final int inWave;

    protected Wave(String[] name, int inWave) {
        super(name);
        this.inWave = inWave;
    }

    public int getInWave() {
        return inWave;
    }
}
