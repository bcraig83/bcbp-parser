package aero.sita.bluesky.common.attempt2;

class RawBcbpLeaf {
    private RawBcbpField field;

    RawBcbpLeaf(RawBcbpField field) {
        this.field = field;
    }

    RawBcbpField getField() {
        return field;
    }

    String consume(String source) {
        int amountToConsume = field.getSize();
        field.setContents(source.substring(0, amountToConsume));
        return source.substring(amountToConsume, source.length());
    }
}
