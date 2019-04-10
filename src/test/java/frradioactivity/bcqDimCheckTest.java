package frradioactivity;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class bcqDimCheckTest {

    public final Mapcheck mapcheck = new Mapcheck();
    public final Mapcheck.EnumChecker enumChecker = mapcheck.new EnumChecker();

    @Test
    public void bcqMtrGreen(){
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQMTRCUBE,0)).isEqualTo(Mapcheck.RadioColor.GREEN);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQMTRCUBE,25)).isEqualTo(Mapcheck.RadioColor.GREEN);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQMTRCUBE,50)).isEqualTo(Mapcheck.RadioColor.GREEN);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQDCMTRCUBE,0)).isEqualTo(Mapcheck.RadioColor.GREEN);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQDCMTRCUBE,25000)).isEqualTo(Mapcheck.RadioColor.GREEN);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQDCMTRCUBE,50000)).isEqualTo(Mapcheck.RadioColor.GREEN);
    }

    @Test
    public void bcqMtrYellow(){
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQMTRCUBE,51)).isEqualTo(Mapcheck.RadioColor.YELLOW);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQMTRCUBE,75)).isEqualTo(Mapcheck.RadioColor.YELLOW);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQMTRCUBE,100)).isEqualTo(Mapcheck.RadioColor.YELLOW);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQDCMTRCUBE,51000)).isEqualTo(Mapcheck.RadioColor.YELLOW);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQDCMTRCUBE,75000)).isEqualTo(Mapcheck.RadioColor.YELLOW);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQDCMTRCUBE,100000)).isEqualTo(Mapcheck.RadioColor.YELLOW);
    }

    @Test
    public void bcqMtrOrange(){
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQMTRCUBE,101)).isEqualTo(Mapcheck.RadioColor.ORANGE);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQMTRCUBE,125)).isEqualTo(Mapcheck.RadioColor.ORANGE);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQMTRCUBE,150)).isEqualTo(Mapcheck.RadioColor.ORANGE);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQDCMTRCUBE,101000)).isEqualTo(Mapcheck.RadioColor.ORANGE);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQDCMTRCUBE,125000)).isEqualTo(Mapcheck.RadioColor.ORANGE);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQDCMTRCUBE,150000)).isEqualTo(Mapcheck.RadioColor.ORANGE);
    }

    @Test
    public void bcqMtrRed(){
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQMTRCUBE,151)).isEqualTo(Mapcheck.RadioColor.RED);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQMTRCUBE,175)).isEqualTo(Mapcheck.RadioColor.RED);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQMTRCUBE,200)).isEqualTo(Mapcheck.RadioColor.RED);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQDCMTRCUBE,151000)).isEqualTo(Mapcheck.RadioColor.RED);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQDCMTRCUBE,175000)).isEqualTo(Mapcheck.RadioColor.RED);
        Assertions.assertThat(enumChecker.bcqDim(Mapcheck.RadioDim.BCQDCMTRCUBE,200000)).isEqualTo(Mapcheck.RadioColor.RED);
    }
}