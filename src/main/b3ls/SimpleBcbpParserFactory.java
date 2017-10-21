package b3ls;

public class SimpleBcbpParserFactory implements BcbpParserFactory {


  private ParseableRawGroupFactory mandatoryItemsGroupFactory;
  private ParseableRawGroupFactory conditionalItemsGroupFactory;
  private BcbpFieldSizeProvider bcbpFieldSizeProvider;

  SimpleBcbpParserFactory() {
    mandatoryItemsGroupFactory = new MandatoryItemsGroupFactory();
    conditionalItemsGroupFactory = new ConditionalItemsGroupFactory();
  }

  @Override
  public SimpleTextParser create() {

    SimpleTextParser result = new SimpleTextParser();

    result.addRawGroupParser(mandatoryItemsGroupFactory.create());
    result.addRawGroupParser(conditionalItemsGroupFactory.create());

    // TODO: make a factory...
    bcbpFieldSizeProvider = new BcbpFieldSizeProvider(new FieldSizeProvider(result));

    // TODO: finish this...
    int sizeOfAirlineUseField = bcbpFieldSizeProvider.getSizeOfForIndividualAirlineUseField();

    return result;
  }
}
