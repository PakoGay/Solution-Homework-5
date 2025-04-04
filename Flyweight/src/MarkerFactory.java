import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
    private static final Map<String, MarkerStyle> styleMap = new HashMap<>();
    public static MarkerStyle getStyle(String type) {
        if (!styleMap.containsKey(type)) {
            switch (type) {
                case "hospital":
                    styleMap.put("hospital", new MarkerStyle("+", "red", "bold"));
                    break;
                case "restaurant":
                    styleMap.put("restaurant", new MarkerStyle("🍴", "blue", "italic"));
                    break;
                case "gas":
                    styleMap.put("gas", new MarkerStyle("⛽", "green", "normal"));
                    break;
            }
        }
        return styleMap.get(type);
    }
    public static int getStyleCount() {
        return styleMap.size();
    }
}