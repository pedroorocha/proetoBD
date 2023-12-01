package cinema;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import controladores.loginController;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private static Stage stage;

    private static Scene login,home;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //FXMLLoader fxmloader = new FXMLLoader(getClass().getResource("/telas/loginScreen.fxml"));
        //System.out.print(getClass().getResource("/telas/loginScreen.fxml"));
        stage = primaryStage;
        Parent loginDetails = FXMLLoader.load(getClass().getResource("/Telas Definitivas/tela_login.fxml"));
        login = new Scene(loginDetails);
        
        Parent homeDetails = FXMLLoader.load(getClass().getResource("/telas/homeScreem.fxml")); 
        home = new Scene(homeDetails);

        primaryStage.setTitle("login");
        primaryStage.setScene(login);
        primaryStage.show();
    }

    public static void changeScreen(int number){

        switch (number) {
            case 1:
                stage.setScene(home);
                break;
        
            default:
                break;
        }

    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
