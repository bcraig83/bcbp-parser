package aero.sita.bluesky.common.attempt2;

import aero.sita.bluesky.common.attempt2.fields.RawBcbpField;

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

    RawBcbpField getLeaf(String key) {
        return leafMap.get(key);
    }

    String consume(String source) {

        for (RawBcbpFieldParserDecorator leaf : leafMap.values()) {
            source = leaf.consume(source);
        }

        return source;
    }
}