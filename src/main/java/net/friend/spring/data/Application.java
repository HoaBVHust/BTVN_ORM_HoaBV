package net.friend.spring.data;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import net.friend.spring.data.model.Category;
import net.friend.spring.data.model.Item;
import net.friend.spring.data.model.Type;
import net.friend.spring.data.service.CategoryService;
import net.friend.spring.data.service.ItemService;
import net.friend.spring.data.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

  public static void main(String[] args){
    SpringApplication.run(Application.class);
  }

  @Autowired
  private CategoryService categoryService;

  @Autowired
  private ItemService itemService;

  @Autowired
  private TypeService typeService;

  @Override
  public void run(String... strings) throws Exception {
    //init
    Category category = new Category("category1",1);
    categoryService.save(category);
    Type type = new Type("Type1");
    typeService.save(type);
    Item item = new Item("Item1",1);

    //find by Type
    List<Category> categories= categoryService.findByType("Type1",1,10);
    System.out.println(categories);

    //find by Category
    List<Item> items = itemService.findByCategory("category1",1,2);
    System.out.println(items);

    //update Categpry
    categoryService.updateCaregory((long) 1,"category2");
    System.out.println(categoryService.findByType("Type1",1,10));
  }
}
