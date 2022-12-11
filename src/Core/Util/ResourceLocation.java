package Core.Util;

public class ResourceLocation {
    public static final String PLANTTYPE = "PlantTypes";
    public static final String ZOMBIETYPE = "ZombieTypes";
    public static final String CURRENTLEVEL = "CurrentLevel";

    private final transient String name;
    private final transient String location;

    public ResourceLocation(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public static ResourceLocation New(String name, String location) {
        return new ResourceLocation(name, location);
    }
}
