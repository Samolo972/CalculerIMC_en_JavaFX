module com.example.calculerimc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculerimc to javafx.fxml;
    exports com.example.calculerimc;
}