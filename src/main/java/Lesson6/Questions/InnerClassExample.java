package Lesson6.Questions;

public class InnerClassExample {

    public static void main(String[] args) {
        Data data = new Data();
        data.str = "" + System.currentTimeMillis(); // возвращает время в милисекундах от 1 января 1970 г.
        data.time = System.currentTimeMillis();

        System.out.println(data);
    }

    public static class Data {
        public String str;
        public long time;

        @Override
        public String toString() {
            return "Data{" +
                    "str='" + str + '\'' +
                    ", time=" + time +
                    '}';
        }
    }
}

