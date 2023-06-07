module gr40in.tttgr40in {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens gr40in.tttgr40in to javafx.fxml;
    exports gr40in.tttgr40in;
}