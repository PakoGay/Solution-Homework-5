public class RealEstateImageApp {
    public static void main(String[] args) {
        PropertyImage image1 = new ImageProxy("villa.jpg");
        image1.displayThumbnail();
        image1.displayFullImage();
        ImageUploadService.uploadImage("agent1", "new_apartment.jpg");
        ImageUploadService.uploadImage("guest", "hack_attempt.jpg");
    }
}