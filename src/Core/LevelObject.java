package Core;

public abstract class LevelObject {
    private final String[] aliases;

    protected LevelObject(String[] aliases) {
        this.aliases = aliases;
    }

    public String getAliases(){
        return aliases[0];
    }
}