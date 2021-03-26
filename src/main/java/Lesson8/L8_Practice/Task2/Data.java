package Lesson8.L8_Practice.Task2;

import java.util.Arrays;

public class Data {
    public long [] numbers;

    public Data(long[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Data{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
