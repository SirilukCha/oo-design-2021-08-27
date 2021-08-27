public class Range {
    private String input;

    public Range(String text) {
        this.input = text;
    }

    public boolean isStartWithInclusive() {
        return this.input.startsWith("[");
    }

    public boolean isStartWithNumber() {
        return this.input.startsWith("[");
    }
}
