module com.defiman {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.defiman to javafx.fxml;
    exports com.defiman;
}
