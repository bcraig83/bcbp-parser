package aero.sita.bluesky.common.attempt2;

import java.util.List;

class RawBcbpGroup {

    private List<RawBcbpLeaf> leaves;

    List<RawBcbpLeaf> getLeaves() {
        return leaves;
    }

    RawBcbpGroup(List<RawBcbpLeaf> leaves) {
        this.leaves = leaves;
    }

    String consume(String source) {
        for (RawBcbpLeaf leaf : leaves) {
            source = leaf.consume(source);
        }

        return source;
    }
}