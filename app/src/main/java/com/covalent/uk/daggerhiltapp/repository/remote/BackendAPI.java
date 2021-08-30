package com.covalent.uk.daggerhiltapp.repository.remote;

import com.covalent.uk.daggerhiltapp.repository.model.BaseResponse;
import com.covalent.uk.daggerhiltapp.repository.model.CreateNewWorkOrder;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface BackendAPI {

    @POST("/api/WorkOrder/ChildWorkOrder")
    Observable<BaseResponse> createChildWorkOrder(@Body CreateNewWorkOrder createNewWorkOrder);
}
