package com.example.exdea.service;

import com.example.exdea.dto.CategoryDTO;
import com.example.exdea.entity.Category;
import com.example.exdea.repository.CategoryRepo;
import com.example.exdea.util.VarList;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//To mark this class as a Spring service component (this is making )
@Service
@Transactional // this annotation ensure that the methods in this service class are executed within a transactional context.(if an operation fails, the entire transaction can be rolled back.)

public class CategoryService {

    @Autowired //this automatically inject the CategoryRepo bean into this service class.
    private CategoryRepo categoryRepo;

    @Autowired //
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
