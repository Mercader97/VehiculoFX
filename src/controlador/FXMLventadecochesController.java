/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import ventadecoches12.pkg0.Industrial;
import ventadecoches12.pkg0.Medidas;
import ventadecoches12.pkg0.Moto;
import ventadecoches12.pkg0.Tipocombustible;
import ventadecoches12.pkg0.Turismo;
import ventadecoches12.pkg0.Turismo.Tipocarroceria;
import ventadecoches12.pkg0.Vehiculo;

//import ventadecoches12.pkg0.Vehiculo.Combustible;
/**
 * FXML Controller class
 *
 * @author Iván
 */
public class FXMLventadecochesController implements Initializable {

    @FXML
    private Pane Panedatos;
    @FXML
    private ComboBox<Tipocombustible.Combustible> cb_tipocombustible;
    @FXML
    private TextField tfmarca;
    @FXML
    private TextField tfmodelo;
    @FXML
    private TextField tfano;
    @FXML
    private TextField tfkilometros;
    @FXML
    private TextField tfcv;
    @FXML
    private TextField tfprecio;
    @FXML
    private TextField tfnumruedas;
    @FXML
    private TextField tftamcaja;
    @FXML
    private ComboBox<Tipocarroceria> cbtipocarroceria;
    @FXML
    private Button btguardar;
    @FXML
    private Button btborrar;
    @FXML
    private ListView<Vehiculo> lvcoches;
    ObservableList<Vehiculo> lvcoches1 = FXCollections.observableArrayList();
    @FXML
    private RadioButton rbturismo;
    @FXML
    private RadioButton rbmoto;
    @FXML
    private RadioButton rbindustrial;
    @FXML
    private ToggleGroup grupo;
    
    
    

