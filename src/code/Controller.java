package code;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    public Button exitButton;
    public Button loginButton;
    public Button registerButton;
    public PasswordField passField;
    public TextField usernameField;

    public void initialize() {
        exitButton.setOnAction(event -> {
            System.exit(0);
        });

        loginButton.setOnAction(event -> {
            String username = usernameField.getText();
            String password = passField.getText();


        });
    }
}
