package pro.sky.java.course2.shoppingservice;

import java.util.List;


public interface ShoppingCartService {
    void addGoods(List<Integer> ids);

    List<Integer> getGoods();
}
