/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Dictionary {
    private String english;
    private String type;
    private String mean;
    private String example;
    private boolean status = false;

    public Dictionary(String english, String type, String mean, String example) {
        this.english = english;
        this.type = type;
        this.mean = mean;
        this.example = example;
    }

    public String getEnglish() {
        return english;
    }

    public String getType() {
        return type;
    }

    public String getMean() {
        return mean;
    }

    public String getExample() {
        return example;
    }

    public boolean isStatus() {
        return status;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Dictionary{" + "english=" + english + ", type=" + type + ", mean=" + mean + ", example=" + example + ", status=" + status + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
   
}
