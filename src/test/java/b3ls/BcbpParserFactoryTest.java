package b3ls;

import org.junit.Assert;
import org.junit.Test;

public class BcbpParserFactoryTest {


    @Test
    public void shouldBuildSomething() {
        BcbpParserFactory factory = new StandardBcbpParserFactory();

        SimpleTextParser result = factory.create();

        Assert.assertNotNull(result);
    }
}
