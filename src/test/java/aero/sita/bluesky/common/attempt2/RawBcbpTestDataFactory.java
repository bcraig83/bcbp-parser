package aero.sita.bluesky.common.attempt2;

class RawBcbpTestDataFactory {

    static Object[] getTestData() {

        RawBcbpTestData result = new RawBcbpTestData();
        result.setRawData("M1DESMARAIS/LUC       EABC123 YULFRAAC 0834 226F001A0025 100");
        result.setExpectedFormatCode("M");
        result.setExpectedNumberOfLegsEncoded("1");

        return new Object[]{result};
    }
}
