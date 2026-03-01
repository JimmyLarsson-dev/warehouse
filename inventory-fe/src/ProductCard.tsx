
export interface Product {
    productId: string;
    productName: string;
    availableQuantity: number;
    reservedQuantity: number;
    warehouseId: number;
}

export interface CreateProductPayload {
    productName: string;
    quantity: number;
    warehouseId: number;
}

const ProductCard = ({ product }: { product: Product }) => (
    <div className="rounded-lg border border-border bg-card p-5 shadow-sm transition-shadow hover:shadow-md">
        <h3 className="mb-3 text-lg font-semibold text-card-foreground">{product.productName}</h3>
        <div className="space-y-1.5 text-sm text-muted-foreground">
            <p>ID: <span className="font-mono text-card-foreground">{product.productId}</span></p>
            <p>Available: <span className="font-semibold text-accent">{product.availableQuantity}</span></p>
            <p>Reserved: <span className="font-semibold text-card-foreground">{product.reservedQuantity}</span></p>
            <p>Warehouse: <span className="text-card-foreground">{product.warehouseId}</span></p>
        </div>
    </div>
);

export default ProductCard;
