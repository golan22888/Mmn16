import java.io.Serializable;

public class Header implements Serializable {
    private byte version;
    private short code;
    private int payloadSize;

    public Header(byte version, short code, int payloadSize) {
        this.version = version;
        this.code = code;
        this.payloadSize = payloadSize;
    }

    public byte getVersion() {
        return version;
    }

    public short getCode() {
        return code;
    }

    public int getPayloadSize() {
        return payloadSize;
    }
}
