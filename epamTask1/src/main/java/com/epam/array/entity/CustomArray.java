package com.epam.array.entity;


import com.epam.array.util.IdGenerator;

import java.util.Arrays;

public class CustomArray {
    private int[] array;
    private int arrayId;


    public CustomArray(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
        this.arrayId = IdGenerator.generateId();
    }


    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                ", arrayId=" + arrayId +
                '}';
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getElement(int index) {
        return array[index];
    }

    public int length() {
        return array.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray that = (CustomArray) o;

        if (arrayId != that.arrayId) return false;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(array);
        result = 31 * result + arrayId;
        return result;
    }
}
