package com.electro.controller.waybill;

import com.electro.constant.AppConstants;
import com.electro.model.request.waybill.GhnCallbackOrderRequest;
import com.electro.service.waybill.WaybillService;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/waybills")
@RequiredArgsConstructor
@CrossOrigin(AppConstants.FRONTEND_HOST)
public class WaybillController {

    private final WaybillService waybillService;

    @PutMapping("/callback-ghn")
    public ResponseEntity<ObjectNode> callbackStatusWaybillFromGHN(@RequestBody GhnCallbackOrderRequest ghnCallbackOrderRequest) {
        waybillService.callbackStatusWaybillFromGHN(ghnCallbackOrderRequest);
        return ResponseEntity.status(HttpStatus.OK).body(new ObjectNode(JsonNodeFactory.instance));
    }

}
