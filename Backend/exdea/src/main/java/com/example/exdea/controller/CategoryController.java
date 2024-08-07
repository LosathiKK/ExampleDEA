package com.example.exdea.controller;

import com.example.exdea.dto.CategoryDTO;
import com.example.exdea.dto.ResponseDTO;
import com.example.exdea.service.CategoryService;
import com.example.exdea.util.VarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/category")

public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ResponseDTO responseDTO;

    @PostMapping(value = "/saveCategory")
    public ResponseEntity saveCategory(@RequestBody CategoryDTO categoryDTO){
        try{
            String res = categoryService.saveCategory(categoryDTO);
            if (res.equals("00")) {
                responseDTO.setCode(VarList.RSP_SUCCESS);
                responseDTO.setMessage("Category Added Successfully!");
                responseDTO.setContent(categoryDTO);
                return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

            }else if(res.equals("06")) {
                responseDTO.setCode(VarList.RSP_DUPLICATED);
                responseDTO.setMessage("Category is Duplicated!!");
                responseDTO.setContent(categoryDTO);
                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

            }else {
                responseDTO.setCode(VarList.RSP_FAIL);
                responseDTO.setMessage("Invalid Category Input!");
                responseDTO.setContent(categoryDTO);
                return new ResponseEntity(responseDTO, HttpStatus.BAD_REQUEST);

            }
        }catch (Exception e){
            responseDTO.setCode(VarList.RSP_ERROR);
            responseDTO.setMessage(e.getMessage());
            responseDTO.setContent(null);
            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
