package aero.sita.bluesky.common.attempt2.fields;

import aero.sita.bluesky.common.attempt2.fields.mandatory.FormatCode;
import org.junit.Assert;
import org.junit.Test;

public class FormatCodeTest {
    @Test
    public void shouldSetNameCorrectly() {
        FormatCode fixture = new FormatCode();
        Assert.assertEquals("FormatCode", fixture.getName());
    }
}
