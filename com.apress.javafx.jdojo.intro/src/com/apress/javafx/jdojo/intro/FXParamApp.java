package com.apress.javafx.jdojo.intro;

/*
Descripción:    4o ejercicio de tutorial JavaFX.
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creación:    4 de Diciembre de 2016.
F. Cambio:      5 de Diciembre de 2016.
Comentarios:    
                5 de Diciembre de 2016.
                    Se continuó con la construcción.
                    Cambio desde windows.
*/

import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * 4o ejercicio de tutorial JavaFX.
 * @author cguevara_aguilar
 */
public class FXParamApp extends Application {
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">

    /**
     * Método de inicio de la aplicación.
     * Parámetros no nombrados: Carlos Ernesto width=200 height=100
     * Parámetros nombrados: Carlos Ernesto --width=200 --height=100
     * @param args 
     */
    public static void main (String [] args) {
        
        System.out.println ("Hola desde windows");
        
        // Redirecciona el flujo al formulario FX.
        Application.launch(args);
    } // public static void main (String [] args) {
    
    /**
     * Método de inicio del formulario.
     * @param stage 
     */
    @Override
    public void start (Stage stage) {
        
        // Obtiene los parámetros de la aplicación.
        Parameters p = this.getParameters();
        Map <String, String> namedParams = p.getNamed();
        List <String> unnamedParams = p.getUnnamed();
        List <String> rawParams = p.getRaw();
        
        String paramStr = 
                    "Named parameters: " + namedParams + "\n"
                + "Unnamed parameters: " + unnamedParams + "\n"
                + "Raw parameters: " + rawParams;
        
        TextArea ta = new TextArea (paramStr);
        Group root = new Group (ta);
        
        stage.setScene(new Scene (root));
        stage.setTitle ("Parámetros de aplicación");
        stage.show();
        
    } // public void start (Stage stage) {
    // </editor-fold>
    
} // public class FXParamApp extends Application {
