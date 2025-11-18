module com.example.connect4 {
    // Required JavaFX modules
    requires javafx.controls;
    requires javafx.fxml;

    // If you use any other JavaFX features, e.g., graphics:
    requires javafx.graphics;

    // Export your package containing your app to the module system
    exports com.internshala.connectfour;

    // Open package for FXML access
    opens com.internshala.connectfour to javafx.fxml;
}
