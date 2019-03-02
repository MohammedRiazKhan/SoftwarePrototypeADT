package model;

public class Dessert{
    
    private int id;
    private String name;
    private int cost;
    private int prepTime;

    public Dessert(int id, String name, int cost, int prepTime) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.prepTime = prepTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
 
    
    
}
