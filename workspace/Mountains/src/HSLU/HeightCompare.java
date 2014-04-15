package HSLU;

import java.util.Comparator;

public class HeightCompare implements Comparator <Mountain> {
    public int compare(Mountain b1, Mountain b2) {
        return (b1.getHeight() - b2.getHeight());
    }
}