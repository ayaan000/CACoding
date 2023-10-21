package use_case.clear_users;

// TODO Complete me

import java.util.List;

public class ClearOutputData {
    private final List<String> deleted_users;


    public ClearOutputData(List<String> deleted_users){
        this.deleted_users = deleted_users;

    }

    public List<String> deleted_users(){ return deleted_users;}
}
