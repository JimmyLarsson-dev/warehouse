import { useState } from "react";



interface Props {
    onSubmit: (payload: CreateProductPayload) => Promise<void>;
    loading: boolean;
}

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

const CreateProductForm = ({ onSubmit, loading }: Props) => {
    const [productName, setProductName] = useState("");
    const [quantity, setQuantity] = useState("");
    const [warehouseId, setWarehouseId] = useState("");

    const handleSubmit = async (e: React.FormEvent) => {
        e.preventDefault();
        if (!productName || !quantity || !warehouseId) return;
        await onSubmit({
            productName,
            quantity: Number(quantity),
            warehouseId: Number(warehouseId),
        });
        setProductName("");
        setQuantity("");
        setWarehouseId("");
    };

    return (
        <form onSubmit={handleSubmit} className="rounded-lg border border-border bg-card p-5 space-y-4">
            <h3 className="text-lg font-semibold text-card-foreground">Create Product</h3>
            <div className="space-y-2">
                <label htmlFor="productName">Product Name</label>
                <input id="productName" value={productName} onChange={(e) => setProductName(e.target.value)} required />
            </div>
            <div className="space-y-2">
                <label htmlFor="quantity">Quantity</label>
                <input id="quantity" type="number" min={0} value={quantity} onChange={(e) => setQuantity(e.target.value)} required />
            </div>
            <div className="space-y-2">
                <label htmlFor="warehouseId">Warehouse ID</label>
                <input id="warehouseId" type="number" min={0} value={warehouseId} onChange={(e) => setWarehouseId(e.target.value)} required />
            </div>
            <button type="submit" disabled={loading} className="w-full">
                {loading ? "Creating…" : "Create"}
            </button>
        </form>
    );
};

export default CreateProductForm;