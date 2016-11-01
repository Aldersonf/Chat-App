package Chat_App;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Login_Interface.fxml"));
        primaryStage.setTitle("UCBC ChatApp");
        primaryStage.setScene(new Scene(root, 430, 650));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }{

    }
}