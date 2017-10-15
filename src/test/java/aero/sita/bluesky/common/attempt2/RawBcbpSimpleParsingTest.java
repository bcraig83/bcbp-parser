package aero.sita.bluesky.common.attempt2;

import aero.sita.bluesky.common.attempt2.factories.RawBcbpFactory;
import aero.sita.bluesky.common.attempt2.factories.Version5RawBcbpFactory;
import aero.sita.bluesky.common.attempt2.fields.RawBcbpField;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RawBcbpSimpleParsingTest {

    private RawBcbpFactory factory;
    private RawBcbp fixture;
    private String result;

    @Before
    public void setUp() throws Exception {
        factory = new Version5RawBcbpFactory();
        fixture = factory.create();
        result = fixture.consume("M1DESMARAIS/LUC       EABC123 YULFRAAC 0834 226F001A0025 100");
    }

    @Test
    public void shouldDoSimpleParse() {
        Assert.assertEquals("", result);
    }

    @Test
    public void shouldParseFormatCode() {
        RawBcbpField field = fixture.getLeaf("FormatCode");

        Assert.assertEquals("FormatCode", field.getName());
        Assert.assertEquals("M", field.getContents());
    }

    @Test
    public void shouldParseNumberOfLegsEncoded() {
        RawBcbpField field = fixture.getLeaf("NumberOfLegsEncoded");

        Assert.assertEquals("NumberOfLegsEncoded", field.getName());
        Assert.assertEquals("1", field.getContents());
    }

    @Test
    public void shouldParsePassengerName() {
        RawBcbpField field = fixture.getLeaf("PassengerName");

        Assert.assertEquals("PassengerName", field.getName());
        Assert.assertEquals("DESMARAIS/LUC       ", field.getContents());
    }

    @Test
    public void shouldParseElectronicTicketIndicator() {
        RawBcbpField field = fixture.getLeaf("ElectronicTicketIndicator");

        Assert.assertEquals("ElectronicTicketIndicator", field.getName());
        Assert.assertEquals("E", field.getContents());
    }

    @Test
    public void shouldParseOperatingCarrierPnrCode() {
        RawBcbpField field = fixture.getLeaf("OperatingCarrierPnrCode");

        Assert.assertEquals("OperatingCarrierPnrCode", field.getName());
        Assert.assertEquals("ABC123 ", field.getContents());
    }

    @Test
    public void shouldParseFromCityAirportCode() {
        RawBcbpField field = fixture.getLeaf("FromCityAirportCode");

        Assert.assertEquals("FromCityAirportCode", field.getName());
        Assert.assertEquals("YUL", field.getContents());
    }

    @Test
    public void shouldParseToCityAirportCode() {
        RawBcbpField field = fixture.getLeaf("ToCityAirportCode");

        Assert.assertEquals("ToCityAirportCode", field.getName());
        Assert.assertEquals("FRA", field.getContents());
    }

    @Test
    public void shouldParseOperatingCarrierDesignator() {
        RawBcbpField field = fixture.getLeaf("OperatingCarrierDesignator");

        Assert.assertEquals("OperatingCarrierDesignator", field.getName());
        Assert.assertEquals("AC ", field.getContents());
    }

    @Test
    public void shouldParseFlightNumber() {
        RawBcbpField field = fixture.getLeaf("FlightNumber");

        Assert.assertEquals("FlightNumber", field.getName());
        Assert.assertEquals("0834 ", field.getContents());
    }

    @Test
    public void shouldParseDateOfFlight() {
        RawBcbpField field = fixture.getLeaf("DateOfFlight");

        Assert.assertEquals("DateOfFlight", field.getName());
        Assert.assertEquals("226", field.getContents());
    }

    @Test
    public void shouldParseCompartmentCode() {
        RawBcbpField field = fixture.getLeaf("CompartmentCode");

        Assert.assertEquals("CompartmentCode", field.getName());
        Assert.assertEquals("F", field.getContents());
    }

    @Test
    public void shouldParseSeatNumber() {
        RawBcbpField field = fixture.getLeaf("SeatNumber");

        Assert.assertEquals("SeatNumber", field.getName());
        Assert.assertEquals("001A", field.getContents());
    }

    @Test
    public void shouldParseCheckinSequenceNumber() {
        RawBcbpField field = fixture.getLeaf("CheckinSequenceNumber");

        Assert.assertEquals("CheckinSequenceNumber", field.getName());
        Assert.assertEquals("0025 ", field.getContents());
    }

    @Test
    public void shouldParsePassengerStatus() {
        RawBcbpField field = fixture.getLeaf("PassengerStatus");

        Assert.assertEquals("PassengerStatus", field.getName());
        Assert.assertEquals("1", field.getContents());
    }

    @Test
    public void shouldParseFieldSizeOfVaraibleSizeField() {
        RawBcbpField field = fixture.getLeaf("FieldSizeOfVaraibleSizeField");

        Assert.assertEquals("FieldSizeOfVaraibleSizeField", field.getName());
        Assert.assertEquals("00", field.getContents());
    }
}