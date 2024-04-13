module co.uniquindio.ingesis.pro3.sgre.proyectofinalprog3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.uniquindio.ingesis.pro3.sgre.proyectofinalprog3 to javafx.fxml;
    exports co.uniquindio.ingesis.pro3.sgre.proyectofinalprog3;
    exports co.uniquindio.ingesis.pro3.sgre.proyectofinalprog3.controller;
    opens co.uniquindio.ingesis.pro3.sgre.proyectofinalprog3.controller to javafx.fxml;
    exports co.uniquindio.ingesis.pro3.sgre.proyectofinalprog3.viewController;
    opens co.uniquindio.ingesis.pro3.sgre.proyectofinalprog3.viewController to javafx.fxml;
}