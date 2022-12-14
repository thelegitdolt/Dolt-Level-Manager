package Core;

public class Plant {
    private final Integer Level;
    private final String PlantType;


    public Plant(Integer level, String plantType) {
        Level = level;
        PlantType = plantType;
    }

    public static Plant Preset(String plantType) {
        return new Plant(null, plantType);
    }

    public static Plant Preset(String plantType, int level) {
        return new Plant(level, plantType);
    }

    public static Plant IPP() {
        return null;
    }

}
