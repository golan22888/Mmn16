import java.io.Serializable;

public class Response implements Serializable {
    private ResponseHeader responseHeader;
    private String payload;

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
