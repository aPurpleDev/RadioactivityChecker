package frradioactivity;

public class Mapcheck { //One purpose. SRP, Single Responsibility Principle.

    enum RadioColor { //Enum to return as per exercise instructions

        GREEN(50, "Green"), //radioactivityIndex is the color's limit per radioactivity.
        YELLOW(100, "Yellow"), //the colorname is just a String containing the name's color
        ORANGE(150, "Orange"),
        RED(200, "Red");

        private int radioactivityIndex;
        private String colorname;

        RadioColor(int radioactivityIndex, String colorname) { //Constructor to enable the enum attributes
            if (radioactivityIndex <= 50) {
                this.radioactivityIndex = 50;
                this.colorname = "Green";
            } else if (radioactivityIndex <= 100) {
                this.radioactivityIndex = 100;
                this.colorname = "Yellow";
            } else if (radioactivityIndex <= 150) {
                this.radioactivityIndex = 150;
                this.colorname = "Orange";
            } else {
                this.radioactivityIndex = 200;
                this.colorname = "Red";
            }
        }
    }

    class EnumChecker{ //contains the method to return the right enum per radioactivityindex

        EnumChecker(){
        Mapcheck.RadioColor[] color = Mapcheck.RadioColor.values(); //array to browse the Enum values
        }

        public RadioColor checkRadioColor(int deptRadioactivity) {

            RadioColor colorreturn = null;

                if(deptRadioactivity <= 50) {

                    colorreturn = RadioColor.GREEN;

                } else if (deptRadioactivity <= 100) {

                    colorreturn = RadioColor.YELLOW;

                } else if (deptRadioactivity <= 150) {

                    colorreturn = RadioColor.ORANGE;

                } else {

                    colorreturn = RadioColor.RED;
                }

            return colorreturn; //returned Enum of right color type
        }
    }
}
