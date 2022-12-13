package Core.LevelDef;

import java.util.ArrayList;

public class SeedBank {
    public static final String CHOOSER = "chooser";
    public static final String PRESET = "preset";

    private ArrayList<String> PlantIncludeList;
    private ArrayList<String> PlantExcludeList;
    // todo: PlantPresetList since you can change levels

    private Integer OverrideSeedSlotsCount;
    private String SelectionMethod;

    public SeedBank(ArrayList<String> plantIncludeList, ArrayList<String> plantExcludeList, Integer overrideSeedSlotsCount, String selectionMethod) {
        PlantIncludeList = plantIncludeList;
        PlantExcludeList = plantExcludeList;
        OverrideSeedSlotsCount = overrideSeedSlotsCount;
        SelectionMethod = selectionMethod;
    }


    public static SeedBank NewChooser() {
        return new SeedBank(null, null, null, CHOOSER);
    }

    public static SeedBank NewPreset() {
        return new SeedBank(null, null, null, PRESET);
    }

    public void setSlotOverride(int SO) {
        this.OverrideSeedSlotsCount = SO;
    }

    public void setWhiteList (ArrayList<String> whitelist) {
        this.PlantIncludeList = whitelist;
    }

    public void setBlackList(ArrayList<String> list) {
        this.PlantExcludeList = list;
    }

    public void SelectionMethod(ArrayList<String> list) {
        this.PlantExcludeList = list;
    }


}
