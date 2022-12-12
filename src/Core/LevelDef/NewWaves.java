package Core.LevelDef;

import Core.LevelObject;
import Core.MiscObj.NewWavesObjData;

public class NewWaves extends LevelObject {
    private final String objclass = "WaveManagerModuleProperties";
    private final NewWavesObjData data = new NewWavesObjData();

    public NewWaves(String aliases) {
        super(aliases);
    }

    public static final NewWaves DEFAULT = new NewWaves("NewWaves");

    public static NewWaves New(String aliases) {
        return new NewWaves(aliases);
    }

}
