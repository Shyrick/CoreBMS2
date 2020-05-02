package Lesson7.L7_Practice.Task1;

import java.util.Arrays;

public class Task1_Text {
    String [] lines;

    public Task1_Text(String[] lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Tsk1_Text{" +
                "lines=" + Arrays.toString(lines) +
                '}';
    }
}
