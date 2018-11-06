package lesson_8.VladimirPle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTest {

    @Test
    void concatenetaArrays() {
        int[] arr1 = {1, 2, 5};
        int[] arr2 = {3, 4};
        int[] resArr = {1, 2, 3, 4, 5};
        Concatenate concatenate = new Concatenate(arr1, arr2);
        assertArrayEquals(resArr, concatenate.concatenetaArrays());
    }
}