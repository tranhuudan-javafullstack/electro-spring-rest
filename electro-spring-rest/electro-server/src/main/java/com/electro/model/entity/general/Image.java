package com.electro.model.entity.general;

import com.electro.model.common.BaseEntity;
import com.electro.model.entity.product.Product;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "image")
public class Image extends BaseEntity {
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "path", nullable = false, unique = true)
    private String path;

    @Column(name = "content_type", nullable = false)
    private String contentType;

    @Column(name = "size", nullable = false)
    private Long size;

    /**
     * Có 3 nhóm (group):
     * <ul>
     *     <li>P – Product</li>
     *     <li>C – Category</li>
     *     <li>U – User</li>
     * </ul>
     */
    @Column(name = "`group`", nullable = false)
    private String group;

    @Column(name = "is_thumbnail", nullable = false, columnDefinition = "BIT")
    private Boolean isThumbnail;

    @Column(name = "is_eliminated", nullable = false, columnDefinition = "BIT")
    private Boolean isEliminated;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @JsonBackReference
    private Product product;
}
