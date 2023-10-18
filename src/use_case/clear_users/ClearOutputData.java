package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private final String message;

    private String clearTime;

    public ClearOutputData(String message, String clearTime){
        this.message = message;
        this.clearTime = clearTime;

    }

    public String getClearTime(){ return clearTime; }

    public String getMessage() { return message; }
}
