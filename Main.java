package frradioactivityapp.java;

import java.util.HashMap;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Integer> franceradioactivity = new HashMap();
        Mapcheck francecheck = new Mapcheck();
        francecheck.initMap(franceradioactivity);
        francecheck.getRadioactivity(franceradioactivity,1); //change key here to change test

        }
}

