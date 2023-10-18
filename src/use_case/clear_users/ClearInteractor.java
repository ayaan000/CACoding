package use_case.clear_users;

// TODO Complete me

import entity.User;
import entity.UserFactory;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAcessObject;

    final ClearOutputBoundary userPresenter;


    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary){
        this.userDataAcessObject = clearUserDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }

    public void execute() {
        userDataAcessObject.clear();
        userPresenter.prepareSuccessView();
    }
}
