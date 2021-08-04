package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5, 5, 5, 5));
		addcard(pane);

		Pane pane2 = new VBox(10);
		pane2.getChildren().add(pane);
		Button btRefresh = new Button("Refresh");
		pane2.getChildren().add(new StackPane(btRefresh));
		btRefresh.setOnAction(e -> {
			pane.getChildren().clear();
			addcard(pane);
		});
		Scene scene = new Scene(pane2);
		primaryStage.setTitle("Card");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void addcard(Pane pane) {
		int[] a = new int[55];
		for (int i = 1; i <= 4; i++) {
			int x;
			do {
				x = (int) (Math.random() * 54 + 1);
			} while (a[x] != 0);
			a[x]++;
			Image image = new Image("image/card/" + x + ".png");
			pane.getChildren().add(new ImageView(image));
		}
	}
}
