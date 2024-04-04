package com.epam.array.service.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.exception.ArrayException;
import com.epam.array.service.ArraySortService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortServiceImplTest {
    static int[] array = {3, 7, 2, 1, 8};
    CustomArray customArray = new CustomArray(array);
    ArraySortService sortService = new ArraySortServiceImpl();

    @Test
    void sortSelection() throws ArrayException {

        sortService.sortSelection(customArray);

        int[] actual = customArray.getArray();
        int[] expected = {1, 2, 3, 7, 8};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void sortInsertion() throws ArrayException {

        sortService.sortInsertion(customArray);

        int[] actual = customArray.getArray();
        int[] expected = {1, 2, 3, 7, 8};

        Assertions.assertArrayEquals(actual, expected);
    }

}