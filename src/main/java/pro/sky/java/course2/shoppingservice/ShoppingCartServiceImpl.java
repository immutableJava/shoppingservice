package pro.sky.java.course2.shoppingservice;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class ShoppingCartServiceImpl implements ShoppingCartService {
    List<Integer> idList = new ArrayList<>();

    @Override
    public void addGoods(List<Integer> ids) {
        idList.addAll(ids);
    }

    @Override
    public List<Integer> getGoods() {
        return Collections.unmodifiableList(idList);
    }
}
