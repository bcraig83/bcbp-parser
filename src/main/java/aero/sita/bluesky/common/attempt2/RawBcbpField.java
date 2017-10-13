package aero.sita.bluesky.common.attempt2;

public class RawBcbpField {
    private int size;
    private String name;
    private String contents;

    RawBcbpField(int size, String name) {
        this.size = size;
        this.name = name;
    }

    int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    String getContents() {
        return contents;
    }

    void setContents(String contents) {
        this.contents = contents;
    }
}
