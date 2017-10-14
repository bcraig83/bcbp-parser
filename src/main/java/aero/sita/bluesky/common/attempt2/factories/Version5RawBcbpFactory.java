package aero.sita.bluesky.common.attempt2.factories;

import aero.sita.bluesky.common.attempt2.RawBcbp;
import aero.sita.bluesky.common.attempt2.RawBcbpFieldParserDecorator;
import aero.sita.bluesky.common.attempt2.fields.mandatory.FormatCode;

import java.util.ArrayList;
import java.util.List;

public class Version5RawBcbpFactory implements RawBcbpFactory {

    List<RawBcbpFieldParserDecorator> leaves = new ArrayList<>();


    // TODO: obviously the commonality between versions will need to be built in some type of common factory
    public Version5RawBcbpFactory() {
        leaves.add(new RawBcbpFieldParserDecorator(new FormatCode()));
    }


    @Override
    public RawBcbp create() {
        return new RawBcbp(leaves);
    }
}
