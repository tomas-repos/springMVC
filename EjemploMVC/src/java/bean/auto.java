/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author tomasdf
 */
public class auto {
    private int id;
    private String marca;
    private String color;
    
    public auto(int id, String marca, String color) {
        this.id = id;
        this.marca = marca;
        this.color = color;
    }

    public auto(int id) {
        this.id = id;
    }

    public auto() {
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    
}
