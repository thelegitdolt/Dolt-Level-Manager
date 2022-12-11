import com.google.gson.Gson;

import java.util.ArrayList;

public class Workspace {
    public static void main(String[] args) {
        int[] tester = new int[]{2, 3, 4};
        ArrayList<Integer> hi = new ArrayList<>();
        hi.add(3);
        hi.add(4);
        Gson gson = new Gson();
        Test test = new Test(hi, new int[][]{tester, tester, tester});
        System.out.println(gson.toJson(test));
    }
}
