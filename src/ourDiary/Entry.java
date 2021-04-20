package ourDiary;

import java.time.LocalDateTime;

public class Entry {
    private final LocalDateTime entryDateAndTime;
    private String entryBody;
    private int entryId;
    private static int lastEntryId;

    public Entry(String entryBody){
        this.entryBody = entryBody;
        entryDateAndTime = LocalDateTime.now();
        entryId = ++lastEntryId;
    }
}
