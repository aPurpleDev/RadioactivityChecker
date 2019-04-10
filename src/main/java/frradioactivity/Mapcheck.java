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

        BCQMTRCUBE(0),
        BCQDCMTRCUBE(0);

        public int bcqValue;

        RadioDim(int bcqValue){
            this.bcqValue = bcqValue;
        }
    }

    class EnumChecker{

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

        public RadioColor bcqDim(RadioDim dim, int bcqValue){

                switch(dim) {

                    case BCQMTRCUBE:

                        return checkRadioColorBcq(bcqValue);


                    case BCQDCMTRCUBE:

                        return checkRadioColorBcq(bcqValue / 1000);

                }throw new IllegalArgumentException();
        }
    }
}
