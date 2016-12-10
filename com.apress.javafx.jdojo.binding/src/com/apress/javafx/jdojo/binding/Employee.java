package com.apress.javafx.jdojo.binding;

/*
Descripción:    Clase modelo (BE) que representa un Empleado.
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creación:    6 de Diciembre de 2016.
F. Cambio:      8 de Diciembre de 2016.
Comentarios:    
                8 de Diciembre de 2016.
                    Se continuó con la construcción de la clase.

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
     * Constructor parametrizado.
     * @param name
     * @param salary 
     */
    public Employee (String name, double salary) {
        
        this.name = name;
        this.salary = salary;
    } // public Employee (String name, double salary) {
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">
    
    /**
     * Método que obtiene el nombre.
     * @return 
     */
    public String getName () {
        
        return (name);
    } // public String getName () {
    
    /**
     * Método que establece el nombre.
     * @param name 
     */
    public void setName (String name) {
        
        this.name = name;
    } // public void setName (String name) {
    
    /**
     * Método que obtiene el salario.
     * @return 
     */
    public double getSalary () {
        
        return (this.salary);
    } // public double getSalary () {
    
    /**
     * Método que establece el salario.
     * @param salary 
     */
    public void setSalary (double newSalary) {
        
        // Guarda el dato actual antes de modificarlo.
        double oldSalary = this.salary;
        this.salary = newSalary;
        
        pcs.firePropertyChange("salary", oldSalary, newSalary);
        
    } // public void setSalary (double salary) {
    
    /**
     * Método que establece el listener de cambios.
     * @param listener 
     */
    public void addPropertyChangeListener (PropertyChangeListener listener) {
        
        this.pcs.addPropertyChangeListener(listener);
    } // public void addPropertyChangeListener (PropertyChangeListener listener) {
    
    /**
     * Método que quita un listener de cambios.
     * @param listener 
     */
    public void removePropertyChangeListener (PropertyChangeListener listener) {
       
        pcs.removePropertyChangeListener(listener);
    } // public void removePropertyChangeListener (PropertyChangeListener listener) {
    
    /**
     * Método que obtiene al representación en cadena del objeto.
     * @return 
     */
    @Override
    public String toString () {
        return ("name = " + name + ", salary = " + salary);
    } // public String toString () {

    // </editor-fold>
    
} // public class Employee {
