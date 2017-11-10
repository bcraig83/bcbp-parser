package b3ls;

public class StandardBcbpParserFactory implements BcbpParserFactory {
    @Override
    public SimpleTextParser create() {
        SimpleTextParser result = new SimpleTextParser();
        return result;
    }
}
