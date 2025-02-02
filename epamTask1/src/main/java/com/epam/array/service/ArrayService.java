package com.epam.array.service;

import com.epam.array.entity.CustomArray;

public interface ArrayService {
    int findMax(CustomArray array);
    int findMin(CustomArray array);

    double findAverage(CustomArray array);

    int findSum(CustomArray array);

    int findNumMinus(CustomArray array);

    void replaceElement(CustomArray array, int el, int index);


}
