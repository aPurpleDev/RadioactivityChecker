package frradioactivity;

public class Mapcheck {

    enum RadioColor {

        GREEN(0,50),
        YELLOW(51,100),
        ORANGE(101,150),
        RED(151,Integer.MAX_VALUE);

        private final int minRadioIndex;
        private final int maxRadioIndex;

        RadioColor(int minRadioIndex, int maxRadioIndex) {

            this.minRadioIndex = minRadioIndex;
            this.maxRadioIndex = maxRadioIndex;
        }

    }

    enum RadioDim{ //Enum for a dimension argument in the checkRadioColorBcq method

        BCQMTRCUBE,
        BCQDCMTRCUBE;

        RadioDim(){
        }
    }

    class RadioValue{

        RadioDim dim;
        int value;

        RadioValue(){

            this.dim = RadioDim.BCQMTRCUBE;
            this.value = 0;
        }

        RadioValue(RadioDim dim, int value){

            this.dim = dim;
            this.value = value;
        }

        public RadioColor checkRadioValue(RadioValue deptRadioactivity){

            switch(deptRadioactivity.dim){

                case BCQMTRCUBE:

                    return checkRadioColorBcq(deptRadioactivity.value);

                case BCQDCMTRCUBE:

                    return checkRadioColorBcq(deptRadioactivity.value/1000);

            }throw new IllegalArgumentException();
        }

        public RadioColor checkRadioColorBcq(int deptRadioactivity) {

            if(deptRadioactivity <= 50) {

                return RadioColor.GREEN;
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
