module com.example.itsamoilov_calc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.itsamoilov_calc to javafx.fxml;
    exports com.example.itsamoilov_calc;
}