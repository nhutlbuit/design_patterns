package Creational.AbstractFactory;

import Creational.AbstractFactory.Services.IBookShelf;
import Creational.AbstractFactory.Services.IChair;
import Creational.AbstractFactory.Services.ITable;
import Creational.AbstractFactory.Enum.MaterialType;
import Creational.AbstractFactory.Factory.FurnitureAbstractFactory;
import Creational.AbstractFactory.Factory.FurnitureFactory;
import Creational.AbstractFactory.Services.IWardrobe;

public class Client {
    public static void main(String[] args) {

        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.FLASTIC);
       // FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.WOOD);

        IChair chair = factory.createChair();
        chair.create(); // Create plastic chair

        ITable table = factory.createTable();
        table.create(); // Create plastic table

        IBookShelf bookShelf = factory.createBookShelf();
        bookShelf.create(); // Create plastic bookShelf

        IWardrobe wardrobe = factory.createWardrobe();
        wardrobe.create(); // Create plastic wardrobe
    }
}

/*
* Hướng dẫn Java Design Pattern – Abstract Factory

Trong bài trước chúng ta đã tìm hiểu về Factory Method Pattern.
* Trong bài này chúng ta tiếp tục tìm hiểu một Pattern khác trong nhóm Creational Design Pattern là Abstract Factory Design Pattern.

Nội dung [Ẩn]

1 Abstract Factory Pattern là gì?
2 Cài đặt Abstract Factory Pattern như thế nào?
3 Lợi ích của Abstract Factory Pattern là gì?
Abstract Factory Pattern là gì?
Abstract Factory is a creational design pattern that provide an interface for creating families of  related or dependent objects without specifying their concrete classes.

Abstract Factory pattern là một trong những Creational pattern. Nó là phương pháp tạo ra một Super-factory dùng để tạo ra các Factory khác.
* Hay còn được gọi là Factory của các Factory. Abstract Factory Pattern là một Pattern cấp cao hơn so với Factory Method Pattern.

Trong Abstract Factory pattern, một interface có nhiệm vụ tạo ra một Factory của các object có liên quan tới nhau mà không cần phải chỉ ra trực tiếp các class của object.
* Mỗi Factory được tạo ra có thể tạo ra các object bằng phương pháp giống như Factory pattern.

Hãy tưởng tượng, Abstract factory như là một nhà máy lớn chứa nhiều nhà máy nhỏ, trong các nhà máy đó có những xưởng sản xuất, các xưởng đó tạo ra những sản phẩm khác nhau.



Cài đặt Abstract Factory Pattern như thế nào?
Một Abstract Factory Pattern bao gồm các thành phần cơ bản sau:

AbstractFactory: Khai báo dạng interface hoặc abstract class chứa các phương thức để tạo ra các đối tượng abstract.
ConcreteFactory: Xây dựng, cài đặt các phương thức tạo các đối tượng cụ thể.
AbstractProduct: Khai báo dạng interface hoặc abstract class để định nghĩa đối tượng abstract.
Product: Cài đặt của các đối tượng cụ thể, cài đặt các phương thức được quy định tại AbstractProduct.
Client: là đối tượng sử dụng AbstractFactory và các AbstractProduct.
Ví dụ: Một công ty đồ nội thất chuyên sản xuất ghế (Chair): ghế nhựa (PlasticChair) và ghế gỗ (WoodChair).
*  Với tình hình kinh doanh ngày càng thuận thợi nên công ty quyết định mở rộng thêm sản xuất bàn (Table). V
* ới lợi thế là đã có kinh nghiệm từ sản xuất ghế nên công ty vẫn giữ chất liệu là nhựa (PlasticTable) và gỗ (WoodTable) cho sản xuất bàn.
* Tuy nhiên, quy trình sản xuất ghế/ bàn theo từng chất liệu (MaterialType) là khác nhau.
* Nên công ty tách ra là nhà máy (Factory): 1 cho sản xuất vật liệu bằng nhựa (PlasticFactory), 1 cho sản xuất vật liệu bằng gỗ (WoodFactory),
* nhưng cả 2 đều có thể sản xuất ghế và bàn (FunitureAbstractFactory).
* Khi khách hàng cần mua một món đồ nào, khách hàng (Client) chỉ cần đến cửa hàng để mua (FunitureFactory).
* Khi đó ứng với từng hàng hóa và vật liệu sẽ được chuyển về phân xưởng tương ứng để sản xuất (createXXX) ra bàn (Table) và ghế (Chair).
* */


/**
 *
 * Ví dụ: Một công ty đồ nội thất chuyên sản xuất ghế (Chair):
 * +ghế nhựa (PlasticChair)
 * + và ghế gỗ (WoodChair).
 * Với tình hình kinh doanh ngày càng thuận thợi nên công ty quyết định mở rộng thêm sản xuất bàn (Table).
 * Với lợi thế là đã có kinh nghiệm từ sản xuất ghế nên công ty vẫn giữ chất liệu là nhựa (PlasticTable) và gỗ (WoodTable) cho sản xuất bàn.
 * Tuy nhiên, quy trình sản xuất ghế/ bàn theo từng chất liệu (MaterialType) là khác nhau. Nên công ty tách ra là làm 2 nhà máy:
 * +  1 cho sản xuất vật liệu bằng nhựa (PlasticFactory),
 * + 1 cho sản xuất vật liệu bằng gỗ (WoodFactory).
 *  Nhưng cả 2 đều có thể sản xuất ghế và bàn. Khi khách hàng cần mua một món đồ nào, khách hàng (Client) chỉ cần đến cửa hàng để mua. Khi đó ứng với từng hàng hóa và vật liệu sẽ được chuyển về phân xưởng tương ứng để sản xuất (createXXX) ra bàn (Table) và ghế (Chair).
 */

