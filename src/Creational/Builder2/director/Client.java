package Creational.Builder2.director;

import Creational.Builder2.concreteBuilder.FastFoodOrderBuilder;
import Creational.Builder2.product.order.Order;
import Creational.Builder2.product.type.BreadType;
import Creational.Builder2.product.type.OrderType;
import Creational.Builder2.product.type.SauceType;

public class Client {

    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order);
    }
}

/*
* ƯU ĐIỂM
* Hỗ trợ, loại bớt việc phải viết nhiều constructor.
Code dễ đọc, dễ bảo trì hơn khi số lượng thuộc tính (propery) bắt buộc để tạo một object từ 4 hoặc 5 propery.
Giảm bớt số lượng constructor, không cần truyền giá trị null cho các tham số không sử dụng.
Ít bị lỗi do việc gán sai tham số khi mà có nhiều tham số trong constructor: bởi vì người dùng đã biết được chính xác giá trị gì khi gọi phương thức tương ứng.
Đối tượng được xây dựng an toàn hơn: bởi vì nó đã được tạo hoàn chỉnh trước khi sử dụng.
Cung cấp cho bạn kiểm soát tốt hơn quá trình xây dựng: chúng ta có thể thêm xử lý kiểm tra ràng buộc trước khi đối tượng được trả về người dùng.
Có thể tạo đối tượng immutable.
* */

/**
 * NHƯỢC ĐIỂM
 * Builder Pattern có nhược điểm là duplicate code khá nhiều: do cần phải copy tất cả các thuộc tính từ class Product sang class Builder.

 * Tăng độ phức tạp của code (tổng thể) do số lượng class tăng lên.
 */
/*
* WHEN
* Tạo một đối tượng phức tạp: có nhiều thuộc tính (nhiều hơn 4) và một số bắt buộc (requried), một số không bắt buộc (optional).
Khi có quá nhiều hàm constructor, bạn nên nghĩ đến Builder.
Muốn tách rời quá trình xây dựng một đối tượng phức tạp từ các phần tạo nên đối tượng.
Muốn kiểm soát quá trình xây dựng.
Khi người dùng (client) mong đợi nhiều cách khác nhau cho đối tượng được xây dựng.
* */
