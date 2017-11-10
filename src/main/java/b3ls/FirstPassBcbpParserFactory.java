package b3ls;

public class FirstPassBcbpParserFactory implements BcbpParserFactory {
    @Override
    public SimpleTextParser create() {
        SimpleTextParser result = new SimpleTextParser();
        return result;
    }
}
