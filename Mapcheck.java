package frradioactivityapp.java;

import java.util.HashMap;

public class Mapcheck {

    HashMap<Integer, Integer> franceradioactivity; //key 1: department, key 2: radioactivity
    String radioactivityindicator; //return value

    Mapcheck(){
        HashMap<Integer, Integer> franceradioactivity = new HashMap();
        String radioactivityindicator = "Unchecked";
    }

    public static void initMap(HashMap franceradioactivity){ //initiate Map components
        franceradioactivity.put(1, 50);
        franceradioactivity.put(2, 100);
        franceradioactivity.put(3, 150);
        franceradioactivity.put(4, 200);
        franceradioactivity.put(5, 25);
    }

    public synchronized String getRadioactivity(HashMap franceradioactivity, int key) { //gets right colour String

        int objectconverted = Integer.valueOf((int)franceradioactivity.get(key));

        if (objectconverted < 50) {
            radioactivityindicator = "Green";
        } else if (objectconverted >= 50 && objectconverted < 100) {
            radioactivityindicator = "Green";
        } else if (objectconverted >= 100 && objectconverted < 150) {
            radioactivityindicator = "Yellow";
        } else if (objectconverted >= 150 && objectconverted < 200) {
            radioactivityindicator = "Orange";
        } else if (objectconverted >= 200) {
            radioactivityindicator = "Red";
        }

        return radioactivityindicator;
    }
}