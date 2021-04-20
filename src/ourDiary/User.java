package ourDiary;

public class User {

    private final Diary diary;
    private final String userName;

    public User(String userName, Diary userDiary){
        diary = userDiary;
        this.userName = userName;
    }

    public Diary getDiary() {
        return diary;
    }

    public void createEntry(String entryBody) {
        diary.addEntry(entryBody);
    }
}
