package at.simon.phoneparts;

import at.simon.phoneparts.exceptions.NoSpaceException;

import java.util.ArrayList;
import java.util.List;

public class MemoryCard {
    private int capacity;
    private List<PhoneFile> files;

    public MemoryCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void saveFile(PhoneFile file) throws NoSpaceException{
        if (getFreeSpace() < file.getSize()){
            throw new NoSpaceException("HAb nur 3 Megabite");
        } else {
            this.files.add(file);
            System.out.println("successfully saved File");
        }
    }

    public int getFreeSpace(){
        int cap = this.capacity;
        for (PhoneFile phoneFile:files){
            cap -= phoneFile.getSize();
        }
        return cap;
    }

    public List<PhoneFile> getFiles() {
        return files;
    }
}
