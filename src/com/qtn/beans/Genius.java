package com.qtn.beans;

public class Genius {

    private String name;
    private int age;
    private boolean isGenius;

    /**
     * renvoi le nom du genie
     * @return String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * renvoi l'age du genie
     * @return int age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * renvoi si la veracite du genie
     * @return boolean isgenius
     */
    public boolean isGenius() {
        return this.isGenius;
    }

    /**
     * modifie le nom du genie
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * modifie l'age du genie
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * modifie la veracite du genie
     * @param isGenius
     */
    public void setGenius(boolean isGenius) {
        this.isGenius = isGenius;
    }
}
