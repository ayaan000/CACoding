package use_case.clear_users;

// TODO Complete me

import java.util.List;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface clearDataAccessInterface;

    final ClearOutputBoundary userPresenter;


    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary){
        this.clearDataAccessInterface = clearUserDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }

    public void execute() {
        List<String> deleted_users = clearDataAccessInterface.clear();
        System.out.println(deleted_users);
        ClearOutputData clearOutputData = new ClearOutputData(deleted_users);

        userPresenter.prepareSuccessView(clearOutputData);

    }
}
