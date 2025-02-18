package com.electro.repository.inventory;

import com.electro.model.entity.inventory.DocketVariant;
import com.electro.model.entity.inventory.DocketVariantKey;
import com.electro.model.entity.product.Product;
import com.electro.model.entity.product.Variant;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.Join;
import java.util.List;
@Repository
public interface DocketVariantRepository extends JpaRepository<DocketVariant, DocketVariantKey>,
        JpaSpecificationExecutor<DocketVariant> {

    default List<DocketVariant> findByProductId(Long productId) {
        Specification<DocketVariant> spec = (root, query, cb) -> {
            Join<DocketVariant, Variant> variant = root.join("variant");
            Join<Variant, Product> product = variant.join("product");

            query.where(cb.equal(product.get("id"), productId));
            query.orderBy(cb.desc(root.get("docket").get("id")));

            return query.getRestriction();
        };

        return findAll(spec);
    }

    default List<DocketVariant> findByVariantId(Long variantId) {
        Specification<DocketVariant> spec = (root, query, cb) -> query
                .where(cb.equal(root.get("variant").get("id"), variantId))
                .orderBy(cb.desc(root.get("docket").get("id")))
                .getRestriction();

        return findAll(spec);
    }

}
