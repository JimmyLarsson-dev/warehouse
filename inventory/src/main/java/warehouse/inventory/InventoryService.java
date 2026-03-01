package warehouse.inventory;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class InventoryService {

    InventoryRepo repo;
    public InventoryService(InventoryRepo repo) {
        this.repo = repo;
    }

    public String create(CreateRequest request) {
        try {
            Inventory inv = new Inventory(
                    UUID.randomUUID(),
                    request.getProductName(),
                    request.getQuantity(),
                    0,
                    request.getWarehouseId()
            );
            repo.save(inv);
        } catch (Exception e) {
            return "error";
        }
        return "success";
    }
    public List<Inventory> getAll() {
        try {
            return repo.findAll();
        } catch (Exception e) {
            return null;
        }
    }
}
