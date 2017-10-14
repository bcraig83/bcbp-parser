package aero.sita.bluesky.common.attempt2.factories;

import aero.sita.bluesky.common.attempt2.RawBcbp;
import aero.sita.bluesky.common.attempt2.RawBcbpFieldParserDecorator;
import aero.sita.bluesky.common.attempt2.fields.mandatory.*;

public class Version5RawBcbpFactory implements RawBcbpFactory {

    // TODO: obviously the commonality between versions will need to be built in some type of common factory


    private RawBcbp buildUpRawBcbp() {
        RawBcbp rawBcbp = new RawBcbp();

        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new FormatCode()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new NumberOfLegsEncoded()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new PassengerName()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new ElectronicTicketIndicator()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new OperatingCarrierPnrCode()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new FromCityAirportCode()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new ToCityAirportCode()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new OperatingCarrierDesignator()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new FlightNumber()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new DateOfFlight()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new CompartmentCode()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new SeatNumber()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new CheckinSequenceNumber()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new PassengerStatus()));
        rawBcbp.addLeaf(new RawBcbpFieldParserDecorator(new FieldSizeOfVaraibleSizeField()));

        return rawBcbp;
    }

    @Override
    public RawBcbp create() {
        return buildUpRawBcbp();
    }
}
