package com.apress.javafx.jdojo.intro;

/*
Descripción:    2a Clase de ejemplo JavaFX.
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creación:    4 de Diciembre de 2016.
F. Cambio:      4 de Diciembre de 2016.
Comentarios:    
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author cguevara_aguilar
 */
public class HelloFXAppWithAScene extends Application {
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">

    /**
     * Método de inicio de la aplicación.
     * @param args 
     */
    public static void main (String [] args) {
        
        // Redirecciona el flujo al formulario.
        Application.launch(args);
    } // public static void main (String [] args) {
    
    @Override
    public void start (Stage stage) {
        
        Text msg = new Text ("Hola JavaFX");
        VBox root = new VBox ();
        root.getChildren().add(msg);
        
        Scene scene = new Scene (root, 300, 50);
        stage.setScene(scene);
        stage.setTitle("Hola aplicación JavaFX con una excena.");
        stage.show();
    } // public void start (Stage stage) {
    
    // </editor-fold>
    
} // public class HelloFXAppWithAScene extends Application {
