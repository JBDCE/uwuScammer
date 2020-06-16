package sauce.me.JBDCE.uwuScammer;

import javax.swing.Icon;

public class Main {

    private DBConn loiconn;
    
    public Main(){
        System.out.println("Hello World!");
        
        boolean succ = establishDBConnection();
        
        if(succ){
            new InputWindow(fetchBaitImg(), fetchBaitTxt());
        }else{
            System.out.println("DBConn Failed.. Fix yo network.");
        }
    }
    
    private boolean establishDBConnection() {
        return false;
    }
    
    private String fetchBaitTxt() {
        return null;
    }
    
    private Icon fetchBaitImg() {
        return null;
    }
    
    
    public static void main(String[] args) {
        new Main();
    }
}

