package warehouse.inventory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InventoryRepo extends JpaRepository<Inventory, UUID> {
}
