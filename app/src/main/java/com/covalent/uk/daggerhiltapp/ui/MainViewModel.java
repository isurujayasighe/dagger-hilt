package com.covalent.uk.daggerhiltapp.ui;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

import com.covalent.uk.daggerhiltapp.repository.MainActivityRepository;
import com.covalent.uk.daggerhiltapp.repository.model.CreateNewWorkOrder;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;


@HiltViewModel
public class MainViewModel extends ViewModel {

    private static final String TAG = MainViewModel.class.getSimpleName();

    @Inject
    MainActivityRepository mainActivityRepository;

    private final SavedStateHandle handle;

    private final CompositeDisposable disposable = new CompositeDisposable();

    private final MutableLiveData<String> successMessage = new MutableLiveData<>();

    private final MutableLiveData<String> errorMessage = new MutableLiveData<>();

    @Inject
    public MainViewModel(SavedStateHandle handle, MainActivityRepository mainActivityRepository) {
        this.handle = handle;
        this.mainActivityRepository = mainActivityRepository;
    }

    public MutableLiveData<String> getSuccessMessage() {
        return successMessage;
    }

    public MutableLiveData<String> getErrorMessage() {
        return errorMessage;
    }

    public void createRecord(CreateNewWorkOrder workOrder){
        disposable.add(mainActivityRepository.createNewWorkOrder(workOrder)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(baseResponse -> {
                    if(baseResponse.getStatusCode() == 0){
                        Log.d(TAG, "Successfully Created!");
                        successMessage.setValue("Success");
                    }

                },throwable -> {
                    Timber.d(throwable.getMessage());
                    errorMessage.setValue(throwable.getMessage());
                }));
    }

}
