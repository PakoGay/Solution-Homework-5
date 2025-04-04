public class ImageProxy implements PropertyImage {
    private final String filename;
    private HighResolutionPropertyImage realImage;
    public ImageProxy(String filename) {
        this.filename = filename;
    }
    @Override
    public void displayThumbnail() {
        System.out.println("[Thumbnail] Preview image (low-res): " + filename);
    }
    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new HighResolutionPropertyImage(filename);
        }
        realImage.displayFullImage();
    }
}
