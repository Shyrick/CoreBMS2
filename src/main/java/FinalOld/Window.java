package FinalOld;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Window {

    UserController userController;

    private static final int WIDTH = 800;
    private static final int HEIGTH = 700;
    private static final int MAX_WIDTH = 800;
    private static final int MAX_HEIGTH = 700;
    private static final int MIN_WIDTH = 800;
    private static final int MIN_HEIGTH = 700;


    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGTH);
        primaryStage.setMaxWidth(MAX_WIDTH);
        primaryStage.setMaxHeight(MAX_HEIGTH);
        primaryStage.setMinWidth(MIN_WIDTH);
        primaryStage.setMinHeight(MIN_HEIGTH);
        primaryStage.setTitle("FinalOld");
        primaryStage.titleProperty();
    }



//    public Window(Stage primaryStage) {
//        super(primaryStage);
//    }

    /*
    *
    */

    public void firstMenu (Pane frontRoot){
        frontRoot.getChildren().clear();

        Button button1 = new Button("Войти");
        button1.setTranslateX(200);
        button1.setTranslateY(150);
        button1.setOnAction(event -> {
            loginMenu_1_1(frontRoot);
        } );

        Button button2 = new Button("зарегестрироваться");
        button2.setTranslateX(400);
        button2.setTranslateY(150);

        frontRoot.getChildren().addAll(button1, button2);
    }

    private void loginMenu_1_1(Pane frontRoot) {
        frontRoot.getChildren().clear();

        Text text1 = new Text("Login");
        text1.setTranslateX(300);
        text1.setTranslateY(160);
        TextField tf1 = new TextField();
        tf1.setTranslateX(400);
        tf1.setTranslateY(150);

        Text text2 = new Text("Pasword");
        text2.setTranslateX(300);
        text2.setTranslateY(210);
        TextField tf2 = new TextField();
        tf2.setTranslateX(400);
        tf2.setTranslateY(200);

        Button button1 = new Button("Войти");
        button1.setTranslateX(400);
        button1.setTranslateY(300);
        button1.setOnAction(event -> {
            firstMenu(frontRoot);
        } );

        frontRoot.getChildren().addAll(button1, tf1, tf2, text1, text2);
    }


}
