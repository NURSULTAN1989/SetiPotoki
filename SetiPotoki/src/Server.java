import java.net.*;

public class Server{
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(5000);
            while(true){
                Socket socket = server.accept();
                System.out.println("Client connected");
                ClientHandler clientHandler = new ClientHandler(socket);
                clientHandler.start();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}