package devices;

public enum DeviceFarm {

    // Create path for every android version.
    ANDROID_S("src/test/resources/capabilities/android-s.json");

    public String path;
    DeviceFarm(String path){
        this.path = path;
    }
}
