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

    String data = "M1TESTER/TESTMR       EP12345 DUBLHRAI 0603 265Y002A0002 177>5321MM7264BAI 11111111111  2222222222   3333333333   2A014230029315301AI AI 123456789        2PCY*30602060L0922AIGBLND";

    SimpleTextParser result = factory.create();

    String resultString = result.parse(data);

    Assert.assertEquals("M", result.getItem("MandatoryItems", "FormatCode"));
    Assert.assertEquals("1", result.getItem("MandatoryItems", "NumberOfLegsEncoded"));
    Assert.assertEquals("TESTER/TESTMR       ", result.getItem("MandatoryItems", "PassengerName"));
    Assert.assertEquals("E", result.getItem("MandatoryItems", "ElectronicTicketIndicator"));
    Assert.assertEquals("P12345 ", result.getItem("MandatoryItems", "OperatingCarrierPnrCode"));
    Assert.assertEquals("DUB", result.getItem("MandatoryItems", "FromCityAirportCode"));
    Assert.assertEquals("LHR", result.getItem("MandatoryItems", "ToCityAirportCode"));
    Assert.assertEquals("AI ", result.getItem("MandatoryItems", "OperatingCarrierDesignator"));
    Assert.assertEquals("0603 ", result.getItem("MandatoryItems", "FlightNumber"));
    Assert.assertEquals("265", result.getItem("MandatoryItems", "DateOfFlight"));
    Assert.assertEquals("Y", result.getItem("MandatoryItems", "CompartmentCode"));
    Assert.assertEquals("002A", result.getItem("MandatoryItems", "SeatNumber"));
    Assert.assertEquals("0002 ", result.getItem("MandatoryItems", "CheckInSequenceNumber"));
    Assert.assertEquals("1", result.getItem("MandatoryItems", "PassengerStatus"));
    Assert.assertEquals("77", result.getItem("MandatoryItems", "FieldSizeOfVariableFieldSize"));



    //Assert.assertEquals("", resultString);
  }
}
