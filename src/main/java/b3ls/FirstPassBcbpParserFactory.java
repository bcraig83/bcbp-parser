package b3ls;

public class FirstPassBcbpParserFactory implements BcbpParserFactory {


    @Override
    public SimpleTextParser create() {
        return new SimpleTextParser()
                .addRawGroupParser(new ParseableRawGroup(new RawGroup("BasicInfo")
                        .addRawFieldParser(new ParseableRawField(new RawField(1, "FormatCode")))
                        .addRawFieldParser(new ParseableRawField(new RawField(1, "NumberOfLegsEncoded")))
                        .addRawFieldParser(new ParseableRawField(new RawField(56, "StuffWeDontCareAbout")))
                        .addRawFieldParser(new ParseableRawField(new RawField(2, "FieldSizeOfVaribleSizeField")))));

        // TODO: add everything else
    }
}
