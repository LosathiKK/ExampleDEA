package com.example.exdea.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data

public class ResponseDTO {
    private String code;
    private String message;
    private Object content;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setContent(CategoryDTO content) {
        this.content = content;
    }

    public CategoryDTO getContent() {
        return (CategoryDTO) content;
    }
}
