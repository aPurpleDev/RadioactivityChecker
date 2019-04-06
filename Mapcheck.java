package frradioactivity;

public class Mapcheck { //une seule responsabilité. SRP, Single Responsibility Principle.


    public synchronized String getRadioactivity(int radioactivityRate) { //préciser le datatype dans le paramètre pour éviter un cast inutile.

        //return value
        String radioactivityindicator;
        if (radioactivityRate < 100) {
            radioactivityindicator = "Green";
        } else if (radioactivityRate < 150) {
            radioactivityindicator = "Yellow";
        } else if (radioactivityRate < 200) {
            radioactivityindicator = "Orange";
        } else {
            radioactivityindicator = "Red";
        }

        return radioactivityindicator;
    }
}
