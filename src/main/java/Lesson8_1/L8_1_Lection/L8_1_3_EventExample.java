package Lesson8_1.L8_1_Lection;

//import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

public class L8_1_3_EventExample {

    public static void download (Runnable onComplete) {
        System.out.println("Загрузка началась");
        try {
            Thread.sleep(3000); // Симуляция загрузки файла
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Загрузка завершена");
        onComplete.run();
    }

    public static void main(String[] args) {
        Runnable onComplete = () ->{
            System.out.println("Уведомляем пользователя о завершении загрузки");
        };

        Runnable downloadInThread = () ->{
                download(onComplete);
        };

        new Thread(downloadInThread).start();


    }
}
