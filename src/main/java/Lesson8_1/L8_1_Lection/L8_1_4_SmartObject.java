package Lesson8_1.L8_1_Lection;

import java.util.ArrayList;

public class L8_1_4_SmartObject <T> {

    private ArrayList <Runnable> onUpdate = new ArrayList<>();
    private T value;

    public T getValue() {
        return value;
    }

    public ArrayList<Runnable> getOnUpdate() {
        return onUpdate;
    }

    public void setValue(T value) {
        this.value = value;

        for (int i = 0; i < onUpdate.size(); i++) {

            onUpdate.get(i).run(); // Здесь мы делаем так, чтобы при каждом переписывании значения переменной value
                                    // запускался каждый Runnable в массиве onUpdate
        }
//       for (Runnable onUpdate:this.onUpdate
//             ) {
//            onUpdate.run();
//        }
        // for each нельзя использовать, если будет меняться длина массива. Поэтому исп. обычный for

    }

}
