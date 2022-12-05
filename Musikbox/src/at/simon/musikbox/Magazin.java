package at.simon.musikbox;

import java.util.ArrayList;

public class Magazin {
    private ArrayList<Record> records;
    private Record currentRecord;
    public Magazin() {
        this.records = new ArrayList<>();
    }
    public void addRecord(Record record) throws Exception{
        if (this.records.size() < 50){
            this.records.add(record);
        } else {
            throw new Exception("brooo des Magazin isch scho voll, remove mol was [removeRecord()] :)");
        }
    }
    public void removeRecord(Record record){
        this.records.remove(record);
    }
    public int getSumOfMusic(){
        int totalLength = 0;
        for (Record record:this.records) {
            totalLength+= record.getRecordLength();
        }
        return totalLength;
    }
    public Record searchRecord(String recordTitle){
        int titleNum = -1;
        for (int i = 0; i < this.records.size(); i++) {
            if (this.records.get(i).getRecordTitle() == recordTitle){
                titleNum = i;
                break;
            }
        }
        return this.records.get(titleNum);
    }
    public void loadRecord(Record record){
        this.currentRecord = record;
    };
    public void play(int num) throws Exception{
        try {
        System.out.println("started playing " + currentRecord.getRecordTitle() + " at minute " + num);}
        catch (Exception e) {
            throw new Exception("no Records loaded");
        }
    }
}
