package com.apress.javafx.jdojo.binding;

/*
Descripción:    Clase modelo (BE) que representa un Empleado.
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creación:    6 de Diciembre de 2016.
F. Cambio:      6 de Diciembre de 2016.
Comentarios:    

*/

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Clase modelo (BE) que representa un Empleado.
 * @author cguevara_aguilar
 */
public class Employee {
    
    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    
    private String name;
    private double salary;
    private PropertyChangeSupport pcs = new PropertyChangeSupport (this);

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructores">

    /**
     * Constructor default.
     */
    public Employee () {
        
        this.name = "John Doe";
        this.salary = 1000.0;
        
    } // public Employee () {
    
    /**
     * 
     * @param name
     * @param salary 
     */
    public Employee (String name, double salary) {
        
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">

    // </editor-fold>
    
} // public class Employee {
