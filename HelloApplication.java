package com.example.puzzlegame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override

    public void start(Stage stage) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            System.out.println("Hello world");
            stage.setTitle("Game");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
          //style="-fx-background-image: url(&quot;C1.1.jpg&quot;);"
        //style="-fx-background-image: url(&quot;https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgcFhvbVDLaef2odCchs8iSxpb-1jgxIVk131T_l_EVf8fNxp54DAquvuRFoYM33Hm5T7xaH6V88x4UUqaMV082Lx4kIaVVJX-uHbSKDEmKcZXwJKuoaRLA6lxtRnKL_n1C8yDxjKa2AVr7Yjh6dkXVp4VvBhEoqhYv_MdSLY-oT76FKuORe7BSJWJK/s1600/C1.2.jpg&quot;);"
    }
}