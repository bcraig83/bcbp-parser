package b3ls;

public class SimpleBcbpParserFactory implements BcbpParserFactory {


  private ParseableRawGroupFactory mandatoryItemsGroupFactory;
  private ParseableRawGroupFactory conditionalItemsGroupFactory;
  private ParseableRawGroupFactory securityDataItemsGroupFactory;

  private BcbpFieldSizeProvider bcbpFieldSizeProvider;

  SimpleBcbpParserFactory() {
    mandatoryItemsGroupFactory = new MandatoryItemsGroupFactory();
    conditionalItemsGroupFactory = new ConditionalItemsGroupFactory();
    securityDataItemsGroupFactory = new SecurityDataItemsGroupFactory();
  }

  @Override
  public SimpleTextParser create() {

    SimpleTextParser result = new SimpleTextParser();

    result.addRawGroupParser(mandatoryItemsGroupFactory.create());
    result.addRawGroupParser(conditionalItemsGroupFactory.create());
    //result.addRawGroupParser(securityDataItemsGroupFactory.create());

    // TODO: make a factory...
    bcbpFieldSizeProvider = new BcbpFieldSizeProvider(new FieldSizeProvider(result));

    // TODO: finish this...
    //int sizeOfAirlineUseField = bcbpFieldSizeProvider.getSizeOfForIndividualAirlineUseField();

    return result;
  }
}
