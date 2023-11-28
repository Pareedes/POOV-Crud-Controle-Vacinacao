package trabalhofinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
// import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application{

    public static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        scene = new Scene(loadFXML("telaprincial"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("src/main/resources/javafx/telaprincipal.fxml"));
        return fxmlLoader.load();
    }
    public static void main(String[] args) {
        launch();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // @Override
    // public void start(Stage stage) throws Exception {
    //     // Cria uma instância da classe StackPane
    //     StackPane root = new StackPane();

    //     // Carrega o layout da tela do arquivo XML
    //     root.getChildren().add(FXMLLoader.load(getClass().getResource("telaprincipal.fxml")));

    //     // Cria uma instância da classe Scene
    //     Scene scene = new Scene(root, 800, 600);

    //     // Exibe a cena
    //     stage.setScene(scene);
    //     stage.show();
    // }

    // public static void main(String[] args) {
    //     launch(args);
    // }

}