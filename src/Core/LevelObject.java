package Core;

public abstract class LevelObject {
    private  String[] aliases;

    protected LevelObject(String[] aliases) {
        this.aliases = aliases;
    }

    public String getAliases(){
        return aliases[0];
    }

    public void setAliases(String aliases) {
        this.aliases = new String[]{aliases};
    }
}