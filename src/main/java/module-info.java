module com.example.supplychainbirender {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.supplychainbirender to javafx.fxml;
    exports com.example.supplychainbirender;
}