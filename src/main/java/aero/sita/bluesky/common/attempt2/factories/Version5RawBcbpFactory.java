package aero.sita.bluesky.common.attempt2.factories;

import aero.sita.bluesky.common.attempt2.RawBcbp;
import aero.sita.bluesky.common.attempt2.RawBcbpFieldParserDecorator;
import aero.sita.bluesky.common.attempt2.fields.FormatCode;

import java.util.ArrayList;
import java.util.List;

public class Version5RawBcbpFactory implements RawBcbpFactory {

    List<RawBcbpFieldParserDecorator> leaves = new ArrayList<>();

    public Version5RawBcbpFactory() {
        leaves.add(new RawBcbpFieldParserDecorator(new FormatCode()));
    }

    @Override
    public RawBcbp create() {
        return new RawBcbp(leaves);
    }
}
