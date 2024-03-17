import java.io.Serializable;
import java.util.UUID;

public class Ticket implements Serializable {
    private byte version;
    private UUID clientID;
    private UUID serverID;
    private long creationTime;

    private byte[] ticketIV;
    private byte[] AESKey;
    private long expirationTime;

    public Ticket(byte version, UUID clientID, UUID serverID, long creationTime, byte[] ticketIV, byte[] AESKey, long expirationTime) {
        this.version = version;
        this.clientID = clientID;
        this.serverID = serverID;
        this.creationTime = creationTime;
        this.ticketIV = ticketIV;
        this.AESKey = AESKey;
        this.expirationTime = expirationTime;
    }

    public byte getVersion() {
        return version;
    }

    public UUID getClientID() {
        return clientID;
    }

    public UUID getServerID() {
        return serverID;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public byte[] getTicketIV() {
        return ticketIV;
    }

    public byte[] getAESKey() {
        return AESKey;
    }

    public long getExpirationTime() {
        return expirationTime;
    }

}
