import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import order.Order;
import order.OrderClient;
import order.OrderResponse;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrderTest {

    private Order orderWithBlackColor = Order.CreateOrderWithBlackColor();
    private Order orderWithGreyColor = Order.CreateOrderWithGreyColor();
    private Order orderWithBothColors = Order.CreateOrderWithBothColors();
    private Order orderWithoutColors = Order.CreateOrderWithoutColor();
    private OrderClient orderClient = new OrderClient();

    @Test
    @DisplayName("Create Order with black color")
    @Description("Base test of \"/order\" endpoint. Checking code status and response's body")
    public void createOrderWithBlackColor() {
        int track = orderClient.createOrder(orderWithBlackColor);
        assertNotNull(track);
    }

    @Test
    @DisplayName("Create Order with grey color")
    @Description("Base test of \"/order\" endpoint. Checking code status and response's body")
    public void createOrderWithGreyColor() {
        int track = orderClient.createOrder(orderWithGreyColor);
        assertNotNull(track);
    }

    @Test
    @DisplayName("Create Order with black and grey color")
    @Description("Base test of \"/order\" endpoint. Checking code status and response's body")
    public void createOrderWithBothColors() {
        int track = orderClient.createOrder(orderWithBothColors);
        assertNotNull(track);
    }

    @Test
    @DisplayName("Create Order with null color")
    @Description("Base test of \"/order\" endpoint. Checking code status and response's body")
    public void createOrderWithoutColors() {
        int track = orderClient.createOrder(orderWithoutColors);
        assertNotNull(track);
    }

    @Test
    @DisplayName("Get order's list")
    @Description("Base test of \"/order\" endpoint. Checking code status and response's body")
    public void getOrderBody(){
        OrderResponse orderResponse = orderClient.getOrder();
        assertNotNull(orderResponse);
        System.out.println(orderResponse);
    }
}