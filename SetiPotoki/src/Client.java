import java.io.*;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        //MessageData msgd=new MessageData();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try{
            Socket socket = new Socket("127.0.0.1", 5000);

            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Input name");
            String name = input.readLine();///
            String messageFromServer ="";
            while(true){
                System.out.println("PRESS [1] TO SEND MESSAGE");
                System.out.println("PRESS [2] TO EXIT");
                int choice=sin.nextInt();
                if(choice==1){
                    System.out.println("Insert message text:");
                    String message = input.readLine();
                    Date date = new Date();
                    String str=name+" "+ message+" "+date;
                    out.writeObject(str);
                   // MessageData m = new MessageData(name,message,date);
                   // out.writeObject(m);
                }
                else if(choice==2){
                    break;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}