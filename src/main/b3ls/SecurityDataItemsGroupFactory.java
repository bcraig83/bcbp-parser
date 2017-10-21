package b3ls;

public class SecurityDataItemsGroupFactory implements ParseableRawGroupFactory {

  @Override
  public ParseableRawGroup create() {
    RawGroup securityData = new RawGroup("SecurityDataItems");

    securityData.addRawFieldParser(new ParseableRawField(new RawField(1, "BeginningOfSecurityData")));
    securityData.addRawFieldParser(new ParseableRawField(new RawField(1, "TypeOfSecurityData")));
    securityData.addRawFieldParser(new ParseableRawField(new RawField(2, "LengthOfSecurityData")));
    securityData.addRawFieldParser(new ParseableRawField(new RawField(100, "SecurityDataSecurityData")));

    return new ParseableRawGroup(securityData);
  }
}
