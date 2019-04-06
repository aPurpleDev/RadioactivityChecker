package frradioactivity;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //initiate Map components
        Map<Integer, Integer> franceradioactivity1 = new HashMap<>();

        franceradioactivity1.put(1, 50);
        franceradioactivity1.put(2, 100);
        franceradioactivity1.put(3, 150);
        franceradioactivity1.put(4, 200);
        franceradioactivity1.put(5, 25);
        Map<Integer, Integer> franceradioactivity = franceradioactivity1;
        Mapcheck francecheck = new Mapcheck();

        francecheck.getRadioactivity(franceradioactivity.get(1)); //change key here to change test

    }
}