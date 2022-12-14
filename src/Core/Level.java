package Core;


import Core.LevelDef.LevelDefinition;
import Core.LevelDef.NewWaves;
import Core.MiscObj.LevelDefinitionObjdata;

import java.util.ArrayList;

public class Level {
    private ArrayList<LevelObject> objects;

    private transient LevelDefinition definition;

    public Level(ArrayList<LevelObject> objects) {
        this.objects = objects;
    }

    public LevelDefinition getLD() {
        for(LevelObject LO : this.objects) {
            if (LO instanceof LevelDefinition) {
                return (LevelDefinition) LO;
            }
        }
        return null;
    }

    public static Level Default(String name, String desc, String stage) {
        ArrayList<LevelObject> objs = new ArrayList<>();
        objs.add(NewWaves.DEFAULT);
        objs.add(LevelDefinition.New(name, desc, stage));

        return new Level(objs);
    }
}
