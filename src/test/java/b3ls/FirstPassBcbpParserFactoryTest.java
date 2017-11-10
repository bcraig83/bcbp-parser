package b3ls;

import org.junit.Assert;
import org.junit.Test;

public class FirstPassBcbpParserFactoryTest {

    @Test
    public void shouldBuildSomething() {
        BcbpParserFactory factory = new FirstPassBcbpParserFactory();

        SimpleTextParser result = factory.create();

        Assert.assertNotNull(result);
    }
}
