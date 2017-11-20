package b3ls;

public class ConditionalItemsGroupFactory implements ParseableRawGroupFactory {

  @Override
  public ParseableRawGroup create() {

    RawGroup conditionalItems = new RawGroup("ConditionalItems");

    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(1, "BeginningOfVersionNumber")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(1, "VersionNumber")));

    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(2, "FieldSizeOfFollowingStructuredMessageUnique")));

    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(1, "PassengerDescription")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(1, "SourceOfCheckIn")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(1, "SourceOfBoardingPassIssuance")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(4, "DateOfIssueOfBoardingPass")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(1, "DocumentType")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(3, "AirlineDesignatorOfBoardingPassIssuer")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(13, "BaggageTagLicensePlateNumber")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(13, "FirstNonConsecutiveBaggageTagLicensePlateNumber")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(13, "SecondNonConsecutiveBaggageTagLicensePlateNumber")));

    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(2, "FieldSizeOfFollowingStructuredMessageRepeated")));

    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(3, "AirlineNumericCode")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(10, "DocumentForm")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(1, "SelecteeIndicator")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(1, "InternationalDocumentationVerification")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(3, "MarketingCarrierDesignator")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(3, "FrequentFlyerAirlineDesignator")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(16, "FrequentFlyerNumber")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(1, "InternationalDocumentationVerification")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(1, "IdadIndicator")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(3, "FreeBaggageAllowance")));
    conditionalItems.addRawFieldParser(new ParseableRawField(new RawField(1, "FastTrack")));

    return new ParseableRawGroup(conditionalItems);
  }
}
