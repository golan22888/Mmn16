import java.io.Serializable;
import java.util.UUID;

public class RequestHeader extends Header implements Serializable {
    private UUID ClientID;

    public RequestHeader(byte version, short code, int payloadSize, UUID ClientID) {
        super(version, code, payloadSize);
        this.ClientID = ClientID;
    }

    public UUID getClientID() {
        return ClientID;
    }
}
