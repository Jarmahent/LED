/**
 * Created by Kevin on 2/3/2016.
 */
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class GUI extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    public void setRed(int red){
        this.red = red;
    }
    public int getRed(){
        return red;
    }

    @Override
    public void start(Stage primaryStage) {

        keyPressedLed on = new keyPressedLed();
        double height = 300.0;
        double width = 300.0;

        primaryStage.setTitle("Logitech");
        primaryStage.setResizable(false);


        Image g = new Image("g.png");
        ImageView gt = new ImageView();
        gt.setImage(g);
        gt.setFitWidth(300);
        gt.setPreserveRatio(true);
        gt.setSmooth(true);
        gt.setCache(true);

        Text txtr = new Text();
        txtr.setId("txtr");
        txtr.setText("Red Percentage");

        Text txtg = new Text();
        txtg.setId("txtg");
        txtg.setText("Green Percentage");

        Text txtb = new Text();
        txtb.setId("txtb");
        txtb.setText("Blue Percentage");


        ScrollBar sct = new ScrollBar();  //2
        int val_o = (int) sct.getValue();
        sct.setMin(0);
        sct.setMax(100);

        ScrollBar scth = new ScrollBar(); //3
        int val_t = (int) scth.getValue();
        scth.setMin(0);
        scth.setMax(100);

        ScrollBar sc = new ScrollBar();  //1
        int val_th = (int) sc.getValue();
        sc.setMin(0);
        sc.setMax(100);

        Button btn = new Button();
        Button btnt = new Button();
        btn.setText("Stop Effects");
        btn.setText("Launch Keyboard lights");
        btnt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                on.start();

            }
        });

        sc.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                setRed((int) sc.getValue());
                //red = (int) sc.getValue();

                System.out.println(getRed());
            }
        });


        sct.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                int val = (int) sct.getValue();
                System.out.println(val);
            }
        });

        scth.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                int val = (int) scth.getValue();
                System.out.println(val);
            }
        });

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                on.interrupt();
            }
        });

        AnchorPane root = new AnchorPane();

        root.getChildren().add(btn);
        root.getChildren().add(sc);
        root.getChildren().add(sct);
        root.getChildren().add(scth);
        root.getChildren().addAll(txtr, txtg, txtb, gt);

        root.setLeftAnchor(btn, 75.0);      //Button1
        root.setBottomAnchor(btn, 10.0);

        root.setTopAnchor(sc, 10.0);  //Scroll1
        root.setLeftAnchor(sc, 110.0);

        root.setTopAnchor(sct, 25.0);  //Scroll 2
        root.setLeftAnchor(sct, 110.0);

        root.setTopAnchor(scth, 40.0);  //Scroll 3
        root.setLeftAnchor(scth, 110.0);

        root.setTopAnchor(txtr, 10.0);
        root.setLeftAnchor(txtr, 5.0);  //Text red

        root.setTopAnchor(txtg, 25.0);
        root.setLeftAnchor(txtg, 4.0);   //text Green

        root.setTopAnchor(txtb, 40.0);   //Text Blue
        root.setLeftAnchor(txtb, 5.0);

        root.setTopAnchor(gt, 80.0);

        Scene set = new Scene(root, width, height);
        set.getStylesheets().add("style.css");
        primaryStage.setScene(set);


        primaryStage.show();
    }private int red;

}
