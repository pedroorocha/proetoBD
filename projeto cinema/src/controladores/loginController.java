package controladores;
import cinema.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class loginController {

    private Parent loginDetail;
    private Scene login;

    public loginController(){

    }

    @FXML
    private Button ButtonId;

    @FXML
    private TextField LoginId;

    @FXML
    private TextField PassId;

    @FXML
    void doLogin(ActionEvent event) {
        if(LoginId.getText().equals("usuario") &&  PassId.getText().equals("senha")){
            App.changeScreen(1);
            System.out.println("rolou");
        }
    }

    public Parent getLoginDetail() {
        return loginDetail;
    }
    public void setLoginDetail(Parent loginDetail) {
        this.loginDetail = loginDetail;
    }

    public Scene getLogin() {
        return login;
    }
    public void setLogin(Scene login) {
        this.login = login;
    }
}
