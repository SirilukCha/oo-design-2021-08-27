import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Range {
    private String input;

    public Range(String text) {
        this.input = text;
    }

    public boolean isStartWithInclusive() {
        return this.input.startsWith("[");
    }

    public int getStartInput() {
        return Integer.parseInt(this.input.substring(1,2));
    }

    public boolean isEndWithInclusive() {
        return this.input.endsWith("]");
    }
}
