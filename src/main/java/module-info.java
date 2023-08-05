module com.conversordemoedas.conversordemoedas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.conversordemoedas.conversordemoedas to javafx.fxml;
    exports com.conversordemoedas.conversordemoedas;
}