package Core.MiscObj;

import java.util.ArrayList;

public class LevelDefinitionObjdata {
    private final Integer LevelNumber;
    private final String Name;
    private final String StageModule;
    private final String Description;

    private ArrayList<String> Modules;
    private final String MusicType;
    private final Integer StartingSun;
    private final Boolean AddBonusStartingSun;
    private ArrayList<String> ResourceGroupNames;
    private final String Loot;
    private final Boolean ForceToWorldMap;
    private final Boolean DisablePlantBoosts;
    private final Boolean SuppressPlantfoodPurchase;
    private final Boolean SuppressAccountUpgrades;
    private final Integer FixedPlantLevel;
    private final Integer ZombieLevel;

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

    public void addModule(String module) {
        this.Modules.add(module);
    }

    public void addResourceGroup(String resourceGroup) {
        this.ResourceGroupNames.add(resourceGroup);
    }
}
