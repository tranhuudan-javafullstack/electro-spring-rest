package com.electro.controller.inventory;

import com.electro.constant.AppConstants;
import com.electro.model.request.inventory.CountVariantKeyRequest;
import com.electro.model.entity.inventory.CountVariantKey;
import com.electro.service.inventory.CountVariantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/count-variants")
@RequiredArgsConstructor
@CrossOrigin(AppConstants.FRONTEND_HOST)
public class CountVariantController {

    private final CountVariantService countVariantService;

    @DeleteMapping("/{countId}/{variantId}")
    public ResponseEntity<Void> deleteCountVariant(@PathVariable("countId") Long countId,
                                                   @PathVariable("variantId") Long variantId) {
        CountVariantKey id = new CountVariantKey(countId, variantId);
        countVariantService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteCountVariants(@RequestBody List<CountVariantKeyRequest> idRequests) {
        List<CountVariantKey> ids = idRequests.stream()
                .map(idRequest -> new CountVariantKey(idRequest.getCountId(), idRequest.getVariantId()))
                .collect(Collectors.toList());
        countVariantService.delete(ids);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
