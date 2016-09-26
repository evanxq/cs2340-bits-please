package fxapp;


import controller.LoginScreenController;
import controller.TemporaryAppScreenController;
import controller.WelcomeScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.User;
import model.UserNetwork;

public class Main extends Application {

    private UserNetwork userNetwork;

    public Main() {
        userNetwork = new UserNetwork();
    }

    @Override
    public void start(Stage window) throws Exception {
        showWelcomeScreen(window);
    }

    public boolean attemptUserLogin(User user) {
        return userNetwork.containsUser(user);
    }

    public void showWelcomeScreen(Stage app_stage) throws Exception {
        FXMLLoader welcomeLoader = new FXMLLoader(getClass().getResource("../view/WelcomeScreen.fxml"));
        Parent root = welcomeLoader.load();

        WelcomeScreenController controller = welcomeLoader.getController();
        controller.setMainApp(this);

        Scene scene =  new Scene(root);
        app_stage.setScene(scene);
        app_stage.show();
    }

    public void showLoginScreen(Stage app_stage) throws Exception {
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("../view/LoginScreen.fxml"));
        Parent loginScreen_parent = loginLoader.load();

        LoginScreenController controller = loginLoader.getController();
        controller.setMainApp(this);

        Scene loginScreen_scene = new Scene(loginScreen_parent);
        app_stage.setScene(loginScreen_scene);
        app_stage.show();
    }

    public void showTemporaryAppScreen(Stage app_stage) throws Exception {
        FXMLLoader appLoader = new FXMLLoader(getClass().getResource("../view/TemporaryApplicationScreen.fxml"));
        Parent appScreen_parent = appLoader.load();

        TemporaryAppScreenController controller = appLoader.getController();
        controller.setMainApp(this);

        Scene appScreen_scene = new Scene(appScreen_parent);
        app_stage.setScene(appScreen_scene);
        app_stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}