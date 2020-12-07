package ch3.collections.xml.practise;

public class EmailArtworkSender implements ArtworkSender {
    @Override
    public void sendArtwork(String artworkPath, Recipient recipient) {
        // email
    }

    @Override
    public String getFriendlyName() {
        return "Email Sender";
    }

    @Override
    public String getShortName() {
        return "email";
    }
}
