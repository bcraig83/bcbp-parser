package b3ls;

class BcbpFieldSizeProvider {

  private static final int SIZE_OF_CONDITIONAL_BLOCK = 98;

  private FieldSizeProvider fieldSizeProvider;

  BcbpFieldSizeProvider(FieldSizeProvider fieldSizeProvider) {
    this.fieldSizeProvider = fieldSizeProvider;
  }

  int getSizeOfForIndividualAirlineUseField() {
    int fieldSize = fieldSizeProvider.getSizeOf("MandatoryItems", "FieldSizeOfVariableFieldSize");
    return fieldSize - SIZE_OF_CONDITIONAL_BLOCK;
  }
}
