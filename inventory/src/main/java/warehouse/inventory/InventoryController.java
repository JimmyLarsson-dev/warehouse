package warehouse.inventory;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/inventory")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class InventoryController {

    InventoryService service;
    public InventoryController(InventoryService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public String create(
            @RequestBody CreateRequest request) {
        return service.create(request);
    }
    @GetMapping("/getAll")
    public List<Inventory> getAll() {
        return service.getAll();
    }


//    @PostMapping("/reserve")
//    public ReservationResponse reserve(
//            @RequestBody ReservationRequest reservation,
//            @RequestParam UUID orderId) {
//        return service.reserve(reservation, orderId);
//    }
//    @PostMapping("/confirmOrder")
//    public ReservationResponse confirmOrder(
//            @RequestParam UUID reservationId,
//            @RequestParam UUID orderId) {
//        return service.confirmOrder(reservationId, orderId);
//    }
//    @PostMapping("release")
//    public String release(
//            @RequestParam UUID reservationId,
//            @RequestParam UUID orderId) {
//        return service.release(reservationId, orderId);
//    }
//    @GetMapping("/inventoryAmount")
//    public int getInventoryAmount(@RequestParam UUID productId) {
//        return service.getInventoryAmount(productId);
//    }



}
