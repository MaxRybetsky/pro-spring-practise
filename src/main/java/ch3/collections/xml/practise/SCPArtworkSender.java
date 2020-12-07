package ch3.collections.xml.practise;

public class SCPArtworkSender implements ArtworkSender {
    @Override
    public void sendArtwork(String artworkPath, Recipient recipient) {
        // scp logic
    }

    @Override
    public String getFriendlyName() {
        return "Secure Copy Protocol";
    }

    @Override
    public String getShortName() {
        return "scp";
    }
}
