/* Andres Montenegro
 * Purpose: Welcome the user based on their role.
 * Contact: am23828@email.vccs.edu
 */
import javafx.application.Application;
import java.util.Optional;
import java.util.ArrayList;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceDialog;

public class Roles extends Application {

    @Override
    public void start(Stage primaryStage) {
        ArrayList<String> choice = new ArrayList<>();
        choice.add("Administrator");
        choice.add("Faculty");
        choice.add("Staff");
        choice.add("Student");
        choice.add("Guest");

        String defaultOption = choice.get(4);
        ChoiceDialog choiceDialog = new ChoiceDialog(defaultOption, choice);
        choiceDialog.setTitle("Your Role");
        choiceDialog.setHeaderText("Select Your Role");
        Optional <String> result = choiceDialog.showAndWait();

        String selected = result.get();
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Choose your role");
        alert.setHeaderText("Good to see you");
        switch(selected) {
            case "Administrator" :
                alert.setContentText("Welcome Administrator!");
                break;
            case "Faculty" :
                alert.setContentText("Welcome Faculty!");
                break;
            case "Staff" :
                alert.setContentText("Welcome Staff!");
                break;
            case "Student" :
                alert.setContentText("Welcome Student!");
                break;
            case "Guest" :
                alert.setContentText("Welcome Guest!");
            default :
                System.out.println("Invalid Entry");
        }

        alert.showAndWait();
    }
    public static void main(String [] args) { launch(args);
    }
}
