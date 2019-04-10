package frradioactivity;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class checkRadioColorTest {

    private final Mapcheck mapcheck = new Mapcheck();
    private final Mapcheck.EnumChecker enumChecker = mapcheck.new EnumChecker();

    @Test
    public void green() {
        Assertions.assertThat(enumChecker.checkRadioColor(0)).isEqualTo(Mapcheck.RadioColor.GREEN);
    }

    @Test
    public void green2() {
        Assertions.assertThat(enumChecker.checkRadioColor(15)).isEqualTo(Mapcheck.RadioColor.GREEN);
    }

    @Test
    public void green3() {
        Assertions.assertThat(enumChecker.checkRadioColor(50)).isEqualTo(Mapcheck.RadioColor.GREEN);
    }

    @Test
    public void yellow() {
        Assertions.assertThat(enumChecker.checkRadioColor(51)).isEqualTo(Mapcheck.RadioColor.YELLOW);
        Assertions.assertThat(enumChecker.checkRadioColor(75)).isEqualTo(Mapcheck.RadioColor.YELLOW);
        Assertions.assertThat(enumChecker.checkRadioColor(100)).isEqualTo(Mapcheck.RadioColor.YELLOW);

    }
    @Test
    public void orange() {
        Assertions.assertThat(enumChecker.checkRadioColor(101)).isEqualTo(Mapcheck.RadioColor.ORANGE);
        Assertions.assertThat(enumChecker.checkRadioColor(125)).isEqualTo(Mapcheck.RadioColor.ORANGE);
        Assertions.assertThat(enumChecker.checkRadioColor(150)).isEqualTo(Mapcheck.RadioColor.ORANGE);
    }
    @Test
    public void red() {
        Assertions.assertThat(enumChecker.checkRadioColor(151)).isEqualTo(Mapcheck.RadioColor.RED);
        Assertions.assertThat(enumChecker.checkRadioColor(175)).isEqualTo(Mapcheck.RadioColor.RED);
        Assertions.assertThat(enumChecker.checkRadioColor(200)).isEqualTo(Mapcheck.RadioColor.RED);
    }
}