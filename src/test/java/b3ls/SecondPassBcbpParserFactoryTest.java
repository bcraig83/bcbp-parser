package b3ls;

import org.junit.Assert;
import org.junit.Test;

public class SecondPassBcbpParserFactoryTest {

    @Test
    public void shouldBuildSomething() {
        BcbpParserFactory factory = new SecondPassBcbpParserFactory();
        SimpleTextParser result = factory.create();

        Assert.assertNotNull(result);
    }
}
