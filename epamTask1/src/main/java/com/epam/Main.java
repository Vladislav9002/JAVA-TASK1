package com.epam;

import com.epam.array.exception.ArrayException;
import com.epam.array.service.ArrayService;
import com.epam.array.service.ArraySortService;
import com.epam.array.service.impl.ArrayServiceImpl;
import com.epam.array.service.impl.ArraySortServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.epam.array.entity.CustomArray;

public class Main {
    static Logger logger = LogManager.getLogger();

    static ArrayService arrayService = new ArrayServiceImpl();
    static ArraySortService sortService = new ArraySortServiceImpl();
    static final CustomArray basicArray1 = new CustomArray(new int[]{5, -2, 1, 16, 10, 3});
    static final CustomArray basicArray2 = new CustomArray(new int[]{5, -2, 1, 16, 10, 3});
    static final CustomArray zeroArray = new CustomArray(new int[]{});

    //static ArraySortService sortService = new ArraySortServiceImpl();

    public static void main(String[] args) throws ArrayException{

        arrayService.findAverage(basicArray1);
        arrayService.findMax(basicArray1);
        arrayService.replaceElement(basicArray1, 2, 1);
        sortService.sortInsertion(basicArray1);
        sortService.sortSelection(basicArray2);
        
        sortService.sortSelection(zeroArray);


    }
}