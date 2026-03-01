package warehouse.inventory;

import lombok.Data;

@Data
public class CreateRequest {
    String productName;
    int quantity;
    int warehouseId;
}
