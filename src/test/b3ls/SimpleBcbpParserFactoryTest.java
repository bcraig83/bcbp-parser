package b3ls;

import org.junit.Assert;
import org.junit.Test;

public class SimpleBcbpParserFactoryTest {

  @Test
  public void shouldBuildSomething() {
    BcbpParserFactory factory = new SimpleBcbpParserFactory();

    SimpleTextParser result = factory.create();

    Assert.assertNotNull(result);
  }

  @Test
  public void shouldParseBasicData() {
    BcbpParserFactory factory = new SimpleBcbpParserFactory();

    String data = "M1AKHAVI RACI/GHISLAINEES9MDXCGVABODEZY1371 193 15C 2    30A1690974";

    SimpleTextParser result = factory.create();

    String resultString = result.parse(data);

    Assert.assertEquals("M", result.getItem("MandatoryItems", "FormatCode"));
    Assert.assertEquals("1", result.getItem("MandatoryItems", "NumberOfLegsEncoded"));
    Assert.assertEquals("AKHAVI RACI/GHISLAIN", result.getItem("MandatoryItems", "PassengerName"));
    Assert.assertEquals("E", result.getItem("MandatoryItems", "ElectronicTicketIndicator"));
    Assert.assertEquals("ES9MDXC", result.getItem("MandatoryItems", "OperatingCarrierPnrCode"));
    Assert.assertEquals("GVA", result.getItem("MandatoryItems", "FromCityAirportCode"));
    Assert.assertEquals("BOD", result.getItem("MandatoryItems", "ToCityAirportCode"));
    Assert.assertEquals("EZY", result.getItem("MandatoryItems", "OperatingCarrierDesignator"));
    Assert.assertEquals("1371 ", result.getItem("MandatoryItems", "FlightNumber"));
    Assert.assertEquals("193", result.getItem("MandatoryItems", "DateOfFlight"));
    Assert.assertEquals(" ", result.getItem("MandatoryItems", "CompartmentCode"));
    Assert.assertEquals("15C ", result.getItem("MandatoryItems", "SeatNumber"));
    Assert.assertEquals("2    ", result.getItem("MandatoryItems", "CheckInSequenceNumber"));
    Assert.assertEquals("3", result.getItem("MandatoryItems", "PassengerStatus"));
    Assert.assertEquals("0A", result.getItem("MandatoryItems", "FieldSizeOfVariableFieldSize"));

    //Assert.assertEquals("", resultString);
  }
}
