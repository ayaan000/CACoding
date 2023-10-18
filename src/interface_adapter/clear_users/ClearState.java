package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String message = "";

    public ClearState(ClearState copy) {
        message = copy.message;
    }
    public ClearState(){

    }

    public String getMessage() { return message; }
}
