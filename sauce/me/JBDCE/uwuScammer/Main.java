package sauce.me.JBDCE.uwuScammer;

import java.awt.Component;
import java.awt.Graphics;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.Icon;

import sun.awt.image.BufferedImageDevice;

import java.awt.image.*;
import java.io.ByteArrayInputStream;

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
        try {
            this.loiconn = DBConn.getInstance("localhost:3306/", "loli", "ahegao");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    private String fetchBaitTxt() {
        ResultSet rs = this.loiconn.executeQuery("SELECT text FROM t_bait ORDER BY RAND() LIMIT 1");
        try {
            rs.next();
            return rs.getString("text");
        } catch (SQLException e) {
            return "Wait that is not Tennis...";
        }
    }
    
    private BufferedImage fetchBaitImg() {
        ResultSet rs = this.loiconn.executeQuery("SELECT dickpic FROM t_bait ORDER BY RAND() LIMIT 1");
        BufferedImage bi = new BufferedImage(100,100, BufferedImage.TYPE_INT_RGB);
        try {
            rs.next();
            Blob blob = rs.getBlob("dickpic");
            byte[] dickbytes = blob.getBytes(1, (int)blob.length());
            bi = ImageIO.read(new ByteArrayInputStream(dickbytes));
        } catch (Exception e) {
            //TODO Ein problem für zukunftsjbdce
        }
        return bi;
    }
    
    
    public static void main(String[] args) {
        new Main();
    }
}

