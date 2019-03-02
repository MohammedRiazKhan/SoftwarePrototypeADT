package restaurant;
import db.Database;
import java.io.IOException;
public class main {
    
    public static Database db = new Database();
    
    public static void main(String[] args){
        
        
        try{
            
            db.connect();
            //db.createTables();
            //db.populateDatabase();
            
        }
        
       catch(IOException e){
           System.out.println(e.getMessage());
       }
        
        new MainView().setVisible(true);
        
    }
    
    public static String getProgramPath() throws IOException{
        
        String currentDir = System.getProperty("user.dir");
        
        currentDir = currentDir.replace("\\", "/");
        
        return currentDir;
        
    }
    
}
