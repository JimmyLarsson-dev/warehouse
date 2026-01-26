package warehouse.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Product {
    @Id
    private UUID id;
    private String name;
    private double price;
    private boolean active;
}
