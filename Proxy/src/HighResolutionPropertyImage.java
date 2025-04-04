public class HighResolutionPropertyImage implements PropertyImage {
    private final String filename;
    public HighResolutionPropertyImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
    private void loadFromDisk() {
        System.out.println("[Loading] High-res image from disk: " + filename);
    }
    @Override
    public void displayThumbnail() {
        System.out.println("[Thumbnail] (High-res) for: " + filename);
    }
    @Override
    public void displayFullImage() {
        System.out.println("[Display] Full high-res image: " + filename);
    }
}