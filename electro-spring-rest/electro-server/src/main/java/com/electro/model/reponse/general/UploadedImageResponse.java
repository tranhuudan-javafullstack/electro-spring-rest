package com.electro.model.reponse.general;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UploadedImageResponse {
    private final String name;
    private final String path;
    private final String contentType;
    private final long size;

}