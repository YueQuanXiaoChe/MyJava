# Java
## src
### algorithm ------ 数据结构与算法（引用 + 递归）
- BinarySearch.java ------ 数组案例: 二分查找 (采用方法递归完成)
- BubbleSort.java ------ 数组案例: 冒泡排序
- ArrayReverse.java ------ 数组案例: 数组转置
- TwoDimensionalReverse.java ------ 数组案例: 二维数组转置 (前提:行列相等)
- PrintTriangle.java ------ 打印三角
- IsComposedOfNnumbers.java ------ 判断一个字符串是否由数字所组成
- ToFirstCharUpper.java ------ 实现字符串首字母大写
- LinkTable.java ------ 链表(最简单的单向链表)/动态数组
### designPattern ------ 设计模式
- TemplatePattern.java ------ 抽象类的实际应用 ------ 模板设计模式
- FactoryPattern.java ------ 接口的设计模式 ------ 工厂设计模式
- ProxyPattern.java ------ 接口的设计模式 ------ 代理设计模式 (感觉和装饰器模式是一回事)
- AnonymousInnerClass.java ------ 匿名内部类
- HungerSingleton.java ------ 恶汉式 ------ 单例设计模式
- LazySingleton.java ------ 懒汉式 ------ 单例设计模式
- Multiple.java ------ 多例设计模式
- InterfaceExtension.java ------ 接口定义加强 ------ 挽救设计
### functionInterface ------ 函数式接口
- LambdaDemo.java ------ Lambda表达式
- MethodReference.java ------ 方法引用
- BuildInFunctionalInterface.java ------ 内建函数式接口
### generic ------ 泛型
- GenericBasic.java ------ 泛型的基本使用
- GenericWildcard.java ------ 泛型: 通配符
- GenericInterface.java ------ 泛型接口
- GenericFun.java ------ 泛型方法
### javaClassLib ------ 常用Java类库
- StringBufferDemo.java ------ StringBuffer类
- RuntimeDemo.java ------ Runtime类
- SystemDemo.java ------ System类
- ObjectClone.java ------ 对象克隆
- DateDemo.java ------ 日期处理类(Date类)
### multiThread ------ 多线程
- ThreadDemo.java ------ 继承Thread类实现多线程
- RunnableDemo.java ------ 使用Runnable接口实现多线程
- CallableDemo.java ------ 使用Callable接口实现多线程
- ProviderAndConsumer.java ------ 线程同步与数据重复操作
- ThreadPool.java ------ 创建各种线程池

```
src/
├── algorithm/ 
│   ├── BinarySearch.java
│   ├── BubbleSort.java
│   ├── ArrayReverse.java
│   ├── TwoDimensionalReverse.java
│   ├── PrintTriangle.java
│   ├── IsComposedOfNnumbers.java
│   ├── ToFirstCharUpper.java
│   └── LinkTable.java
├── designPattern/
│   ├── TemplatePattern.java
│   ├── FactoryPattern.java
│   ├── ProxyPattern.java
│   ├── AnonymousInnerClass.java
│   ├── HungerSingleton.java
│   ├── LazySingleton.java
│   ├── Multiple.java
│   └── InterfaceExtension.java
├── functionInterface/
│   ├── LambdaDemo.java
│   ├── MethodReference.java
│   └── BuildInFunctionalInterface.java
├── generic/
│   ├── GenericBasic.java
│   ├── GenericWildcard.java
│   ├── GenericInterface.java
│   └── GenericFun.java
├── javaClassLib/
│   ├── StringBufferDemo.java
│   ├── RuntimeDemo.java
│   ├── SystemDemo.java
│   ├── ObjectClone.java
│   └── DateDemo.java
└── multiThread/
    ├── ThreadDemo.java
    ├── RunnableDemo.java
    ├── CallableDemo.java
    ├── ProviderAndConsumer.java
    └── ThreadPool.java
```
## 面试题:
- 请解释 final、finally、finalize 的区别？
```
- final 是一个关键字，用于定义不能被继承的父类、不能被覆写的方法、常量；
- finally 是异常处理的统一出口；
- finalize 是 Object 类中的一个方法，用于在对象回收前进行调用。
```
- 什么是 gc ？如何处理？
```
- gc (Garbage Collector): 垃圾收集器，用于释放无用的内存空间；
- gc 有两种处理形式，一种是自动不定期调用，另外一种是使用 Runtime 类中的 gc() 方法手工调用。
```
- 请解释 String、StringBuffer、StringBuilder 的区别？
```
- String 的内容不可修改，StringBuffer 和 StringBuilder 的内容可以修改；
- StringBuffer 采用同步处理，属于线程安全操作；而 StringBuilder 采用异步处理，属于线程不安全操作。
```
- 请解释 enum 和 Enum 的区别？
```
- enum 是一个关键字，使用 enum 定义的枚举类本质上就相当于一个类继承了 Enum 这个抽象类。
```
