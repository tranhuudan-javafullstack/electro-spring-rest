package com.electro.controller.client;

import com.electro.constant.AppConstants;
import com.electro.constant.FieldName;
import com.electro.constant.ResourceName;
import com.electro.model.common.CollectionWrapper;
import com.electro.model.reponse.client.ClientCategoryResponse;
import com.electro.model.entity.product.Category;
import com.electro.exception.ResourceNotFoundException;
import com.electro.mapper.client.ClientCategoryMapper;
import com.electro.repository.product.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client-api/categories")
@RequiredArgsConstructor
@CrossOrigin(AppConstants.FRONTEND_HOST)
public class ClientCategoryController {

    private final CategoryRepository categoryRepository;
    private final ClientCategoryMapper clientCategoryMapper;

    @GetMapping
    public ResponseEntity<CollectionWrapper<ClientCategoryResponse>> getAllCategories() {
        List<Category> firstCategories = categoryRepository.findByParentCategoryIsNull();
        List<ClientCategoryResponse> clientCategoryResponses = clientCategoryMapper.entityToResponse(firstCategories, 3);
        return ResponseEntity.status(HttpStatus.OK).body(CollectionWrapper.of(clientCategoryResponses));
    }

    @GetMapping("/{slug}")
    public ResponseEntity<ClientCategoryResponse> getCategory(@PathVariable("slug") String slug) {
        ClientCategoryResponse clientCategoryResponse = categoryRepository.findBySlug(slug)
                .map(category -> clientCategoryMapper.entityToResponse(category, false))
                .orElseThrow(() -> new ResourceNotFoundException(ResourceName.CATEGORY.getResourceName(), FieldName.SLUG.getFieldName(), slug));
        return ResponseEntity.status(HttpStatus.OK).body(clientCategoryResponse);
    }

}
