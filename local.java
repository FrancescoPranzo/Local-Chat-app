import java.net.*;
import java.io.*;

public class local { 
    
    public void go() {
        try { 
            System.out.println("starting server");
            
            ServerSocket s = new ServerSocket(4250);
            while(true) {
                Socket sock = s.accept();
                
                InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
                BufferedReader reader = new BufferedReader(streamReader);
                String mex = reader.readLine();
                System.out.println("Server received this:" + mex);
                
                //trying to end the reader
                reader.close();
            } //end of the while
        } 
        catch (IOException ex) { 
                ex.printStackTrace();
        }
        
    }
    
    //main
    public static void main(String[] args) { 
    
    local l = new local();
    l.go();
        
    }// end of the main
}
//TESTATO
//IT WORKS!!
