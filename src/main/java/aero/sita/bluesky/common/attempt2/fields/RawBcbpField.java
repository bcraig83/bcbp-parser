package aero.sita.bluesky.common.attempt2.fields;

public abstract class RawBcbpField {
    protected int size;
    private String name;
    private String contents;

    RawBcbpField() {
        this.name = this.getClass().getSimpleName();
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
