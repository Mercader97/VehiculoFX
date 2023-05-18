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
      
        //esto es obligatoria para que java lance la pantalla de fx
      launch(args);
   

    }

    //esto es obligatoria para que java lance la pantalla de fx

    @Override
    public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("/vista/FXMLventadecoches.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
    
}
