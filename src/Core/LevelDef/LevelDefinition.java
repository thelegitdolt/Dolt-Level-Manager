package Core.LevelDef;

import Core.LevelObject;
import Core.MiscObj.LevelDefinitionObjdata;

import java.util.ArrayList;

public class LevelDefinition extends LevelObject {
    private final String objclass = "LevelDefinition";
    public LevelDefinitionObjdata objdata;

    public LevelDefinition(LevelDefinitionObjdata objdata) {
        super(null);
        this.objdata = objdata;
    }

    public static LevelDefinition New(String name, String desc, String stageModule) {
        return new LevelDefinition(LevelDefinitionObjdata.New(name, desc, stageModule, new ArrayList<>()));
    }

    @Override
    public String getAliases() {
        return null;
    }
    public void setAddBonusStartingSun(Boolean t) {
        this.objdata.setAddBonusStartingSun(t);
    }

    public void setDisablePlantBoosts(Boolean t) {
        this.objdata.setDisablePlantBoosts(t);
    }

    public void setLevelNumber(Integer f) {
        this.objdata.setLevelNumber(f);
    }

    public void setFixedPlantLevel(Integer f) {
        this.objdata.setFixedPlantLevel(f);
    }

    public void setForceToWorldMap(Boolean forceToWorldMap) {
        this.objdata.setForceToWorldMap(forceToWorldMap);
    }

    public void setMusicType(String musicType) {
        this.objdata.setMusicType(musicType);
    }

    public void setStartingSun(Integer flag) {
        this.objdata.setStartingSun(flag);
    }

    public void setSuppressAccountUpgrades(Boolean flag) {
        this.objdata.setSuppressAccountUpgrades(flag);
    }

    public void setSuppressPlantfoodPurchase(Boolean suppressPlantfoodPurchase) {
        this.objdata.setSuppressPlantfoodPurchase(suppressPlantfoodPurchase);
    }

    public void setZombieLevel(Integer zombieLevel) {
        this.objdata.setZombieLevel(zombieLevel);
    }

    public void addModule(String module) {
        this.objdata.addModule(module);
    }

    public void addResourceGroup(String resourceGroup) {
        this.objdata.addResourceGroup(resourceGroup);
    }
}
