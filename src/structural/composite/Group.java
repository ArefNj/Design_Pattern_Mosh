package structural.composite;

import java.util.ArrayList;
import java.util.List;

/*   میتونیم از تایپ object استفاده کنیم
       و اون موقع به تایپ مورد نظر کست کنیم
       ولی از انجایی که کست ابجکت هزینه بر است
       و اینکه اگر متد جدیدی به کلاس shape اضافه بشه
       باید برای اون هم یه فورایچ با یه ایف اند الز طولانی نوشت
       که بهینه نیست
       پس از دیزاین پترن composite استفاده میکنیم
       البته من اینجا از جنریک استفاده کردم
 */

//}
//public class Group <E> {
//    private List<E> objects = new ArrayList<>();
//
//    public void addObject(E object) {
//        objects.add(object);
//    }
//
//    public void render() {
//        for (var object : objects)
//            if (object instanceof Shape){
//                ((Shape) object).render();
//            } else {
//                ((Group) object).render();
//            }
//    }
//}
public class Group implements Component {
    private final List<Component> objects = new ArrayList<>();

    public void addObject(Component object) {
        objects.add(object);
    }

    @Override
    public void render() {
        for (var component : objects) {
            component.render();
        }
    }

    @Override
    public void move() {
        for (var component : objects) {
            component.move();
        }
    }
}


