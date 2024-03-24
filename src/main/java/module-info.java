module com.defiman {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.defiman to javafx.fxml;
    exports com.defiman;
}
