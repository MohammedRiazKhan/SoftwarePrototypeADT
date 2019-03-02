package model;
public class MealSelection {
   
    private int selectionId;
    private Meal meal;
    private Dessert dessert;
    private Beverage beverage;
    
    public MealSelection(int selectionId, Meal meal, Dessert dessert, Beverage beverage){
        this.selectionId = selectionId;
        this.meal = meal;
        this.dessert = dessert;
        this.beverage = beverage;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public int getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }
    
    
    
    
}
