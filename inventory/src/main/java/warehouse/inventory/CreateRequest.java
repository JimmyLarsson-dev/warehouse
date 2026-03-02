package warehouse.inventory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CreateRequest {
    String productName;
    int quantity;
    int warehouseId;
}
