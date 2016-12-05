package com.apress.javafx.jdojo.intro;

/*
Descripción:    3a Clase de tutorial JavaFX.    
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creación:    4 de Diciembre de 2016.
F. Cambio:      4 de Diciembre de 2016.
Comentarios:    
*/

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 3a Clase de tutorial JavaFX.
 * @author cguevara_aguilar
 */
public class ImprovedHelloFXApp extends Application {
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">

    /**
     * Método de inicio de la aplicación.
     * @param args Argumentos de inicio.
     */
    public static void main (String [] args) {
        
        Application.launch(args);
    } // public static void main (String [] args) {
    
    @Override
    public void start (Stage stage) {
        
        // Indica la captura de texto del nombre.
        Label nameLbl = new Label ("Indica tu nombre:");
        TextField nameFld = new TextField();
        
        // Crea un label e indica que será azul.
        Label msg = new Label ();
        msg.setStyle("-fx-text-fill: blue;");
        
        // Crea los botones
        Button sayHelloBtn = new Button ("Dí hola");
        Button exitBtn = new Button ("Exit");
        
        // Agrega el handler para el botón hola
        sayHelloBtn.setOnAction(e -> {
            String name = nameFld.getText();
            
            // Si se indicó un nombre
            if (name.trim().length() > 0) {
                msg.setText("Hola " + name);
            } else {
                msg.setText("Hola ahí");
            } // if (name.trim().length() > 0) {
        });
        
        // Agrega el manejador de evento al botón salir.
        exitBtn.setOnAction(e -> Platform.exit());
        
        // Crea el nodo raiz.
        VBox root = new VBox ();
        
        // Indica el espaciado
        root.setSpacing(5);
        
        // Agrega los objetos a la raiz.        
        root.getChildren().addAll(nameLbl, nameFld, msg, sayHelloBtn, exitBtn);
        
        Scene scene = new Scene (root, 350, 150);
        stage.setScene(scene);
        stage.setTitle ("Aplicación hola JavaFX mejorada");
        stage.show();
        
    } // public void start (Stage stage) {
    
    
    
    // </editor-fold>
    
} // public class ImprovedHelloFXApp extends Application {
