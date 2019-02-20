package com.github.intellectualsites.plotsquared.plot.util;

import java.util.Arrays;

public class ArrayUtil {
    public static final <T> T[] concatAll(T[] first, T[]... rest) {
        int totalLength = first.length;
        totalLength += Arrays.stream(rest).mapToInt(array -> array.length).sum();
        T[] result = Arrays.copyOf(first, totalLength);
        int offset = first.length;
        for (T[] array : rest) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }
        return result;
    }
}
