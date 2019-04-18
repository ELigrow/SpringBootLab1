package us.eligrow.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @RequestMapping("/products")
    public List<Products> getAllFoods() {

        List<Products> products = new ArrayList<>();
        products.add(new Products("Black Mamba Paracord Band",14.99));
        products.add(new Products("Blue Sapphire Headlamp",99.99));
        products.add(new Products("Lizard Gear Survival Machete",49.99));

        return products;
    }
}

