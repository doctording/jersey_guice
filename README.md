Guice和Jersey基础学习;idea+java8+gradle

# Guice

https://github.com/google/guice

* @Inject

* bind

* @Named

* @Provides

# Jersey
 
https://jersey.github.io/


# aop & ioc的理解

https://github.com/doctording/spring_aop_demo

https://github.com/doctording/spring_ioc_demo

如下的语句体会：

* 高内聚低耦合

* IoC（Inversion of Control，控制反转）

```java
某个对象的生命周期控制由`引用它的对象`控制（引用对象自己new,自己destroy）

=》

某个对象的生命周期控制交给`第三方`(如Spring容器）(Spring在合适的时候new,destory)
```

* DI(Dependency Injection，依赖注入)

第三方动态的给某个对象提供它所需要提供的其它对象， 这是通过依赖注入完成的。

Java反射： Java反射就是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意方法和属性；并且能改变它的属性。而这也是Java被视为动态（或准动态，为啥要说是准动态，因为一般而言的动态语言定义是程序运行时，允许改变程序结构或变量类型，这种语言称为动态语言。从这个观点看，Perl，Python，Ruby是动态语言，C++，Java，C#不是动态语言。）语言的一个关键性质。

静态代理

动态代理