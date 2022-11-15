package at.simon.phoneparts;

import static at.simon.phoneparts.PhoneFile.type.jpg;

public class Camera {
    public enum res{FullHD, HDReady, UltraHD}
    private res resolution;

    public Camera(res resolution) {
        this.resolution = resolution;
    }

    public PhoneFile makePicture() {
        PhoneFile phonefile = new PhoneFile(0,null,null);
        switch (this.resolution) {
            case FullHD: phonefile = new PhoneFile(150,jpg,"Fullhd");
            break;
            case HDReady: phonefile =  new PhoneFile(120,jpg,"HDReady");
            break;
            case UltraHD: phonefile =  new PhoneFile(200,jpg,"UltraHD");
            break;
        }
        return phonefile;
    }
}
