package frradioactivity;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class checkRadioColorTest {

    private final Mapcheck mapcheck = new Mapcheck();
    private final Mapcheck.EnumChecker enumChecker = mapcheck.new EnumChecker();

    @Test
    public void orange() {
        Assertions.assertThat(enumChecker.checkRadioColor(120)).isEqualTo(Mapcheck.RadioColor.ORANGE);
       }
}