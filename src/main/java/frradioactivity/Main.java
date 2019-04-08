package frradioactivity;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Integer> franceradioactivity = new HashMap<>();
        franceradioactivity.put(1, 50);
        franceradioactivity.put(2, 100);
        franceradioactivity.put(3, 150);
        franceradioactivity.put(4, 200);
        franceradioactivity.put(5, 25);

        Mapcheck francecheck = new Mapcheck();
        Mapcheck.EnumChecker enumchecker = francecheck.new EnumChecker(); //Instance of EnumChecker to call the checkRadioColor method
        enumchecker.checkRadioColor(franceradioactivity.get(3)); //change Key (department number) to change test
    }
}