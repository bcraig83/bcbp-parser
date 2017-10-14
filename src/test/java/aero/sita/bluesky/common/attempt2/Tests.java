package aero.sita.bluesky.common.attempt2;

import aero.sita.bluesky.common.attempt2.fields.RawBcbpField;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {

//    @Test
//    public void leafTest() {
//        RawBcbpField field = new RawBcbpField(1, "FirstField");
//        RawBcbpLeaf fixture = new RawBcbpLeaf(field);
//
//        String result = fixture.consume("ABC");
//
//        Assert.assertEquals("BC", result);
//        RawBcbpField resultField = fixture.getField();
//        Assert.assertEquals("A", resultField.getContents());
//    }

//    @Test
//    public void groupTest() {
//
//        RawBcbpLeaf leaf1 = new RawBcbpLeaf(new RawBcbpField(1, "FirstField"));
//        RawBcbpLeaf leaf2 = new RawBcbpLeaf(new RawBcbpField(3, "SecondField"));
//        RawBcbpLeaf leaf3 = new RawBcbpLeaf(new RawBcbpField(2, "ThirdField"));
//
//
//        List<RawBcbpLeaf> leaves = new ArrayList<>();
//        leaves.add(leaf1);
//        leaves.add(leaf2);
//        leaves.add(leaf3);
//
//        rawBcbp group = new rawBcbp(leaves);
//
//        String result = group.consume("ABCDEFG");
//        Assert.assertEquals("G", result);
//
//        List<RawBcbpLeaf> resultLeaves = group.getLeaves();
//        Assert.assertEquals("A", resultLeaves.get(0).getField().getContents());
//        Assert.assertEquals("BCD", resultLeaves.get(1).getField().getContents());
//        Assert.assertEquals("EF", resultLeaves.get(2).getField().getContents());
//
//    }
}
