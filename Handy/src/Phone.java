import at.simon.phoneparts.*;
import at.simon.phoneparts.exceptions.NoSpaceException;

public class Phone {
    private SimCard simCard;
    private MemoryCard memoryCard;
    private Camera camera;
    private String color;

    public Phone(SimCard simCard, MemoryCard memoryCard, Camera camera, String color) {
        this.simCard = simCard;
        this.memoryCard = memoryCard;
        this.camera = camera;
        this.color = color;
    }

    public void takePicture(){
        try {
            this.memoryCard.saveFile(this.camera.makePicture());
        } catch (NoSpaceException e) {
            System.out.println("Fehler! Es ist nicht genügend SPeicherplatz vorhanden! Bitte lösche einige Files!");
        }

    }
    public void makeCall(String number){
        this.simCard.callNumber(number);
    }

    public void getFiles(){
        System.out.println(this.memoryCard.getFiles());
    }
    public void getFreeSpace(){
        System.out.println(this.memoryCard.getFreeSpace());
    }
}
