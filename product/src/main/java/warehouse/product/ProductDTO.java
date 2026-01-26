package warehouse.product;

import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
public class ProductDTO {
    private UUID id;
    private String name;
    private double price;
}
