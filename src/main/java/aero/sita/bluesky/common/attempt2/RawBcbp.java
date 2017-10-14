package aero.sita.bluesky.common.attempt2;

import java.util.LinkedHashMap;
import java.util.Map;

public class RawBcbp {

    // TODO: shouldn't be a string - should use an enum as the key?
    // If so, we don't need typed versions of the fields.
    private Map<String, RawBcbpFieldParserDecorator> leafMap;

    public RawBcbp() {
        leafMap = new LinkedHashMap<>();
    }

    public void addLeaf(RawBcbpFieldParserDecorator leaf) {
        leafMap.put(leaf.getName(), leaf);
    }

    RawBcbpFieldParserDecorator getLeaf(String key) {
        return leafMap.get(key);
    }

    String consume(String source) {

        for (RawBcbpFieldParserDecorator leaf : leafMap.values()) {
            source = leaf.consume(source);
        }

        return source;
    }
}