package aero.sita.bluesky.common.attempt2;

import aero.sita.bluesky.common.attempt2.fields.RawBcbpField;

public class RawBcbpFieldParserDecorator extends RawBcbpField {
    private RawBcbpField field;

    public RawBcbpFieldParserDecorator(RawBcbpField field) {
        this.field = field;
    }

    public String getName() {
        return field.getName();
    }

    public String getContents() {
        return field.getContents();
    }

    String consume(String source) {
        int amountToConsume = field.getSize();
        field.setContents(source.substring(0, amountToConsume));
        return source.substring(amountToConsume, source.length());
    }
}
