module com.mycompany.tesst {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tesst to javafx.fxml;
    exports com.mycompany.tesst;
}
