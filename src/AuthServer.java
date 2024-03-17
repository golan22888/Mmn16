import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class AuthServer {
    private static final int DEFAULT_PORT = 1256;
    private static String MsgSID;
    private static String MsgSKey;

    public static void main(String[] args) {
        int port = readPortFromFile();
        System.out.println(port);
        readMsgServerIDandKey();
        System.out.println(MsgSID+"\n"+MsgSKey);
    }

    //read the server port from the port.info.txt file.
    private static int readPortFromFile() {
        int port = DEFAULT_PORT;
        try {
            Scanner input = new Scanner(Paths.get("src/port.info.txt"));
            String str = "";
            while(input.hasNext()){
                str = input.next();
            }
            port = Integer.parseInt(str);
        }catch (IOException e){
            System.out.println("Error occurred from file.\nDefault port is being used instead");
        }
        return port;
    }

    private static boolean readMsgServerIDandKey(){
        String str = "";
        int i = 0;
        try {
            Scanner input = new Scanner(Paths.get("msg.info.txt"));
            while(input.hasNext()){
                str = input.next();
                if(++i==3){
                    MsgSID = str;
                    MsgSKey = input.hasNext()? input.next() : "Error";
                }
            }
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}