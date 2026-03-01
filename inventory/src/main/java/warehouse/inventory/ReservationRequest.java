package warehouse.inventory;

import lombok.Data;

import java.util.UUID;

@Data
public class ReservationRequest {
    UUID productId;
    int quantity;
}
