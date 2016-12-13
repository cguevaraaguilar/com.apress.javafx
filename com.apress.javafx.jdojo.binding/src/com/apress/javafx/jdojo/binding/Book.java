package com.apress.javafx.jdojo.binding;

/*
Descripción:    Clase que representa un JavaBean con propiedades binding para JavaFX.
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creación:    13 de Diciembre de 2016.
F. Cambio:      13 de Diciembre de 2016.
Comentarios:    
*/

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Clase que representa un JavaBean con propiedades binding para JavaFX.
 * @author caguevar
 */
public class Book {
    
    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    
    private StringProperty title = new SimpleStringProperty (this, "title", "Unknown");
    private DoubleProperty price = new SimpleDoubleProperty (this, "price", 0.0);
    private ReadOnlyStringWrapper ISBN = new ReadOnlyStringWrapper (this, "ISBN", "Unknown");

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    
    /**
     * Constructor default.
     */
    public Book () {
        
    } // public Book () {
    
    /**
     * Constructor parametrizado.
     * @param title
     * @param price
     * @param ISBN 
     */
    public Book (String title, double price, String ISBN) {
        
        this.title.set(title);
        this.price.set(price);
        this.ISBN.set(ISBN);
    } // public Book (String title, double price, String ISBN) {
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">
    
    public final String getTitle () {
        
        return title.get ();
    } // public final String getTitle () {
    
    public final void setTitle (String title) {
        
        this.title.set (title);
    } // public final void setTitle (String title) {
    
    public final StringProperty titleProperty () {
        
        return (title);
    } // public final StringProperty titleProperty () {
    
    public final double getPrice () {
        
        return (price.get());
    } // public final double getPrice () {
    
    public final void setPrice (double price) {
        
        this.price.set(price);
    } // public final void setPrice (double price) {
    
    public final DoubleProperty priceProperty () {
        
        return (price);
    } // public final DoubleProperty priceProperty () {
    
    public final String getISBN () {
        
        return (ISBN.get());
    } // public final String getISBN () {
    
    public final ReadOnlyStringProperty ISBNProperty () {
        
        return (ISBN.getReadOnlyProperty());
    } // public final ReadOnlyStringProperty ISBNProperty () {
    
    // </editor-fold>
    
} // public class Book {
