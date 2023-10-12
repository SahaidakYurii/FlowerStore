package flower.filters.properties;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"),
    BLUE("#0000FF"),
    YELLOW("#FFFF00"),
    ORANGE("#FFA500"),
    PINK("#FFC0CB"),
    VIOLET("#8F00FF"),
    WHITE("#FFFFFF");

    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
