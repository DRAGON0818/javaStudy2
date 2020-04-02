package com.dlx.chapter05;

public class EnumChapter05 {

    public static void main(String[] args) {
        Clothes bijini = Enum.valueOf(Clothes.class, "BIJINI");
        System.out.println(bijini.getDeclaringClass());
        System.out.println(bijini.toString());
    }

}


/**
 * 1.枚举类 都 扩展于Enum类，所有的实例都是在类的结构内声明，而且如果有成员域和成员方法，必须在他们前面。
 * 2.构造方法只能private或者无修饰符。（看法：因为不能够被外部引用创建枚举类的实例！）
 */
enum Clothes{

    BIJINI("bijini",10),QIPAO("qipao",20);

    private String type;
    private int cost;
    private Clothes(String type,int cost){this.type=type;this.cost=cost;}
    public String toString(){
        return new String("The Clothes'type are :" + this.type + " and costs :" + this.cost);
    }
}
