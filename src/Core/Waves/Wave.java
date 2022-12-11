package Core.Waves;

public abstract class Wave {
    private final String aliases;
    private final int inWave;

    protected Wave(String name, int inWave) {
        aliases = name;
        this.inWave = inWave;
    }

    public String getAliases() {
        return aliases;
    }

    public int getInWave() {
        return inWave;
    }
}
