import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapApp {
    public static void main(String[] args) {
        List<MapMarker> markers = new ArrayList<>();
        Random rand = new Random();
        String[] types = {"hospital", "restaurant", "gas"};
        for (int i = 0; i < 10000; i++) {
            String type = types[rand.nextInt(types.length)];
            MarkerStyle style = MarkerFactory.getStyle(type);
            MapMarker marker = new StyledMarker(type + " #" + i, style);
            markers.add(marker);
        }
        markers.get(0).draw(10, 20);
        System.out.println("Total Markers Created: " + markers.size());
        System.out.println("Unique Style Objects: " + MarkerFactory.getStyleCount());
    }
}
