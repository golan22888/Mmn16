import java.io.Serializable;

public class ResponseHeader extends Header implements Serializable {
    public ResponseHeader(byte version, short code, int payloadSize) {
        super(version, code, payloadSize);
    }
}
