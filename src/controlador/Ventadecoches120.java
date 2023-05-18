package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ventadecoches12.pkg0.Turismo.Tipocarroceria;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Iván
 */
public class Ventadecoches120 extends Application {

    public static void main(String[] args) {
      //Medidas medidas = new Medidas();
      //ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
      //Vehiculo coche = new Turismo("Seat", "leon", 2019, 5212, 125, 2000.00, Tipocombustible.Combustible.diesel,new Medidas(1,2,4), Tipocarroceria.Suv);
     // Vehiculo moto = new Moto("Seat", "leon", 2019, 5212, 125, 2000.00, Combustible.diesel,new Medidas(1,2,4), 2);
     // Vehiculo industrial = new Industrial("Seat", "leon", 2019, 5212, 125, 2000.00, Combustible.diesel,new Medidas(1,2,4), 3.2f);
      launch(args);
     // vehiculos.add(coche);
     // vehiculos.add(moto);
     // vehiculos.add(new Industrial("Seat", "leon", 2019, 5212, 125, 2000.00, Combustible.diesel,new Medidas(1,2,4), 3.2f));
      
     //System.out.println(vehiculos);
      

    }

    @Override
    public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("/vista/FXMLventadecoches.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
    
}
