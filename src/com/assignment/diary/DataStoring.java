package com.assignment.diary;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class DataStoring {
    private ArrayList<DataEntry> entries;

    public DataStoring() {
        entries = new ArrayList<>();
    }

    //private ArrayList<DataEntry> entries = new ArrayList<>();
    public void addEntry(LocalDateTime dateTime, String text) {
        entries.add(new DataEntry(dateTime, text));
    }

    public ArrayList<DataEntry> findDataEntry(LocalDateTime dateTime, boolean byTime) {
        ArrayList<DataEntry> found = new ArrayList<>();
        for (DataEntry entries : entries) {
            if ((byTime && (entries.getDateTime().equals(dateTime)))
                    ||
                    ((!byTime)) && (entries.getDateTime().toLocalDate().equals(dateTime.toLocalDate())))
                found.add(entries);
        }
        return found;
    }

    public void deleteEntries(LocalDateTime dateTime){
        ArrayList<DataEntry> found = findDataEntry(dateTime, true);
        for (DataEntry entry : found){
            entries.remove(entry);
        }
    }
}

