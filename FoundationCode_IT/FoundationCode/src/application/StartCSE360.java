package application;

import javafx.application.Application;
import javafx.stage.Stage;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import databasePart1.DatabaseHelper;

public class StartCSE360 extends Application {

    private static final DatabaseHelper databaseHelper = new DatabaseHelper();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            databaseHelper.connectToDatabase(); // Connect to the database

            // Prompt user to reset the admin account
            if (confirmReset()) {
                databaseHelper.resetAdmin(); // Reset only the admin account
                System.out.println("Admin account has been reset.");
            }

            if (databaseHelper.isDatabaseEmpty()) {
                new FirstPage(databaseHelper).show(primaryStage);
            } else {
                new SetupLoginSelectionPage(databaseHelper).show(primaryStage);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Display a confirmation dialog to the user asking if they want to reset the admin account.
     * @return true if the user confirms, false otherwise.
     */
    private boolean confirmReset() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Do you want to reset the admin account?", ButtonType.YES, ButtonType.NO);
        alert.setTitle("Reset Confirmation");
        alert.setHeaderText(null);

        return alert.showAndWait().orElse(ButtonType.NO) == ButtonType.YES;
    }
}