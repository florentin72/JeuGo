package interfaceGraphique;
import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Fenetre extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		final URL fxmlURL  = getClass().getResource("Interface.fxml"); 
		final FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL); 
		final Node node = fxmlLoader.load(); 
		final VBox root = new VBox(node); 
		final Scene scene = new Scene(root, 300, 250); 
		primaryStage.setTitle("Jeu de Go "); 
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


