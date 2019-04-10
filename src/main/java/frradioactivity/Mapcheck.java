package frradioactivity;

public class Mapcheck { //One purpose. SRP, Single Responsibility Principle.

    enum RadioColor { //Enum to return as per exercise instructions

        GREEN(0,50), //radioactivityIndex is the color's limit per radioactivity.
        YELLOW(51,100), //the colorname is just a String containing the name's color
        ORANGE(101,150),
        RED(151,Integer.MAX_VALUE);

        private final int minRadioIndex;
        private final int maxRadioIndex;

        RadioColor(int minRadioIndex, int maxRadioIndex) {

            this.minRadioIndex = minRadioIndex;
            this.maxRadioIndex = maxRadioIndex;
        }

    }

    class EnumChecker{ //contains the method to return the right enum per radioactivityindex

        public RadioColor checkRadioColor(int deptRadioactivity){

            for (RadioColor value : RadioColor.values()) {
                if(value.minRadioIndex <= deptRadioactivity && value.maxRadioIndex >= deptRadioactivity) {
                    return value;
                }
            }
            throw new IllegalArgumentException(); //Pour sécuriser la méthode
        }

        public RadioColor checkRadioColor2(int deptRadioactivity) {

            RadioColor colorreturn = null;

                if(deptRadioactivity <= 50) {

                    return RadioColor.GREEN; //retourne une instance de l'enum

                }
                if (deptRadioactivity <= 100) {

                    return RadioColor.YELLOW;

                }
                if (deptRadioactivity <= 150) {

                    return RadioColor.ORANGE;

                }

                return RadioColor.RED;
        }
    }
}
