package com.example.springmvcdemo.model;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;

    private String[] favoriteSystems;
    public Student() {
    }

    public Student(String firstName, String lastName, String country, String favoriteLanguage, String[] favoriteSystems) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteSystems = favoriteSystems;
    }

    public String[] getFavoriteSystems() {
        return favoriteSystems;
    }

    public void setFavoriteSystems(String[] favoriteSystems) {
        this.favoriteSystems = favoriteSystems;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
