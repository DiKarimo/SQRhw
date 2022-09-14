package ru.netology.javahw5.sqr;

public class SQRService {

    public int calcSQR(int min, int max) {
        int it = 0;
        for (int i = 10; i <= 99; i++) {
            int sqrt = i * i;
            if (sqrt >= min && sqrt <= max) {
                it++;
            }
        }
        return  it;
    }

}
