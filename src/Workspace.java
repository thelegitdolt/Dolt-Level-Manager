import Core.Waves.SpawnZombiesWave;
import Core.Zombies.Zombie;
import Reflourished.Values.RflZombies;
import com.google.gson.Gson;

import java.util.ArrayList;

public class Workspace {
    public static void main(String[] args) {
        ArrayList<Zombie> Zombies = new ArrayList<>();
        Zombies.add(Zombie.New(RflZombies.WEST_BULL, 5));

        SpawnZombiesWave NewWave = SpawnZombiesWave.StaggeredWave(Zombies, 1, 1);
    }
}
