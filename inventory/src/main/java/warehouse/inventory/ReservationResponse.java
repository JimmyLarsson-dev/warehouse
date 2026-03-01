package warehouse.inventory;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class ReservationResponse {
    UUID reservationId;
    Status status;

}
