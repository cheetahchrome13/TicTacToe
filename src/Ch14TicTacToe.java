
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Purpose: This program creates a 9x9 tic tac toe game and puts a random x, 
 *          o, or blank space in each grid pane
 * @author Justin Mangan
 */
public class Ch14TicTacToe extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane root = new GridPane();
        root.setGridLinesVisible(true);// typically used for debug purposes only
        root.setAlignment(Pos.CENTER);
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int randomNum = random.nextInt(3);
                if (randomNum != 2) {
                    String image = (randomNum > 0) ? "images/x.gif" : "images/o.gif";
                    root.add(new ImageView(new Image(image)), j, i);
                }
            }
        }
        
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("Tic-Tac-Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
