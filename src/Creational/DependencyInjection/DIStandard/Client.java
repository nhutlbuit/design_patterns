package Creational.DependencyInjection.DIStandard;

public class Client {
    public static void main(String[] args) {
        // Còn hạn chế phải khởi tại SmsService hoặc EmailService.
        MessageService messageService = new SmsService();
        UserController userController = new UserController(messageService);
        userController.send();
    }
}

/**
 * Dependency Inversion Principle (DIP): là một nguyên lý để thiết kế và viết code.
 * Inversion of Control (IoC) là pattern tuân theo Dependency inversion principle.
 * Dependency Injection (DI): là một Design Pattern, một cách để hiện thực Inversion of Control Pattern.
 * DI chính là khả năng liên kết giữa các thành phần lại với nhau, các module phụ thuộc (dependency) sẽ được inject vào module cấp cao.
 *
 * Ưu điểm:
 * Reduced dependencies: giảm sự kết dính giữa các module.
 * Reusable: code dễ bảo trì, dễ tái sử dụng, thay thế module. Giảm boiler-plate code do việc tạo các biến phụ thuộc đã được injector thực hiện.
 * Testable: rất dễ test và viết Unit Test.
 * Readable: dễ dàng thấy quan hệ giữa các module vì các dependency đều được inject vào constructor.
 *
 * Khuyết điểm:
 * Khái niệm DI khá khó hiểu đối với người mới tìm hiểu.
 * Sử dụng interface nên đôi khi sẽ khó debug, do không biết chính xác module nào được gọi.
 * Các object được khởi tạo toàn bộ ngay từ đầu, có thể làm giảm performance.
 * Có thể gặp lỗi ở run-time thay vì compile-time.
 *
 * Dependency Injection Container hay còn gọi là Inversion of Control Container (IoC container).
 */
