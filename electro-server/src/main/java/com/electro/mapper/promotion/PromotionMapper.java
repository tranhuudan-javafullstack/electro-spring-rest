package com.electro.mapper.promotion;

import com.electro.model.reponse.client.ClientPromotionResponse;
import com.electro.model.request.promotion.PromotionRequest;
import com.electro.model.reponse.promotion.PromotionResponse;
import com.electro.model.entity.product.Category;
import com.electro.model.entity.product.Product;
import com.electro.model.entity.promotion.Promotion;
import com.electro.mapper.GenericMapper;
import com.electro.mapper.product.ProductMapper;
import com.electro.repository.product.CategoryRepository;
import com.electro.utils.MapperUtils;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {MapperUtils.class, ProductMapper.class})
@RequiredArgsConstructor
public abstract class PromotionMapper implements GenericMapper<Promotion, PromotionRequest, PromotionResponse> {

    private final CategoryRepository categoryRepository;


    protected PromotionMapper() {
        this(null);
    }

    @Override
    @BeanMapping(qualifiedByName = "addProductsFromCategories")
    @Mapping(source = "productIds", target = "products")
    public abstract Promotion requestToEntity(PromotionRequest request);

    @Override
    @Mapping(source = "productIds", target = "products")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    public abstract Promotion partialUpdate(@MappingTarget Promotion entity, PromotionRequest request);

    @BeforeMapping
    @Named("addProductsFromCategories")
    protected void addProductsFromCategories(@MappingTarget Promotion promotion, PromotionRequest request) {
        if (request.getCategoryIds().isEmpty()) return;

        Set<Product> productsFromCategories = request.getCategoryIds().stream()
                .map(categoryRepository::getById)
                .map(Category::getProducts)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
        promotion.setProducts(productsFromCategories);
    }

    @Mapping(source = "id", target = "promotionId")
    @Mapping(source = "percent", target = "promotionPercent")
    public abstract ClientPromotionResponse entityToClientResponse(Promotion promotion);

}