package Core.MiscObj;

import java.util.ArrayList;

public class LevelDefinitionObjdata {
    private  Integer LevelNumber;
    private String Name;
    private String StageModule;
    private String Description;

    private ArrayList<String> Modules;
    private String MusicType;
    private Integer StartingSun;
    private Boolean AddBonusStartingSun;
    private ArrayList<String> ResourceGroupNames;
    private String Loot;
    private Boolean ForceToWorldMap;
    private Boolean DisablePlantBoosts;
    private Boolean SuppressPlantfoodPurchase;
    private Boolean SuppressAccountUpgrades;
    private Integer FixedPlantLevel;
    private Integer ZombieLevel;

    public LevelDefinitionObjdata(Integer levelNumber, String name, String stageModule, String description, ArrayList<String> modules, String musicType, Integer startingSun, Boolean addBonusStartingSun, ArrayList<String> resourceGroupNames, String loot, Boolean forceToWorldMap, Boolean disablePlantBoosts, Boolean suppressPlantfoodPurchase, Boolean suppressAccountUpgrades, Integer fixedPlantLevel, Integer zombieLevel) {
        LevelNumber = levelNumber;
        Name = name;
        StageModule = stageModule;
        Description = description;
        Modules = modules;
        MusicType = musicType;
        StartingSun = startingSun;
        AddBonusStartingSun = addBonusStartingSun;
        ResourceGroupNames = resourceGroupNames;
        Loot = loot;
        ForceToWorldMap = forceToWorldMap;
        DisablePlantBoosts = disablePlantBoosts;
        SuppressPlantfoodPurchase = suppressPlantfoodPurchase;
        SuppressAccountUpgrades = suppressAccountUpgrades;
        FixedPlantLevel = fixedPlantLevel;
        ZombieLevel = zombieLevel;
    }

    public static LevelDefinitionObjdata New(String name, String desc, String stageModule, ArrayList<String> modules) {
        return new LevelDefinitionObjdata(null, name, stageModule, desc, modules, null, null, null, null, null, null, null, null, null, null, null);
    }

    public void setAddBonusStartingSun(Boolean addBonusStartingSun) {
        AddBonusStartingSun = addBonusStartingSun;
    }

    public void setDisablePlantBoosts(Boolean disablePlantBoosts) {
        DisablePlantBoosts = disablePlantBoosts;
    }

    public void setLevelNumber(Integer levelNumber) {
        LevelNumber = levelNumber;
    }

    public void setFixedPlantLevel(Integer fixedPlantLevel) {
        FixedPlantLevel = fixedPlantLevel;
    }

    public void setForceToWorldMap(Boolean forceToWorldMap) {
        ForceToWorldMap = forceToWorldMap;
    }

    public void setMusicType(String musicType) {
        MusicType = musicType;
    }

    public void setStartingSun(Integer startingSun) {
        StartingSun = startingSun;
    }

    public void setSuppressAccountUpgrades(Boolean suppressAccountUpgrades) {
        SuppressAccountUpgrades = suppressAccountUpgrades;
    }

    public void setSuppressPlantfoodPurchase(Boolean suppressPlantfoodPurchase) {
        SuppressPlantfoodPurchase = suppressPlantfoodPurchase;
    }

    public void setZombieLevel(Integer zombieLevel) {
        ZombieLevel = zombieLevel;
    }

    public void addModule(String module) {
        this.Modules.add(module);
    }

    public void addResourceGroup(String resourceGroup) {
        this.ResourceGroupNames.add(resourceGroup);
    }
}
