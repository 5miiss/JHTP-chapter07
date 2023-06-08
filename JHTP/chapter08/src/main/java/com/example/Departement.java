package com.example;

public enum Departement {

    HR(20,"HR Depatement"),
    IT(200,"IT Depatement"),
    JAVA(8,"java Depatement"),
    ANGULAR;

    int numberOfEMps;
    String description;

    Departement(int numberOfEMps,
    String description){

    }
    Departement(){

    }

    public void setNumber(int number){
        this.numberOfEMps =number;
    }
}
