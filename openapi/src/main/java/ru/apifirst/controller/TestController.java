package ru.apifirst.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.artem.model.CategoryDto;
import ru.artem.model.NewCategoryDto;

@RestController
public class TestController implements ru.artem.api.AdminApi {

    @Override
    public ResponseEntity<CategoryDto> addCategory(NewCategoryDto newCategoryDto) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(1L);
        categoryDto.setName("Name");
        return ResponseEntity.ok().body(categoryDto);
    }
}
