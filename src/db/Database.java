package db;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import restaurant.*;
public class Database {
    
    Connection con;
    Statement stmt;
    ResultSet resultSet;
   
    public void connect() throws IOException{
       
        //file name specifying the locaion of the database file
        String filename = main.getProgramPath() + "/db/restaurant.accdb";
        
        //url to the database to make the java connection
        String dbURL = "jdbc:ucanaccess://" + filename.trim() + ";DriverID=22;READONLY=true}";

        //the driver name
        String driverName = "net.ucanaccess.jdbc.UcanaccessDriver";
       
         try {
            
            System.out.println("About to Load the JDBC Driver....");
            
            Class.forName(driverName);
            
            System.out.println("Driver Loaded Successfully....");
            System.out.println("About to get a connection....");
            
            con = DriverManager.getConnection(dbURL, "",""); 
            
            System.out.println("Connection Established Successfully....");
            
            stmt = con.createStatement();
           
            
        }
        catch(Exception err){
              
              System.out.println("ERROR: " + err);
              
        }
        
        
    }
    
    public void disconnect() throws SQLException{
       
        con.close(); // close the Connection to let the database know we're done with it
        System.out.println("Closed successfully....");
        
    }
    
    public void createTables(){
    
        String main = "CREATE TABLE MEAL(MealId INTEGER, Name VARCHAR, PrepTime NUMBER, Cost NUMBER)";
        String dessert = "CREATE TABLE DESSERT(DessertId INTEGER, Name VARCHAR, PrepTime NUMBER, Cost NUMBER)";
        String beverage = "CREATE TABLE BEVERAGE(BeverageID INTEGER, Name VARCHAR, PrepTime NUMBER, Cost NUMBER)";
        String selection = "CREATE TABLE SELECTION(SelectionId INTEGER, MealId INTEGER, DessertId INTEGER, BeverageID INTEGER)";
        String mealSel = "CREATE TABLE MEALSELECTION(OrderId INTEGER, SelectionId INTEGER)";
        String orders = "CREATE TABLE ORDERS(OrderId INTEGER, NumGuests INTEGER, TableNum INTEGER)";
        String tables = "CREATE TABLE TABLES(TableId INTEGER, EmployeeAssigned EmployeeId)";
        String employees = "CREATE EMPLOYEES(EmployeeId INTEGER, TableId INTEGER)";
        
        try {
          
            stmt.execute(main);
            stmt.execute(dessert);
            stmt.execute(beverage);
            stmt.execute(selection);
            stmt.execute(mealSel);
            stmt.execute(orders);
           
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public void populateDatabase(){
     
         
        String a = "INSERT INTO MEAL VALUES(1, 'Roast Chicken', 30, 80)";
        String b = "INSERT INTO MEAL VALUES(2, 'T-Bone Steak - Well Done', 45, 200)";
        String c = "INSERT INTO MEAL VALUES(3, 'T-Bone Steak - Medium Rare', 25, 150)";
        String d = "INSERT INTO MEAL VALUES(4, 'Beef Burger + Fries', 15, 60)";
        String e = "INSERT INTO MEAL VALUES(5, 'Chicken Burger + Fries', 10, 60)";

        String f = "INSERT INTO DESSERT VALUES(1, 'Rocky Road', 20, 35)";
        String g = "INSERT INTO DESSERT VALUES(2, 'Brownie', 45, 200)";
        String h = "INSERT INTO DESSERT VALUES(3, 'Sundae', 25, 150)";
        String i = "INSERT INTO DESSERT VALUES(4, 'Banana Split', 15, 60)";
        String j = "INSERT INTO DESSERT VALUES(5, 'Choclate Cake Slice', 10, 25)";
        
        String k = "INSERT INTO BEVERAGE VALUES(1, 'Coke', 1 , 35)";
        String l = "INSERT INTO BEVERAGE VALUES(2, 'Coffee', 45, 200)";
        String m = "INSERT INTO BEVERAGE VALUES(3, 'Hot Choclate', 25, 150)";
        String n = "INSERT INTO BEVERAGE VALUES(4, 'Fanta', 15, 60)";
        String o = "INSERT INTO BEVERAGE VALUES(5, 'Choclate Milkshake', 10, 25)";
        String p = "INSERT INTO BEVERAGE VALUES(6, 'Cappuccino', 10, 25)";
         
        try {
          
            stmt.execute(a);
            stmt.execute(b);
            stmt.execute(c);
            stmt.execute(d);
            stmt.execute(e);
            stmt.execute(f);
            stmt.execute(g);
            stmt.execute(h);
            stmt.execute(i);
            stmt.execute(j);
            stmt.execute(k);
            stmt.execute(l);
            stmt.execute(m);
            stmt.execute(n);
            stmt.execute(o);
            stmt.execute(p);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList<Meal> getMeals(){
       
        String getAll = "SELECT * FROM MEAL";
      
        ArrayList<Meal> mealsArray = new ArrayList<>();
                
        try {
            
            resultSet = stmt.executeQuery(getAll);
            
            while(resultSet.next()){
            
                int id = resultSet.getInt("MealId");
                String name = resultSet.getString("Name");
                int preptime = resultSet.getInt("PrepTime");
                int cost = resultSet.getInt("Cost");
                
                Meal meal = new Meal(id, name, preptime, cost);
                
                mealsArray.add(meal);
                
            }
     
        }
        catch(SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mealsArray;
    }
    
    public ArrayList<Dessert> getDesserts(){
       
        String getAll = "SELECT * FROM DESSERT";
      
        ArrayList<Dessert> mealsArray = new ArrayList<>();
                
        try {
            
            resultSet = stmt.executeQuery(getAll);
            
            while(resultSet.next()){
            
                int id = resultSet.getInt("DessertId");
                String name = resultSet.getString("Name");
                int preptime = resultSet.getInt("PrepTime");
                int cost = resultSet.getInt("Cost");
                
                Dessert meal = new Dessert(id, name, preptime, cost);
                
                mealsArray.add(meal);
                
            }
     
        }
        catch(SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mealsArray;
    }
    
    public ArrayList<Beverage> getBeverages(){
       
        String getAll = "SELECT * FROM BEVERAGE";
      
        ArrayList<Beverage> mealsArray = new ArrayList<>();
                
        try {
            
            resultSet = stmt.executeQuery(getAll);
            
            while(resultSet.next()){
            
                int id = resultSet.getInt("BeverageId");
                String name = resultSet.getString("Name");
                int preptime = resultSet.getInt("PrepTime");
                int cost = resultSet.getInt("Cost");
                
                Beverage meal = new Beverage(id, name, preptime, cost);
                
                mealsArray.add(meal);
                
            }
     
        }
        catch(SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mealsArray;
    }
    
    public void insertOrder(Order order, List<MealSelection> selection){
        
        //insert the order into its table, add the key of that order to the mealselection table
        //as many times as the selections
     
        //then add the selection as many times as it has a selection
        String insertSelection = "INSERT INTO SELECTION(SelectionId, MealId, DessertId, BeverageID) VALUES(?, ?, ?, ?)";
        String insertMealSelection = "INSERT INTO MEALSELECTION(OrderId, SelectionId) VALUES(?, ?)";
        String insertOrder = "INSERT INTO ORDERS(OrderId, NumGuests, TableNum) VALUES(?, ?, ?)";
        
        String maxSID = "SELECT MAX(SelectionId) FROM SELECTION";
        String maxOrderId = "SELECT MAX(OrderId) FROM ORDERS";
        
        try {
            
            resultSet = stmt.executeQuery(maxSID);
            
            resultSet.next();
            
            int maximum = resultSet.getInt(1) + 1;
            
            resultSet = stmt.executeQuery(maxOrderId);
            
            resultSet.next();
            
            int maximums = resultSet.getInt(1) + 1;
            
            for(int i = 0; i < selection.size(); i++){
                
                //insert into selectiontable
                PreparedStatement insertIntoSelection = con.prepareStatement(insertSelection);

                insertIntoSelection.setInt(1, maximum);
                insertIntoSelection.setInt(2, selection.get(i).getMeal().getId());
                insertIntoSelection.setInt(3, selection.get(i).getDessert().getId());
                insertIntoSelection.setInt(4, selection.get(i).getBeverage().getId());

                insertIntoSelection.executeUpdate();
                
                //insert into meal selection
                PreparedStatement insertIntoMealSelection = con.prepareStatement(insertMealSelection);

                insertIntoMealSelection.setInt(1, maximum);
                insertIntoMealSelection.setInt(2, maximums);

                insertIntoMealSelection.executeUpdate();
                
                
            }
            
            //insert into order table
            PreparedStatement insertIntoOrder = con.prepareStatement(insertOrder);
            
            insertIntoOrder.setInt(1, maximums);
            insertIntoOrder.setInt(2, order.getNumGuests());
            insertIntoOrder.setInt(3, order.getTableNum());
          
            insertIntoOrder.executeUpdate();
            
            
           
        
            
        } catch (SQLException ex) {
            
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            
        }
     
        
    }
    
    
    public Meal getMealById(String n){
       
        Meal mealsArray = null;
        
        String getMeal = "SELECT * FROM MEAL WHERE Name like '?' AND Name like '?'";
        
                
        try {
            
            PreparedStatement prs = con.prepareStatement(getMeal);
            
            prs.setString(1, n);
            prs.setString(2, n);
            
            resultSet = prs.executeQuery(getMeal);
            
            while(resultSet.next()){
            
                int ids = resultSet.getInt("MealId");
                String name = resultSet.getString("Name");
                int preptime = resultSet.getInt("PrepTime");
                int cost = resultSet.getInt("Cost");
                
                mealsArray = new Meal(ids, name, preptime, cost);

            }
     
        }
        catch(SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mealsArray;
        
    }
    
    public Dessert getDessertById(String n){
        
        String get2 = "SELECT * FROM DESSERT WHERE Name like '?'";
      
        Dessert mealsArray = null;
                
        try {
            
            PreparedStatement prs2 = con.prepareStatement(get2);
            
            prs2.setString(1, n);
            
            resultSet = stmt.executeQuery(get2);
            
            while(resultSet.next()){
            
                int ids = resultSet.getInt("DessertId");
                String name = resultSet.getString("Name");
                int preptime = resultSet.getInt("PrepTime");
                int cost = resultSet.getInt("Cost");
                
                mealsArray = new Dessert(ids, name, preptime, cost);

            }
     
        }
        catch(SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mealsArray;
        
    }
    
    public Beverage getBevById(String n){
        
        String get3 = "SELECT * FROM BEVERAGE WHERE Name like '?'";
      
        Beverage mealsArray = null;
                
        try {
            
            PreparedStatement prs3 = con.prepareStatement(get3);
            
            prs3.setString(1, n);
            
            resultSet = stmt.executeQuery(get3);
            
            while(resultSet.next()){
            
                int ids = resultSet.getInt("BeverageID");
                String name = resultSet.getString("Name");
                int preptime = resultSet.getInt("PrepTime");
                int cost = resultSet.getInt("Cost");
                
                mealsArray = new Beverage(ids, name, preptime, cost);

            }
     
        }
        catch(SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mealsArray;
        
    }
    
    
    
}
