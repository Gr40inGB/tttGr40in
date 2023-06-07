package gr40in.tttgr40in;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class TttController implements Initializable {

    int lastClickedRow = -1;
    int lastClickedColumn = -1;

    @FXML
    private Button btnNewGame;

    @FXML
    private Button btn00;

    @FXML
    private Button btn01;

    @FXML
    private Button btn02;

    @FXML
    private Button btn10;

    @FXML
    private Button btn11;

    @FXML
    private Button btn12;

    @FXML
    private Button btn20;

    @FXML
    private Button btn21;

    @FXML
    private Button btn22;


    @FXML
    void btnNewGameClick(ActionEvent event) {
        System.out.println("Hi");
    }
    @FXML
    void EmptyClick(ActionEvent event) {
        String deskr = (String) event.getSource();
        System.out.println(deskr);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn00.setOnAction(e->setClicked(0,0));
        btn01.setOnAction(e->setClicked(0,1));
        btn02.setOnAction(e->setClicked(0,2));
        btn10.setOnAction(e->setClicked(1,0));
        btn11.setOnAction(e->setClicked(1,1));
        btn12.setOnAction(e->setClicked(1,2));
        btn20.setOnAction(e->setClicked(2,0));
        btn21.setOnAction(e->setClicked(2,1));
        btn22.setOnAction(e->setClicked(2,2));
    }



    public void setClicked(int row, int column){
        lastClickedRow = row;
        lastClickedColumn = column;
        System.out.println(lastClickedColumn + " " + lastClickedRow);
    }
}