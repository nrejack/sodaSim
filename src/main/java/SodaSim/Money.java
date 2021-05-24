package oop_practice;
/* stretch exercise: expand this to work with other kinds of money. 
Refer to the OOP design patterns book */
public abstract class Money {
    float value;
    String name;

    public void Money() {
        this.value = 0;
        this.name = "No name given";
    }

    public void Money(float value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public float getValue() {
        return this.value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
