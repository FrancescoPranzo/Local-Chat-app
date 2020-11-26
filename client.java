import java.net.*;
import java.io.*;

public class client { 
    public static void main(String[] args) { 
        client c = new client();
        c.go();
    }
    public void go() { 
        System.out.println("starting the client");
        
        try { 
                Socket sc = new Socket("127.0.0.1", 4250);
                
                PrintWriter writer = new PrintWriter(sc.getOutputStream());
                //test with an "user input string"
                writer.println(InputMex());                
                //close the writer
                writer.close();
        } catch (IOException ex) { 
            ex.printStackTrace();
        }
    }
    
    public String InputMex() { 
        System.out.println("inserisci un messaggio");
        String input = System.console().readLine();
        
        return input;
    }
}
