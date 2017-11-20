package b3ls;

public class MandatoryItemsGroupFactory implements ParseableRawGroupFactory {

  public ParseableRawGroup create() {
    RawGroup mandatoryItems = new RawGroup("MandatoryItems");

    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(1, "FormatCode")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(1, "NumberOfLegsEncoded")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(20, "PassengerName")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(1, "ElectronicTicketIndicator")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(7, "OperatingCarrierPnrCode")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(3, "FromCityAirportCode")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(3, "ToCityAirportCode")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(3, "OperatingCarrierDesignator")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(5, "FlightNumber")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(3, "DateOfFlight")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(1, "CompartmentCode")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(4, "SeatNumber")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(5, "CheckInSequenceNumber")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(1, "PassengerStatus")));
    mandatoryItems.addRawFieldParser(new ParseableRawField(new RawField(2, "FieldSizeOfVariableFieldSize")));

    return new ParseableRawGroup(mandatoryItems);
  }
}
