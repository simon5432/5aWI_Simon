import at.simon.phoneparts.Camera;
import at.simon.phoneparts.MemoryCard;
import at.simon.phoneparts.PhoneFile;
import at.simon.phoneparts.SimCard;

public class Main {
    public static void main(String[] args) {
        MemoryCard mem1 = new MemoryCard(500);
        SimCard sim1 = new SimCard("123234336");
        Camera cam1 = new Camera(Camera.res.FullHD);
        Phone p1 = new Phone(sim1,mem1, cam1,"blue");
        p1.makeCall("912741982371");
        p1.takePicture();
        p1.takePicture();
        p1.takePicture();
        p1.takePicture();
        p1.takePicture();
        p1.getFiles();
        p1.getFreeSpace();
    }
}