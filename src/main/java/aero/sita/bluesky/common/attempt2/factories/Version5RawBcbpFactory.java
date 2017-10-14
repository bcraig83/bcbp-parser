package aero.sita.bluesky.common.attempt2.factories;

import aero.sita.bluesky.common.attempt2.RawBcbp;
import aero.sita.bluesky.common.attempt2.RawBcbpFieldParserDecorator;
import aero.sita.bluesky.common.attempt2.fields.mandatory.*;

import java.util.ArrayList;
import java.util.List;

public class Version5RawBcbpFactory implements RawBcbpFactory {

    // TODO: I think a map would be better for this; easier to retrieve stuff out of it later.
    List<RawBcbpFieldParserDecorator> leaves = new ArrayList<>();


    // TODO: obviously the commonality between versions will need to be built in some type of common factory
    public Version5RawBcbpFactory() {

        leaves.add(new RawBcbpFieldParserDecorator(new FormatCode()));
        leaves.add(new RawBcbpFieldParserDecorator(new NumberOfLegsEncoded()));
        leaves.add(new RawBcbpFieldParserDecorator(new PassengerName()));
        leaves.add(new RawBcbpFieldParserDecorator(new ElectronicTicketIndicator()));
        leaves.add(new RawBcbpFieldParserDecorator(new OperatingCarrierPnrCode()));
        leaves.add(new RawBcbpFieldParserDecorator(new FromCityAirportCode()));
        leaves.add(new RawBcbpFieldParserDecorator(new ToCityAirportCode()));
        leaves.add(new RawBcbpFieldParserDecorator(new OperatingCarrierDesignator()));
        leaves.add(new RawBcbpFieldParserDecorator(new FlightNumber()));
        leaves.add(new RawBcbpFieldParserDecorator(new DateOfFlight()));
        leaves.add(new RawBcbpFieldParserDecorator(new CompartmentCode()));
        leaves.add(new RawBcbpFieldParserDecorator(new SeatNumber()));
        leaves.add(new RawBcbpFieldParserDecorator(new CheckinSequenceNumber()));
        leaves.add(new RawBcbpFieldParserDecorator(new PassengerStatus()));
        leaves.add(new RawBcbpFieldParserDecorator(new FieldSizeOfVaraibleSizeField()));
    }


    @Override
    public RawBcbp create() {
        return new RawBcbp(leaves);
    }
}
