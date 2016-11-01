package Chat_App;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;
import javafx.event.ActionEvent;
import java.io.IOException;

import static java.awt.SystemColor.window;

public class LoginController {


    @FXML
    private GridPane Login_Grid;

    @FXML
    private ImageView UCBC_Logo;

    @FXML
    private JFXTextField Username_Field;

    @FXML
    private JFXPasswordField Password_Field;

    @FXML
    private JFXButton Login_Button;

    @FXML
    private JFXTextField Hostname_Feild;

    @FXML
    private JFXTextField Port_Field;

    @FXML
    private Label Label_ServerDetials;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {

          String username = Username_Field.getText();
          String password = Password_Field.getText();


        if (username.equals("Admin") && password.equals("Password")){
            System.out.println("Login Successful...");
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Chat_Interface.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();

                // Used to hide the LoginInterface
                ((Node)(event.getSource())).getScene().getWindow().hide();
            }
            catch (Exception e){
                System.out.println("Cant Load new window...");
            }
        }

        else {
            System.out.println("Login unsuccessful...");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Login");
            alert.setHeaderText("Please check both username and password are correct");
            alert.setContentText("Ooops, there was an error!");

            alert.showAndWait();
        }
    }


}
