package sauce.me.JBDCE.uwuScammer;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;

public class Main {

    private DBConn loiconn;

    public Main(){
        System.out.println("Hello World!");
        
        boolean succ = establishDBConnection();
        if(succ){
            ResultSet rs = fetchBait();
            try {
                rs.next();
                new InputWindow(fetchBaitImg(rs), fetchBaitTxt(rs));
                
            } catch (Exception e) {
                //TODO Ein problem für zukunftsjbdce2
                
            }
        }else{
            System.out.println("DBConn Failed.. Fix yo network.");
        }
    }
    
    private boolean establishDBConnection() {
        try {
            this.loiconn = DBConn.getInstance("localhost:3306/hhaven", "loli", "ahegao");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private ResultSet fetchBait(){
        ResultSet rs = this.loiconn.executeQuery("SELECT text, dickpic FROM t_bait ORDER BY RAND() LIMIT 1");
        return rs;
    }

    private String fetchBaitTxt(ResultSet rs) throws SQLException{
        return rs.getString("text");
    }
    
    private BufferedImage fetchBaitImg(ResultSet rs) throws Exception{
        BufferedImage bi = new BufferedImage(200,200, BufferedImage.TYPE_INT_RGB);
        Blob blob = rs.getBlob("dickpic");
        byte[] dickbytes = blob.getBytes(1, (int)blob.length());
        bi = ImageIO.read(new ByteArrayInputStream(dickbytes));
        return bi;
    }
    
    
    public static void main(String[] args) {
        new Main();
    }
}

