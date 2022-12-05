package at.simon.musikbox;

import java.util.ArrayList;

public class Record {
    private ArrayList<Title> titles;
    private String recordTitle;
    private int recordId;

    public Record(String recordTitle, int recordId) {
        this.recordTitle = recordTitle;
        this.recordId = recordId;
        this.titles = new ArrayList<>();
    }
    public int getRecordLength(){
        int totalLength = 0;
        for (Title title:this.titles
             ) {
            totalLength += title.getLength();
        }
        return totalLength;
    }

    public String getRecordTitle() {
        return recordTitle;
    }

    public int getRecordId() {
        return recordId;
    }
    public void addTitle(Title title){
        this.titles.add(title);
    }
}
