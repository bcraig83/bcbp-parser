package aero.sita.bluesky.common.attempt2;

import java.util.List;

public class RawBcbp {

    private List<RawBcbpFieldParserDecorator> leaves;

    public RawBcbp(List<RawBcbpFieldParserDecorator> leaves) {
        this.leaves = leaves;
    }

    List<RawBcbpFieldParserDecorator> getLeaves() {
        return leaves;
    }

    String consume(String source) {
        for (RawBcbpFieldParserDecorator leaf : leaves) {
            source = leaf.consume(source);
        }

        return source;
    }
}