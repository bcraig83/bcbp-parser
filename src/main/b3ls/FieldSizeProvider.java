package b3ls;

class FieldSizeProvider {

  private SimpleTextParser parser;

  FieldSizeProvider(SimpleTextParser parser) {
    this.parser = parser;
  }

  int getSizeOf(String groupName, String itemName) {
    return Integer.parseInt(parser.getItem(groupName, itemName));
  }
}
