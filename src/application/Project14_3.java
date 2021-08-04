package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Project14_3 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

		Pane pane = new HBox(10);
		int[] a = new int[60];
		for (int i = 0; i < 3; i++) {
			int x;
			do {
				x = (int) (Math.random() * 54 + 1);
			} while (a[x] != 0);
			a[x]++;
			Image image = new Image("image/card/" + x + ".gif");
			pane.getChildren().add(new ImageView(image));
		}

		Scene scene = new Scene(pane);
		primaryStage.setTitle("card");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
