import lombok.Builder;
import model.*;
import services.Service;

/**
 * Класс Main
 */
public class Main {
	public static void main(String[] args) {
		Service service = new Service();
		Good good = new Good (1, "20", "soap");
		BuyerInfo buyerInfo = new BuyerInfo(1,"A");
		service.buy(good,buyerInfo);
	}
}