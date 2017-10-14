package aero.sita.bluesky.common.attempt2;

import aero.sita.bluesky.common.attempt2.factories.RawBcbpFactory;
import aero.sita.bluesky.common.attempt2.factories.Version5RawBcbpFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RawBcbpIntegrationTest {

    private RawBcbpFactory factory;
    private RawBcbp fixture;
    private String result;

    @Before
    public void setUp() throws Exception {
        factory = new Version5RawBcbpFactory();
        fixture = factory.create();
        result = fixture.consume("M1DESMARAIS/LUC       EABC123 YULFRAAC 0834 226F001A0025 100");
    }

    @Test
    public void shouldDoSimpleParse() {
        Assert.assertEquals("", result);
        Assert.assertEquals(15, fixture.getLeaves().size());
    }

    @Test
    public void shouldParseFormatCode() {
        Assert.assertEquals("FormatCode", fixture.getLeaves().get(0).getName());
        Assert.assertEquals("M", fixture.getLeaves().get(0).getContents());
    }

    @Test
    public void shouldParseNumberOfLegsEncoded() {
        Assert.assertEquals("NumberOfLegsEncoded", fixture.getLeaves().get(1).getName());
        Assert.assertEquals("1", fixture.getLeaves().get(1).getContents());
    }


}
