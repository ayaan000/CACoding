package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import view.ViewManager;

import java.time.LocalDateTime;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    public void prepareSuccessView(ClearOutputData response){
        LocalDateTime responseTime = LocalDateTime.parse(response.getClearTime());
        ClearState clearState = clearViewModel.getState();
        clearState.

    }
}
