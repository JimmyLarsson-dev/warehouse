package warehouse.product;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    public ProductDTO getProductById(UUID id) {
        Optional<Product> product = productRepo.findById(id);
        return product.map(value -> new ProductDTO(
                value.getId(),
                value.getName(),
                value.getPrice())).orElse(null);
    }
    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepo.findAll();
        return products
                .stream()
                .map(prod -> new ProductDTO(prod.getId(), prod.getName(), prod.getPrice()))
                .toList();
    }
    public String createProduct(Product product) {
        try {
            productRepo.save(product);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Product created successfully";
    }

    public String deleteProduct(UUID id) {
        try {
            productRepo.deleteById(id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Product deleted successfully";
    }

    public String updateProduct(Product product) {
        try {
            productRepo.save(product);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Product updated successfully";
    }
}
