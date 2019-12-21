package Lesson5_2.L52_practice;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WindowForms {

    Store store;
    Text createFormName;
    TextField tfName, tfAmount, tfDescription, tfPrice, tfShelfLife, tfFindId;
    Button saveButton, choiceButton, buyButton, toMainButton, toTheShopButton, addProductButton;
    ChoiceBox<String> productChoiceBox;

    private static final int WIDTH = 800;
    private static final int HEIGTH = 700;
    private static final int MAX_WIDTH = 1400;
    private static final int MAX_HEIGTH = 800;
    private static final int MIN_WIDTH = 800;
    private static final int MIN_HEIGTH = 700;

    public WindowForms(Store store) {
        this.store = store;
    }

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGTH);
        primaryStage.setMaxWidth(MAX_WIDTH);
        primaryStage.setMaxHeight(MAX_HEIGTH);
        primaryStage.setMinWidth(MIN_WIDTH);
        primaryStage.setMinHeight(MIN_HEIGTH);
        primaryStage.setTitle("MyStore");
        primaryStage.titleProperty();
    }

    public void helloyMenuSetup (Pane frontRoot){
        frontRoot.getChildren().clear();

        Text text1 = new Text("Добро пожаловать в Магазин !!!");
        text1.setTranslateX(30);
        text1.setTranslateY(30);
        Font font = new Font(22);
        text1.setFont(font);

        toTheShopButtonSetup(frontRoot);
        addProductButtonSetup(frontRoot);

        frontRoot.getChildren().addAll(text1);
    }

    public void toTheShopButtonSetup (Pane frontRoot){
        this.toTheShopButton = new Button("В магазин");
        toTheShopButton.setTranslateX(70);
        toTheShopButton.setTranslateY(70);

        frontRoot.getChildren().addAll(toTheShopButton);
    }

    public void addProductButtonSetup (Pane frontRoot){
        this.addProductButton = new Button("Добавить товар");
        addProductButton.setTranslateX(200);
        addProductButton.setTranslateY(70);

        frontRoot.getChildren().addAll(addProductButton);
    }

    public void choiceFieldAndButtonSetup (Pane frontRoot) {

        Text text7 = new Text("Введите id товара в выбранной категории");
        text7.setTranslateX(50);
        text7.setTranslateY(300);
        this.tfFindId = new TextField();
        tfFindId.setTranslateX(50);
        tfFindId.setTranslateY(320);
        this.choiceButton = new Button("Выбрать");
        choiceButton.setTranslateX(250);
        choiceButton.setTranslateY(320);
        frontRoot.getChildren().addAll(text7, tfFindId, choiceButton);
    }

    public void buyMenuSetup(Pane frontRoot) {

        frontRoot.getChildren().clear();
        Text text1 = new Text("Вы выбрали товар:");
        text1.setTranslateX(30);
        text1.setTranslateY(30);
        Font font = new Font(16);
        text1.setFont(font);

        Text text2 = new Text(store.curentProduct.toString());
        text2.setTranslateX(30);
        text2.setTranslateY(60);

        this.buyButton = new Button("Купить");
        buyButton.setTranslateX(50);
        buyButton.setTranslateY(150);

        if (store.curentProduct.getAmount() != 0){

            frontRoot.getChildren().addAll( buyButton);
        }else {
            Text text3 = new Text("Данный товар отсутсвует!!!");
            text3.setTranslateX(30);
            text3.setTranslateY(90);
            text3.setFont(font);
            frontRoot.getChildren().addAll(text3);
        }
        frontRoot.getChildren().addAll(text1, text2);
    }

    public void toMainButtonSetup(Pane frontRoot) {
    this.toMainButton = new Button("На главную");
        toMainButton.setTranslateX(250);
        toMainButton.setTranslateY(150);
        frontRoot.getChildren().addAll(toMainButton);
    }

    public void productChoiceBoxSetup (Pane frontRoot){
        frontRoot.getChildren().clear();
        Text text1 = new Text("Выберите категорию");
        text1.setTranslateX(70);
        text1.setTranslateY(140);
        //ChoiceBox категорий
        String [] categoryArray = store.products;
        ObservableList<String> category = FXCollections.observableArrayList(categoryArray);
        this.productChoiceBox = new ChoiceBox<String>(category);
//        productChoiceBox.setValue(store.products [0]); // значение по умолчанию
        this.productChoiceBox.setTooltip(new Tooltip("Select the category")); // выпадающее окно при наведении
        this.productChoiceBox.setTranslateX(70);
        this.productChoiceBox.setTranslateY(150);

        frontRoot.getChildren().addAll(text1, productChoiceBox);
    }

    public void youHaveBuyItMenuSetup (Pane frontRoot){
        Text text1 = new Text("Спасибо за покупку !!!");
        text1.setTranslateX(30);
        text1.setTranslateY(30);
        Font font = new Font(22);
        text1.setFont(font);

        frontRoot.getChildren().addAll(text1);
    }

    public void createSmartfoneForm(Pane frontRoot) {
        frontRoot.getChildren().clear();

        this.createFormName = new Text("Новый товар в категорию Смартфон");
        createFormName.setTranslateX(30);
        createFormName.setTranslateY(30);

        Text text2 = new Text("Наименование");
        text2.setTranslateX(50);
        text2.setTranslateY(100);
        this.tfName = new TextField();
        tfName.setTranslateX(50);
        tfName.setTranslateY(120);

        Text text3 = new Text("Количество");
        text3.setTranslateX(250);
        text3.setTranslateY(100);
        this.tfAmount = new TextField();
        tfAmount.setTranslateX(250);
        tfAmount.setTranslateY(120);

        Text text4 = new Text("Описание");
        text4.setTranslateX(50);
        text4.setTranslateY(200);
        this.tfDescription = new TextField();
        tfDescription.setTranslateX(50);
        tfDescription.setTranslateY(220);

        Text text5 = new Text("Цена");
        text5.setTranslateX(250);
        text5.setTranslateY(200);
        this.tfPrice = new TextField();
        tfPrice.setTranslateX(250);
        tfPrice.setTranslateY(220);

        this.saveButton = new Button("Сохранить");
        saveButton.setTranslateX(50);
        saveButton.setTranslateY(350);


        frontRoot.getChildren().addAll(createFormName, text2, text3, text4, text5,
                tfAmount, tfDescription, tfName, tfPrice, saveButton);
    }

    public void createVegetableForm(Pane frontRoot) {
        createSmartfoneForm(frontRoot);
        this.createFormName.setText("Новый товар в категорию Овощи");

        Text text6 = new Text("Срок годности");
        text6.setTranslateX(50);
        text6.setTranslateY(300);
        this.tfShelfLife = new TextField();
        tfShelfLife.setTranslateX(50);
        tfShelfLife.setTranslateY(320);

        frontRoot.getChildren().addAll(text6,tfShelfLife);
    }

    public void createWaterForm(Pane frontRoot) {
        createSmartfoneForm(frontRoot);
        this.createFormName.setText("Новый товар в категорию Вода");
    }


}
