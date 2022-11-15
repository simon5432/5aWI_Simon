package at.simon.phoneparts;

public class PhoneFile {
    private int size;
    enum type{exe, ini, png, jpg}
    private type extension;
    private String name;

    public PhoneFile(int size, type extension, String name) {
        this.size = size;
        this.extension = extension;
        this.name = name;
    }

    public int getSize() {
        return size;
    }
}
