package interface_adapter.clear_users;

// TODO Complete me

import java.util.*;

public class ClearState {

    List<String> deleted_users = new ArrayList<>();

    public ClearState(ClearState copy) {
        this.deleted_users = copy.deleted_users;
    }

    public ClearState() {

    }

    public String deleted_users() {
        String final_deleted = "";
        for (String user : deleted_users) {
            final_deleted = final_deleted.concat(user + "\n");
        }
        return final_deleted;
    }
}