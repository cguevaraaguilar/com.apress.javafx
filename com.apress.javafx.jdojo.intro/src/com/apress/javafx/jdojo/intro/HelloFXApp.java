package com.apress.javafx.jdojo.intro;

/*
Autor:          Carlos Ernesto Guevara Aguilar.
Descripción:    1er ejercicio de JavaFX.
F. Creación:    3 de Diciembre de 2016.
F. Cabmbio:     4 de Diciembre de 2016.
Comentarios:    
                4 de Diciembre de 2016.
                    Configuración de ambiente Netbeans/Github/MAC/Windows
*/

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 1er ejercicio de JavaFX.
 * @author cguevara_aguilar
 */
public class HelloFXApp extends Application {
    
    // <editor-fold defaultstate="collapsed" desc="Métodos.">

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Inicia la aplicación.
        Application.launch(args);
    } // public static void main(String[] args) {
    
    @Override
    public void start (Stage stage) {
        
        // Indica el título.
        stage.setTitle("Hola aplicación JavaFX.");
        
        // Muestra el formulario.
        stage.show();
    } // public void start (Stage stage) {
    
    // </editor-fold>

    
    
} // public class HelloFXApp extends Application {
