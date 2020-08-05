import java.io.Serializable;
import java.util.Date;
public class MessageData implements Serializable {
    String userName;
    String messageText;
    Date sentDate;

    public MessageData() {
    }

    public MessageData(String userName, String messageText, Date sentDate) {
        this.userName = userName;
        this.messageText = messageText;
        this.sentDate = sentDate;
    }
    public String toString(){
        return  userName+": "+sentDate.toString()+" "+messageText+" ";
    }

}
