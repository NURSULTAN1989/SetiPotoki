import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class ClientHandler extends Thread{
    private Socket socket;
    public ClientHandler(Socket socket){
        this.socket = socket;
    }
    public void run(){
        try{
            ObjectInputStream inStream =
                    new ObjectInputStream(socket.getInputStream());
            String message = "";
            while((message = (String)inStream.readObject())!=null){
                System.out.println(message);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}