package aero.sita.bluesky.common.attempt2.fields;

public abstract class RawBcbpField {
    protected int size;
    private String name;
    private String contents;

    public RawBcbpField() {
        this.name = this.getClass().getSimpleName();
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
