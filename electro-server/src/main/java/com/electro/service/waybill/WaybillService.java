package com.electro.service.waybill;

import com.electro.model.request.waybill.GhnCallbackOrderRequest;
import com.electro.model.request.waybill.WaybillRequest;
import com.electro.model.reponse.waybill.WaybillResponse;
import com.electro.service.CrudService;

public interface WaybillService extends CrudService<Long, WaybillRequest, WaybillResponse> {

    void callbackStatusWaybillFromGHN(GhnCallbackOrderRequest ghnCallbackOrderRequest) throws RuntimeException;

}
