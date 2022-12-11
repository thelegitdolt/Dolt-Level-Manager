package Core.Waves;

public abstract class Wave {
    private final String Name;
    private final int inWave;

    protected Wave(String name, int inWave) {
        Name = name;
        this.inWave = inWave;
    }

    public String getName() {
        return Name;
    }

    public int getInWave() {
        return inWave;
    }
}
