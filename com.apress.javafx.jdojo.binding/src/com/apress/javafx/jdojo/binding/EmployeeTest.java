package com.apress.javafx.jdojo.binding;

/*
Descripción:    Clase de prueba del modelo Employee.
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creación:    8 de Diciembre de 2016.
F. Cambio:      8 de Diciembre de 2016.
Comentarios:     
*/

import java.beans.PropertyChangeEvent;

/**
 * Clase de prueba del modelo Employee.
 * @author cguevara_aguilar
 */
public class EmployeeTest {
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">

    /**
     * Método de inicio.
     * @param args 
     */
    public static void main (String [] args) {
        
        final Employee e1 = new Employee ("John Jacobs", 2000.0);
        
        computeTax(e1.getSalary());
        
        // Agrega el listener
        e1.addPropertyChangeListener(EmployeeTest::handlePropertyChange);
        e1.setSalary(3000.0);
        e1.setSalary(3000.0); // No change notification is sent.
        e1.setSalary(6000.0);
        
    } // public static void main (String [] args) {
    
    /**
     * Método que gestiona el listener de cambios.
     * @param e 
     */
    public static void handlePropertyChange (PropertyChangeEvent e) {
        String propertyName = e.getPropertyName();
        
        if ("salary".equals(propertyName)) {
            
            System.out.println ("Old salary has changed.");
            System.out.println ("Old: " + e.getOldValue());
            System.out.println ("New: " + e.getNewValue());
            
            computeTax ((Double) e.getNewValue());
        } // if ("salary".equals(propertyName)) {
    } // public static void handlePropertyChange (PropertyChangeEvent e) {
    
    /**
     * Método que calcula los impuestos.
     * @param salary 
     */
    public static void computeTax (double salary) {
        
        final double TAX_PERCENT = 20.0;
        double tax = salary * TAX_PERCENT;
        System.out.println ("Salary: " + salary + ", Tax: " + tax);
    } // public static void computeTax (double salary) {
    
    // </editor-fold>
    
} // public class EmployeeTest {
