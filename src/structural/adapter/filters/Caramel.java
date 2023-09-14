package structural.adapter.filters;

import structural.adapter.Image;


    /*
   در این کلاس به عنوان کلاسی هست که از بیرون ما به پروژه ادد خواهیم کرد
   نمی تونیم از این فیلتر در کلاس ImageView  استفاده کرد چرا که
   ی ImageView برای apply کردن فیلتر خود نیاز به کلاسی هست که اینتر فیس filter رو
   پیاده سازی کرده باشه اما فیلتر های سوم شخص ما این کلاس را پیاده سازی نکرده اند و به نحوی دیگر کار میکنند
   پس یا باید قید کل فیلتر های خود را بزنیم و روشی برای کلاس جدید بیابیم
   یا اینکه کل فیلتر هایی که به عنوان سوم شخص اضافه کردیم را تغییر دهیم
   پس به وسیله adapter pattern اینترفیس فیلتر را تبدیل میکنیم

    We will add this filters to the project from outside
    We cannot use this filter in the ImageView class because
    In order to apply the filter in ImageView, you need a class that has the filter interface
    but our third-party filters have not implemented this interface and work differently
    So either we have to restrict all our filters and find a method for the new class
    Or to change all the filters that we added as a third-party
    So, we use the adapter pattern to convert the interface
     */
//public class Caramel {
//    public void init(){
//
//    }
//
//    public void render(Image image){
//        System.out.println("apply caramel filter");
//    }
//}

public class Caramel {
    public void init(){

    }

    public void render(Image image){
        System.out.println("apply caramel filter");
    }
}
