public abstract class Phone {
    private String brand;
    private int storageGB;
    private float screenSize;
    private boolean is5G;

    public Phone(String brand, int storageGB, float screenSize, boolean is5G) {
        this.brand = brand;
        this.storageGB = storageGB;
        this.screenSize = screenSize;
        this.is5G = is5G;
    }

    public String getBrand() { return brand; }
    public int getStorageGB() { return storageGB; }
    public float getScreenSize() { return screenSize; }
    public boolean isIs5G() { return is5G; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setStorageGB(int storageGB) { this.storageGB = storageGB; }
    public void setScreenSize(float screenSize) { this.screenSize = screenSize; }
    public void setIs5G(boolean is5G) { this.is5G = is5G; }

    public abstract String getPhoneType();

    @Override
    public String toString() {
        return brand + " (" + getPhoneType() + ") - " +
               storageGB + "GB, " +
               screenSize + "\" screen, " +
               (is5G ? "5G" : "non-5G");
    }
}

