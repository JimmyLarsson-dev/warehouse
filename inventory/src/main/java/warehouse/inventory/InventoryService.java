package warehouse.inventory;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class InventoryService {

//    InventoryRepo repo;
//    public InventoryService(InventoryRepo repo) {
//        this.repo = repo;
//    }

    List<Inventory> inventory = new ArrayList<>();

    public String create(CreateRequest request) {
        try {
            Inventory inv = new Inventory(
                    UUID.randomUUID(),
                    request.getProductName(),
                    request.getQuantity(),
                    0,
                    request.getWarehouseId()
            );
           inventory.add(inv);
        } catch (Exception e) {
            return "error";
        }
        return "success";
    }
    public List<Inventory> getAll() {
        try {
            return inventory;
        } catch (Exception e) {
            return null;
        }
    }
}
