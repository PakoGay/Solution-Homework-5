import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ImageUploadService {
    private static final Set<String> authorizedUsers = new HashSet<>(Arrays.asList("agent1", "agent2"));
    public static void uploadImage(String username, String filename) {
        if (authorizedUsers.contains(username)) {
            System.out.println("[Upload] User '" + username + "' uploaded image: " + filename);
        } else {
            System.out.println("[Access Denied] User '" + username + "' is not authorized to upload.");
        }
    }
}