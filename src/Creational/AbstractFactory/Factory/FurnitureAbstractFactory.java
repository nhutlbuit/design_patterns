package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Services.IBookShelf;
import Creational.AbstractFactory.Services.IChair;
import Creational.AbstractFactory.Services.ITable;
import Creational.AbstractFactory.Services.IWardrobe;

public abstract class FurnitureAbstractFactory {

    public abstract IChair createChair();

    public abstract ITable createTable();

    public abstract IBookShelf createBookShelf();

    public abstract IWardrobe createWardrobe();

}

/**
 * Ví dụ: Một công ty đồ nội thất chuyên sản xuất ghế (Chair):
 * + ghế nhựa (PlasticChair)
 * + và ghế gỗ (WoodChair).
 * Với tình hình kinh doanh ngày càng thuận thợi nên công ty quyết định mở rộng thêm sản xuất bàn (Table).
 * Với lợi thế là đã có kinh nghiệm từ sản xuất ghế nên công ty vẫn giữ chất liệu là nhựa (PlasticTable) và gỗ (WoodTable) cho sản xuất bàn.
 * Tuy nhiên, quy trình sản xuất ghế/ bàn theo từng chất liệu (MaterialType) là khác nhau
 * Khi khách hàng cần mua một món đồ nào, khách hàng (Client) chỉ cần đến cửa hàng để mua.
 * Khi đó ứng với từng hàng hóa và vật liệu sẽ được chuyển về phân xưởng tương ứng để sản xuất (createXXX) ra bàn (Table) và ghế (Chair).
 */
