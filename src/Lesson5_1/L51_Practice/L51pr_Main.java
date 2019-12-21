package Lesson5_1.L51_Practice;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class L51pr_Main extends Application {


    public static void main(String[] args) {
        launch (args);

//        System.out.println(point1.calculateLength());    Выполняется только после закрытия окна!!!!
//        System.out.println(point1.calculateLength());


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        L51pr_Window window = new L51pr_Window();
        Pane root = new Pane();
        Pane fractalRoot = new Pane();
        root.getChildren().addAll(fractalRoot);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        window.windowSetup(primaryStage);

        primaryStage.show();

//        window.uISetup(root);
        L51pr1_Point p1 = new L51pr1_Point(100, 200);
        L51pr1_Point p2 = new L51pr1_Point( 70, 70);
        L51pr1_Point p3 = new L51pr1_Point( 400, 400);
        L51pr_Line line1 = new L51pr_Line(p1, p2);
        L51pr_Line line2 = new L51pr_Line(p2, p3);
        L51pr_Line line3 = new L51pr_Line(p3, p1);

//            line1.drawLine(root);
//            line2.drawLine(root);
//            line1.clearLine(root);

//        Line line2 = new Line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
//        window.addLineToRoot(root, line1.lineFx);

//        System.out.println(p1.calculateLength());
        L51pr1_Point p4 = p1.normolize();
//        System.out.println(p4.calculateLength());
//        System.out.println(p1.normolize().calculateLength());

//        L51pr1_Point p4 = line1.getPointOnLine(1f);
//        Circle c1 = new Circle(p4.getX(), p4.getY(), 5);
//        window.addCircleToRoot(root, c1);
        // Или так:
//        line1.showPointOnLine(root, 0f);

        L51pr_Triangle tr1 = new L51pr_Triangle(p1, p2, p3);
        tr1.drawTriangle(root);

//        L51pr_Fractal fr1 = new L51pr_Fractal(3, 0.2f );
//        fr1.draw(fractalRoot, tr1);


        window.FractalWindowSetup(root, fractalRoot, tr1 );


    }
}
