public class EncryptedKey {
    private byte[] encryptedKeyIV;
    private long nonce;
    private byte[] AESKey;

    public EncryptedKey(byte[] encryptedKeyIV, long nonce, byte[] AESKey) {
        this.encryptedKeyIV = encryptedKeyIV;
        this.nonce = nonce;
        this.AESKey = AESKey;
    }

    public byte[] getEncryptedKeyIV() {
        return encryptedKeyIV;
    }

    public long getNonce() {
        return nonce;
    }

    public byte[] getAESKey() {
        return AESKey;
    }
}
