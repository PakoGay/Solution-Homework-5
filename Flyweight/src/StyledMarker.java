public class StyledMarker implements MapMarker {
    private final MarkerStyle style;
    private final String name;
    public StyledMarker(String name, MarkerStyle style) {
        this.name = name;
        this.style = style;
    }
    @Override
    public void draw(int x, int y) {
        System.out.println("[Marker] " + name + " at (" + x + ", " + y + ") with icon: " + style.getIcon());
    }
}