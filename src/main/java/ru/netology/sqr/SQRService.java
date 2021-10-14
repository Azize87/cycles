package ru.netology.sqr;

public class SQRService {
    public int sqrRangeCounter(int rangeStart, int rangeEnd) {

        int counter = 0;

        for (int i = 10; i <= 99; i++) {

            int a = i*i;

            if(a >= rangeStart && a<=rangeEnd)
            {
                counter = counter +1;
            }

        }
        return counter;
    }






}
