package warehouse.product;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/get/{id}")
    public ProductDTO getProductById(@PathVariable UUID id) {
        return productService.getProductById(id);
    }
    @GetMapping("/all")
    public List<ProductDTO> getAllProducts() {
        return productService.getAllProducts();
    }
    @PostMapping("/create")
    public String createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable UUID id) {
        return productService.deleteProduct(id);
    }
    @PutMapping("/update")
    public String updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

}
