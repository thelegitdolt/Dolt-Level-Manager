package Core.LevelDef;

import Core.Plant;

import java.util.ArrayList;

public class SeedBank {
    public static final String CHOOSER = "chooser";
    public static final String PRESET = "preset";

    private ArrayList<String> PlantIncludeList;
    private ArrayList<String> PlantExcludeList;

    private ArrayList<Plant> PresetPlantList;

    private Integer OverrideSeedSlotsCount;
    private String SelectionMethod;

    public SeedBank(ArrayList<String> plantIncludeList, ArrayList<String> plantExcludeList, ArrayList<Plant> preset, Integer overrideSeedSlotsCount, String selectionMethod) {
        PlantIncludeList = plantIncludeList;
        PlantExcludeList = plantExcludeList;
        PresetPlantList = preset;
        OverrideSeedSlotsCount = overrideSeedSlotsCount;
        SelectionMethod = selectionMethod;
    }


    public static SeedBank NewChooser() {
        return new SeedBank(null, null, null, null, CHOOSER);
    }

    public static SeedBank NewPreset() {
        return new SeedBank(null, null, null, null, PRESET);
    }

    public void setSlotOverride(int SO) {
        this.OverrideSeedSlotsCount = SO;
    }

    public void setWhiteList (ArrayList<String> whitelist) {
        this.PlantIncludeList = whitelist;
    }

    public void setPreset (ArrayList<Plant> list) {
        this.PresetPlantList = list;
    }

    public void setBlackList(ArrayList<String> list) {
        this.PlantExcludeList = list;
    }

    public void SelectionMethod(ArrayList<String> list) {
        this.PlantExcludeList = list;
    }


}
