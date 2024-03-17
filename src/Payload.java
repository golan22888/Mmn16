import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Payload implements Serializable {
    private List <Object> payload;

    public Payload(Object... objects) {
        this.payload = new ArrayList<>();
        for (Object obj : objects) {
            this.payload.add(obj);
        }
    }
}
