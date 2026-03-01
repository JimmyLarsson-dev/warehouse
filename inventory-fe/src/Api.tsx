//
// export const API_URL = "http://localhost:8080/inventory"
//
// type Inventory = {
//     productName: string,
//     quantity: number,
//     warehouseId: number,
// }
//
//
// const api = {
//     getInventory: async () => {
//         const response = await fetch(`${API_URL}/getAll`, {
//             method: "GET",
//             headers: {
//                 "Content-Type": "application/json"
//             }
//         })
//         if (response.ok) {
//             return response.json()
//         } else {
//             throw new Error("Failed to fetch inventory")
//         }
//     },
//     createInventory: async (input: Inventory) => {
//         const response = await fetch(`${API_URL}/create`, {
//             method: "POST",
//             headers: {
//                 "Content-Type": "application/json"
//             },
//             body: JSON.stringify(input)
//         })
//         if (response.ok) {
//             return response.json()
//         } else {
//             throw new Error("Failed to create inventory")
//         }
//     }
// }