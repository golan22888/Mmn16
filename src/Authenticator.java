import java.util.UUID;

public class Authenticator {
    private byte[] authenticatorIV;
    private byte version;
    private UUID clientID;
    private UUID serverID;
    private long creationTime;

    public Authenticator(byte[] authenticatorIV, byte version, UUID clientID, UUID serverID, long creationTime) {
        this.authenticatorIV = authenticatorIV;
        this.version = version;
        this.clientID = clientID;
        this.serverID = serverID;
        this.creationTime = creationTime;
    }

    public byte[] getAuthenticatorIV() {
        return authenticatorIV;
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
}
