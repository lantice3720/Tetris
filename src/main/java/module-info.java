module kr.kro.lanthanide.tetris {
    requires javafx.controls;
    requires javafx.fxml;


    opens kr.kro.lanthanide.tetris to javafx.fxml;
    exports kr.kro.lanthanide.tetris;
}