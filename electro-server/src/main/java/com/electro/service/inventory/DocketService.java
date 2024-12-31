package com.electro.service.inventory;

import com.electro.model.request.inventory.DocketRequest;
import com.electro.model.reponse.inventory.DocketResponse;
import com.electro.service.CrudService;

public interface DocketService extends CrudService<Long, DocketRequest, DocketResponse> {}