    // variable de uso
    public Integer ano, km, cv, numrueda;
    public double precio;
    public Medidas medida;
    public float tamcaja;
    
    
    @FXML
    private TextField tfancho;
    @FXML
    private TextField tflargo;
    @FXML
    private TextField tfalto;
    @FXML
    private Text textotamcaja;
    @FXML
    private Text textotipocarroceria;
    @FXML
    private Text textoNruedas;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //ArrayList<Vehiculo> lv = new ArrayList<Vehiculo>;
        // Ponemos las opciones del combobox combustible  diesel, gasolina, hibrido, electrico, GLP;
        //ToggleGroup grupo = new ToggleGroup();
        cb_tipocombustible.getItems().addAll(Tipocombustible.Combustible.GLP, Tipocombustible.Combustible.diesel, Tipocombustible.Combustible.electrico, Tipocombustible.Combustible.gasolina, Tipocombustible.Combustible.hibrido);
        cbtipocarroceria.getItems().addAll(Tipocarroceria.Berlina, Tipocarroceria.Compacto, Tipocarroceria.Descapotable, Tipocarroceria.Monovolumen, Tipocarroceria.Suv);
        cbtipocarroceria.setVisible(false);
        tfnumruedas.setVisible(false);
        tftamcaja.setVisible(false);
        textotamcaja.setVisible(false);
        textoNruedas.setVisible(false);
        textotipocarroceria.setVisible(false);
    }

    
    //depende del radio button que seleccionamos ponemos en visible unos campos u otros, pedido en el enunciado
    @FXML
    private void seleccionamoto(ActionEvent event) {

        tfnumruedas.setVisible(true);
        cbtipocarroceria.setVisible(false);
        tftamcaja.setVisible(false);
        textotamcaja.setVisible(false);
        textoNruedas.setVisible(true);
        textotipocarroceria.setVisible(false);
    }

    @FXML
    private void seleccionaturismo(ActionEvent event) {
        cbtipocarroceria.setVisible(true);
        tfnumruedas.setVisible(false);
        tftamcaja.setVisible(false);
        textotamcaja.setVisible(false);
        textoNruedas.setVisible(false);
        textotipocarroceria.setVisible(true);

    }

    @FXML
    private void seleccionaindustrial(ActionEvent event) {

        tftamcaja.setVisible(true);
        cbtipocarroceria.setVisible(false);
        tfnumruedas.setVisible(false);
        textotamcaja.setVisible(true);
        textoNruedas.setVisible(false);
        textotipocarroceria.setVisible(false);

    }

    @FXML
    
    // va ligado mediante scenebuilder al boton guardar
    private void guardardatos(ActionEvent event) {
        //System.out.println(tfmarca.getText());
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        
        // segun la opcion seleccionada del radio button creamos un objeto de tipo moto y lo añadimos al list view (ultimas lineas), antes de crearlo filtramos cada campo para evitar errores
        // ademas si algun campo de cuadra con lo que nos pide el constructor del objeto le mostramos un mensaje de alerta al usuario
        
        if (rbmoto.isSelected()) {
            
            if (isNumeric(tfano.getText())) {
                ano = Integer.parseInt(tfano.getText());

            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("El año debe ser un numero");
                alerta.showAndWait();
            }

            if (isNumeric(tfkilometros.getText())) {
                km = Integer.parseInt(tfkilometros.getText());

            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("Los kilometros deben ser un numero");
                alerta.showAndWait();
            }

            if (isNumeric(tfcv.getText())) {
                cv = Integer.parseInt(tfcv.getText());

            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("Los CV deben ser un numero");
                alerta.showAndWait();
            }

            
            try {
                Double.parseDouble(tfprecio.getText());
                precio = Double.parseDouble(tfprecio.getText());
            } catch (NumberFormatException e) {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("El precio es un numero seguido de . y 2 decimales");
                alerta.showAndWait();
            }
            
            if (isNumeric(tfalto.getText()) || isNumeric(tfancho.getText()) || isNumeric(tflargo.getText())) {
               medida = new Medidas(Integer.parseInt(tfalto.getText()),Integer.parseInt(tfancho.getText()),Integer.parseInt(tflargo.getText()));
            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("Las tres medidas deben ser numeros enteros");
                alerta.showAndWait();
            }
            
            if (isNumeric(tfnumruedas.getText())) {
               numrueda = Integer.parseInt(tfnumruedas.getText());
            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("Las ruedas deben ser numeros enteros");
                alerta.showAndWait();
            }
            
            lvcoches1.add(new Moto(tfmarca.getText(), tfmodelo.getText(), ano, km, cv, precio, cb_tipocombustible.getValue(), medida, numrueda));
            lvcoches.setItems(lvcoches1);

        } else if (rbturismo.isSelected()) {

            if (isNumeric(tfano.getText())) {
                ano = Integer.parseInt(tfano.getText());

            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("El año debe ser un numero");
                alerta.showAndWait();
            }

            if (isNumeric(tfkilometros.getText())) {
                km = Integer.parseInt(tfkilometros.getText());

            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("Los kilometros deben ser un numero");
                alerta.showAndWait();
            }

            if (isNumeric(tfcv.getText())) {
                cv = Integer.parseInt(tfcv.getText());

            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("Los CV deben ser un numero");
                alerta.showAndWait();
            }

            
            try {
                Double.parseDouble(tfprecio.getText());
                precio = Double.parseDouble(tfprecio.getText());
            } catch (NumberFormatException e) {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("El precio es un numero seguido de . y 2 decimales");
                alerta.showAndWait();
            }
            
            if (isNumeric(tfalto.getText()) || isNumeric(tfancho.getText()) || isNumeric(tflargo.getText())) {
               medida = new Medidas(Integer.parseInt(tfalto.getText()),Integer.parseInt(tfancho.getText()),Integer.parseInt(tflargo.getText()));
            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("Las tres medidas deben ser numeros enteros");
                alerta.showAndWait();
            }
            
            
            
            lvcoches1.add(new Turismo(tfmarca.getText(), tfmodelo.getText(), ano, km, cv, precio, cb_tipocombustible.getValue(), medida, cbtipocarroceria.getValue()));
            lvcoches.setItems(lvcoches1);
            
        } else if (rbindustrial.isSelected()) {
            
             if (isNumeric(tfano.getText())) {
                ano = Integer.parseInt(tfano.getText());

            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("El año debe ser un numero");
                alerta.showAndWait();
            }

            if (isNumeric(tfkilometros.getText())) {
                km = Integer.parseInt(tfkilometros.getText());

            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("Los kilometros deben ser un numero");
                alerta.showAndWait();
            }

            if (isNumeric(tfcv.getText())) {
                cv = Integer.parseInt(tfcv.getText());

            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("Los CV deben ser un numero");
                alerta.showAndWait();
            }

            
            try {
                Double.parseDouble(tfprecio.getText());
                precio = Double.parseDouble(tfprecio.getText());
            } catch (NumberFormatException e) {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("El precio es un numero seguido de . y 2 decimales");
                alerta.showAndWait();
            }
            
            if (isNumeric(tfalto.getText()) || isNumeric(tfancho.getText()) || isNumeric(tflargo.getText())) {
               medida = new Medidas(Integer.parseInt(tfalto.getText()),Integer.parseInt(tfancho.getText()),Integer.parseInt(tflargo.getText()));
            } else {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("Las tres medidas deben ser numeros enteros");
                alerta.showAndWait();
            }
            
            
            
            try {
                Float.parseFloat(tftamcaja.getText());
                tamcaja = Float.parseFloat(tftamcaja.getText());
            } catch (NumberFormatException e) {
                alerta.setTitle("Error");
                alerta.setHeaderText("Error Introduccion datos");
                alerta.setContentText("El precio es un numero seguido de . y 2 decimales");
                alerta.showAndWait();
            }
            
            
            lvcoches1.add(new Industrial(tfmarca.getText(), tfmodelo.getText(), ano, km, cv, precio, cb_tipocombustible.getValue(), medida, tamcaja));
            lvcoches.setItems(lvcoches1);
        } else {
            System.out.println("Ninguno");
        }
    }
    
    // va ligado mediante scenebuilder al boton borrar
    
    @FXML
    private void borrartodo(ActionEvent event) {
        
        
        lvcoches1.clear();
        lvcoches.setItems(lvcoches1);
        

        
    }

    
    /**

     * Metodo para saber si un string es un numero

     * @param s El parámetro s es un string que le pasamos y que queremos saber si es un numero

     */
    public static boolean isNumeric(String s) {
        if (s == null || s.equals("")) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

}
