package dev.java10x.Fridge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getAll() {
        return foodRepository.findAll();
    }
    public Food save(Food food) {return foodRepository.save(food);}

    public void delete(Long id){foodRepository.deleteById(id);}

}
