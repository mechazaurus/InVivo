import com.ybene.invivo.model.items.Inventory;
import com.ybene.invivo.model.items.InventoryManagementException;
import com.ybene.invivo.model.items.Item;
import com.ybene.invivo.model.items.Slot;

public class Main {

	public static void main(String[] args) {
		
		Inventory inventory = new Inventory();
		Slot slot = new Slot(inventory, 1);
		Item item1 = new Item("item1");
		Item item2 = new Item("item2");
		
		try {
			slot.addItemToSlot(item1);			
		} catch (InventoryManagementException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Objet : " + slot.getSlotItem().getItemName());
		slot.removeItemFromSlot();
		
		try {
			slot.addItemToSlot(item2);			
		} catch (InventoryManagementException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Objet : " + slot.getSlotItem().getItemName());
	}

}
