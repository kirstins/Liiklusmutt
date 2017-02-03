import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by kirstin on 03/02/2017.
 */
public class Aken {
    Stage stage = new Stage();
    VBox vbox;
    Scene scene;
    Button button;
    ChoiceBox valik;
    Label label1;
    Label label2;
    Label label3;
    Label label4;
    Andmed andmed=new Andmed();
    String suund;

    public Aken(){
        seadistaAken();
        lisaAndmed();

    }

    private void seadistaAken() {
        vbox = new VBox();
        scene=new Scene(vbox, 500, 500);
        stage.setScene(scene);
        stage.show();

        label1= new Label("Vali suund");
        valik = new ChoiceBox(FXCollections.observableArrayList("Kesklinn", "Mustamäe", "Tabasalu", "Paldiski"));
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        button = new Button("Salvesta suund");

        vbox.getChildren().addAll(label1, valik, label2, label3, label4, button);

    }

    private void lisaAndmed() {
        valik.getSelectionModel().selectedItemProperty().addListener((observable, oldvalue, newvalue)->{
            suund = (String) newvalue;
        });
        button.setOnAction(event -> {
            andmed.lisaAndmed(suund);
            label2.setText(andmed.autodKokku());
            label3.setText(andmed.igasSuunas());
            label4.setText(andmed.populaarseimSuund());
        });

    }
}
