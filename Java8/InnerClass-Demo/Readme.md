# 内部类
## 静态内部类

## 成员内部类
- 和匿名内部类的区别
~~~
成员内部类可以访问外部类所有的变量和方法，包括静态和实例，私有和非私有。和静态内部类不同的是，每一个成员内部类的实例都依赖一个外部类的实例。其它类使用内部类必须要先创建一个外部类的实例
~~~
## 局部内部类
> 定义在方法中的类，就是局部类
> 使用场景
- 如果一个类只在某个方法中使用，则可以考虑使用局部类。
## 匿名内部类