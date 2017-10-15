package aero.sita.bluesky.common.attempt2;

import aero.sita.bluesky.common.attempt2.factories.RawBcbpFactory;
import aero.sita.bluesky.common.attempt2.factories.Version5RawBcbpFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RawBcbpIntegrationTest {

    private RawBcbpFactory factory;
    private RawBcbp fixture;
    private RawBcbpTestData testData;

    public RawBcbpIntegrationTest(RawBcbpTestData testData) {
        this.testData = testData;

        factory = new Version5RawBcbpFactory();
        fixture = factory.create();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(RawBcbpTestDataFactory.getTestData());
    }

    @Test
    public void testParsing() {
        fixture.consume(testData.getRawData());

        Assert.assertEquals(testData.getExpectedFormatCode(),
                fixture.getLeaf("FormatCode").getContents());
    }

}
