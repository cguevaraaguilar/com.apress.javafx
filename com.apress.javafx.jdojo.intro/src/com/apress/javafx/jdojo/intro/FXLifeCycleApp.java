package com.apress.javafx.jdojo.intro;

/*
Descripción:    Ejemplo de ciclo de vida de aplicaciones JavaFX.
Autor:          Carlos Ernesto Guervara Aguilar.
F. Creación:    5 de Diciembre de 2016.
F. Cambio:      5 de Diciembre de 2016.
Comentarios:    
*/

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Ejemplo de ciclo de vida de aplicaciones JavaFX.
 * @author cguevara_aguilar
 */
public class FXLifeCycleApp extends Application {
    
    // <editor-fold defaultstate="collapsed" desc="Constructor">

    /**
     * Constructor default de la clase
     */
    public FXLifeCycleApp () {
        
        String name = Thread.currentThread().getName();
        System.out.println ("LifeCycleApp constructor: " + name);
    } // public FXLifeCycleApp () {
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">

    /**
     * Método de inicio de la clase.
     * @param args 
     */
    public static void main (String [] args) {
        
        Application.launch(args);
    } // public static void main (String [] args) {
    
    /**
     * Método de inicialización de la clase.
     */
    @Override
    public void init () {
       
        String name = Thread.currentThread().getName ();
        System.out.println ("init () method: " + name);
    } // public void init () {
    
    /**
     * Método de inicio de la clase.
     * @param stage 
     */
    @Override
    public void start (Stage stage) {
        
        String name = Thread.currentThread().getName();
        System.out.println ("start () method: " + name);
        
        Scene scene = new Scene (new Group (), 200, 200);
        stage.setScene(scene);
        stage.setTitle ("JavaFX Application Life Cycle");
        stage.show ();
    } // public void start (Stage stage) {
    
    /**
     * Método que detiene la aplicación.
     */
    @Override
    public void stop () {
        
        String name = Thread.currentThread().getName();
        System.out.println("stop () method: " + name);
    } // public void stop () {
    
    // </editor-fold>
    
} // public class FXLifeCycleApp extends Application {
