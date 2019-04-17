package frradioactivity;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class checkRadioValueTest {

    public final Mapcheck mapcheck = new Mapcheck();

    public final Mapcheck.RadioValue radiovalue = mapcheck.new RadioValue();

    @Test
    public void green() {

        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQMTRCUBE,0))).isEqualTo(Mapcheck.RadioColor.GREEN);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQMTRCUBE,25))).isEqualTo(Mapcheck.RadioColor.GREEN);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQMTRCUBE,50))).isEqualTo(Mapcheck.RadioColor.GREEN);

        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQDCMTRCUBE,0))).isEqualTo(Mapcheck.RadioColor.GREEN);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQDCMTRCUBE,25000))).isEqualTo(Mapcheck.RadioColor.GREEN);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQDCMTRCUBE,50000))).isEqualTo(Mapcheck.RadioColor.GREEN);
    }

    @Test
    public void yellow() {

        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQMTRCUBE,51))).isEqualTo(Mapcheck.RadioColor.YELLOW);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQMTRCUBE,75))).isEqualTo(Mapcheck.RadioColor.YELLOW);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQMTRCUBE,100))).isEqualTo(Mapcheck.RadioColor.YELLOW);

        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQDCMTRCUBE,51000))).isEqualTo(Mapcheck.RadioColor.YELLOW);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQDCMTRCUBE,75000))).isEqualTo(Mapcheck.RadioColor.YELLOW);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQDCMTRCUBE,100000))).isEqualTo(Mapcheck.RadioColor.YELLOW);
    }


    @Test
    public void orange() {

        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQMTRCUBE,101))).isEqualTo(Mapcheck.RadioColor.ORANGE);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQMTRCUBE,125))).isEqualTo(Mapcheck.RadioColor.ORANGE);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQMTRCUBE,150))).isEqualTo(Mapcheck.RadioColor.ORANGE);

        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQDCMTRCUBE,101000))).isEqualTo(Mapcheck.RadioColor.ORANGE);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQDCMTRCUBE,125000))).isEqualTo(Mapcheck.RadioColor.ORANGE);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQDCMTRCUBE,150000))).isEqualTo(Mapcheck.RadioColor.ORANGE);
    }

    @Test
    public void red() {

        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQMTRCUBE,151))).isEqualTo(Mapcheck.RadioColor.RED);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQMTRCUBE,175))).isEqualTo(Mapcheck.RadioColor.RED);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQMTRCUBE,2000))).isEqualTo(Mapcheck.RadioColor.RED);

        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQDCMTRCUBE,151000))).isEqualTo(Mapcheck.RadioColor.RED);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQDCMTRCUBE,175000))).isEqualTo(Mapcheck.RadioColor.RED);
        Assertions.assertThat(radiovalue.checkRadioValue(mapcheck.new RadioValue(Mapcheck.RadioDim.BCQDCMTRCUBE,200000))).isEqualTo(Mapcheck.RadioColor.RED);
    }
}