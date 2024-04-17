package com.napier.sem;
// A class to define the variables for a given city
public class City {
    // Defining a city's ID
    private int id;
    // Getter to return a city's ID
    public int getID(){
        return id;
    }
    // Setter to modify a city's ID
    public void setID(int newID){
        this.id = newID;
    }
    // Defining a city's name
    private String name;
    // Getter to return city's name
    public String getName(){
        return name;
    }
    // Setter to modify a city's name
    public void setName(String newName){
        this.name = newName;
    }
    // Defining a city's country code
    private String countryCode;
    // Getter to return a city's ID
    public String getCountryCode(){
        return countryCode;
    }
    // Setter to modify a city's country code
    public void setCountryCode(String newCountryCode){
        this.countryCode = newCountryCode;
    }
    // Defining a city's district
    private String district;
    // Getter to return a city's district
    public String getDistrict(){
        return district;
    }
    // Setter to modify a city's district
    public void setDistrict(String newDistrict){
        this.district = newDistrict;
    }
    // Defining a city's population
    private String population;
    // Getter to return a city's district
    public String getPopulation(){
        return population;
    }
    // Setter to modify a city's district
    public void setPopulation(String newPopulation){
        this.population = newPopulation;
    }
}