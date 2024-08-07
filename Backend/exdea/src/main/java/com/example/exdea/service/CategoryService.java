package com.example.exdea.service;

import com.example.exdea.dto.CategoryDTO;
import com.example.exdea.entity.Category;
import com.example.exdea.repository.CategoryRepo;
import com.example.exdea.util.VarList;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ModelMapper modelMapper;

    // Save Method
    public String saveCategory(CategoryDTO categoryDTO){
        if (categoryRepo.existsById(categoryDTO.getCategoryID())){
            return VarList.RSP_DUPLICATED;
        }else {
            categoryRepo.save(modelMapper.map(categoryDTO, Category.class));
            return VarList.RSP_SUCCESS;
        }
    }
}
