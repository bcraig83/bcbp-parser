package aero.sita.bluesky.common.attempt2;

import aero.sita.bluesky.common.attempt2.factories.RawBcbpFactory;
import aero.sita.bluesky.common.attempt2.factories.Version5RawBcbpFactory;
import org.junit.Assert;
import org.junit.Test;

public class RawBcbpIntegrationTest {

    private RawBcbpFactory factory = new Version5RawBcbpFactory();

    @Test
    public void shouldDoSimpleParse() {
        RawBcbp fixture = factory.create();

        String result = fixture.consume("ABC");

        Assert.assertEquals("FormatCode", fixture.getLeaves().get(0).getName());
        Assert.assertEquals("A", fixture.getLeaves().get(0).getContents());
        Assert.assertEquals("BC", result);
    }
}
