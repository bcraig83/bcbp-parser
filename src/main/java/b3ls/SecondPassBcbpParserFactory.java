package b3ls;

public class SecondPassBcbpParserFactory implements BcbpParserFactory {
    @Override
    public SimpleTextParser create() {
        SimpleTextParser result = new SimpleTextParser();
        return result;
    }
}
