# Java
## src
### algorithm ------ 数据结构与算法（引用 + 递归）
- BinarySearch.java ------ 数组案例: 二分查找（采用方法递归完成）
- BubbleSort.java ------ 数组案例: 冒泡排序
- ArrayReverse.java ------ 数组案例: 数组转置
- TwoDimensionalReverse.java ------ 数组案例: 二维数组转置 （前提:行列相等）
- PrintMulFormula.java ------ 打印乘法口诀表
- PrintTriangle.java ------ 打印三角
- IsComposedOfNnumbers.java ------ 判断一个字符串是否由数字所组成
- ToFirstCharUpper.java ------ 实现字符串首字母大写
- LinkTable.java ------ 链表（最简单的单向链表）/动态数组
- BTDemo.java ------ 二叉树
### designPattern ------ 设计模式
- TemplatePattern.java ------ 抽象类的实际应用 ------ 模板设计模式
- FactoryPattern.java ------ 接口的设计模式 ------ 工厂设计模式
- ProxyPattern.java ------ 接口的设计模式 ------ 代理设计模式 
- AnonymousInnerClass.java ------ 匿名内部类
- HungerSingleton.java ------ 恶汉式 ------ 单例设计模式
- LazySingleton.java ------ 懒汉式 ------ 单例设计模式
- Multiple.java ------ 多例设计模式
- InterfaceExtension.java ------ 接口定义加强 ------ 挽救设计
- ObserverPattern.java ------ 观察者设计模式
### enumClass ------ 枚举（多例设计模式）
- EnumDemo.java ------ 枚举（多例设计模式与枚举、Enum类、枚举中定义其他结构、枚举应用）
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
- DateDemo.java ------ 日期处理类（Date类）
- SimpleDateFormatDemo.java ------ 日期格式化
- MathDemo.java ------ 数字操作类（用Math实现四舍五入）
- RandomDemo.java ------ 随机数
- BigNumber.java ------ 大数字操作类（用BigDecimal实现四舍五入）
- ArraysDemo.java ------ Arrays类
- ComparableDemo.java ------ 比较器
- ComparatorDemo.java ------ 挽救的比较器
- LocaleDemo.java ------ 国际化: Locale类
- ResouseBundleDemo.java ------ 国际化程序的实现
- TimerDemo.java ------ 定时器
- UUIDDemo.java ------ UUID类: 根据当前的地址还有时间戳自动生成一个几乎不会重复的字符串
- Base64Demo.java ------ Base64加密处理
- ThreadLocalDemo.java ------ ThreadLocal类（减少一些重要的引用传递）
### multiThread ------ 多线程
- ThreadDemo.java ------ 继承Thread类实现多线程
- RunnableDemo.java ------ 使用Runnable接口实现多线程
- CallableDemo.java ------ 使用Callable接口实现多线程
- ProviderAndConsumer.java ------ 线程同步与数据重复操作
- ThreadPool.java ------ 创建各种线程池
### regex ------ 正则表达式
- RegexDemo.java ------ String类中正则表达式的使用
- RegexPkgDemo.java ------ Pattern类、Matcher类的使用
### io ------ IO操作
- FileDemo.java ------ File类的基本操作
- FileDirDemo.java ------ 创建目录
- GetFileInfo.java ------ 取得文件信息
- FileIntegratedOperation.java ------ File类综合操作: 列出子目录内容
- FileOutputStreamDemo.java ------ 实现文件内容输出
- TestAutoDemo.java ------ AutoCloseable自动关闭支持(不建议使用，容易造成代码混乱)
- FileInputStreamDemo.java ------ 实现文件信息的读取
- FileWriterDemo.java ------ 字符输出流: Writer
- FileReaderDemo.java ------ 字符输入流: Reader
- TransformStream.java ------ 转换流: OutputStreamWriter / InputStreamReader
- FileCopy.java ------ 文件拷贝
- ByteArrayStream.java ------ 内存操作流
- FileMerge.java ------ 文件合并处理
- MyPrintStream.java ------ 打印流设计思想
- PrintWriterDemo.java ------ 使用系统打印流: 装饰器设计模式
- FormatPrintWriterDemo.java ------ 打印流: 格式文本化信息
- SystemIO.java ------ System类对IO的支持
### properties ------ 属性文件
- Message.properties ------ 自定义的默认属性文件
- Message_zh_CN.properties ------ 中文版属性文件
- Message_en_US.properties ------ 英文版属性文件
```
src/
├── algorithm/ 
│   ├── BinarySearch.java
│   ├── BubbleSort.java
│   ├── ArrayReverse.java
│   ├── TwoDimensionalReverse.java
│   ├── PrintMulFormula.java
│   ├── PrintTriangle.java
│   ├── IsComposedOfNnumbers.java
│   ├── ToFirstCharUpper.java
│   ├── LinkTable.java
│   └── BTDemo.java
├── designPattern/
│   ├── TemplatePattern.java
│   ├── FactoryPattern.java
│   ├── ProxyPattern.java
│   ├── AnonymousInnerClass.java
│   ├── HungerSingleton.java
│   ├── LazySingleton.java
│   ├── Multiple.java
│   ├── InterfaceExtension.java
│   └── ObserverPattern.java
├── enumClass/
│   └── EnumDemo.java
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
│   ├── DateDemo.java
│   ├── SimpleDateFormatDemo.java
│   ├── MathDemo.java
│   ├── RandomDemo.java
│   ├── BigNumber.java
│   ├── ArraysDemo.java
│   ├── ComparableDemo.java
│   ├── ComparatorDemo.java
│   ├── LocaleDemo.java
│   ├── ResouseBundleDemo.java
│   ├── TimerDemo.java
│   ├── UUIDDemo.java
│   ├── Base64Demo.java
│   └── ThreadLocalDemo.java
├── multiThread/
│   ├── ThreadDemo.java
│   ├── RunnableDemo.java
│   ├── CallableDemo.java
│   ├── ProviderAndConsumer.java
│   └── ThreadPool.java
├── regex/
│   ├── RegexDemo.java
│   └── RegexPkgDemo.java
├── io/
│   ├── FileDemo.java
│   ├── FileDirDemo.java
│   ├── GetFileInfo.java
│   ├── FileIntegratedOperation.java
│   ├── FileOutputStreamDemo.java
│   ├── TestAutoDemo.java
│   ├── FileInputStreamDemo.java
│   ├── FileWriterDemo.java
│   ├── FileReaderDemo.java
│   ├── TransformStream.java
│   ├── FileCopy.java
│   ├── ByteArrayStream.java
│   ├── FileMerge.java
│   ├── MyPrintStream.java
│   ├── PrintWriterDemo.java
│   ├── FormatPrintWriterDemo.java
│   └── SystemIO.java
└── properties/
    ├── Message.properties
    ├── Message_zh_CN.properties
    └── Message_en_US.properties
```
## 面试题:
- 请说明Java中的数据类型有哪些？
```
- 基本数据类型:

              ├── 数值型: 表示整数或小数
              │   ├── 整形: byte、 short、 int、 long   ->  默认值: 0
              │   └── 浮点型: float、 double            ->  默认值: 0.0
              ├── 字符型: char                          ->  默认值: '\u0000'
              └── 布尔型: boolean                       ->  默认值: false
              
- 引用数据类型: 数组、 类、 接口                          ->  默认值: null
```
- 请解释 & 和 &&、| 和 || 的区别？
```
- 逻辑运算: 

          ├── 与操作:
          │   ├── &&: 表示逻辑与运算，若干个判断条件如果前面有条件返回了false，那么后续的条件将不再判断，最终结果为false
          │   └── &: 表示所有的判断条件都要执行
          └── 或操作:
              ├── ||: 表示逻辑或运算，若干个判断条件如果前面有条件返回了true，那么后续的条件将不再判断，最终结果为true
              └── |: 表示所有的判断条件都要执行
                 
- 位运算:

          ├── &: 运算的两个数据位如果有一位是0结果就是0，全为1时结果才是1
          └── |: 运算的两个数据位如果有一位是1结果就是1，全为0时结果才是0
```
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
- 请解释线程的状态转换？
```
线程创建                 ┌──────────────── 阻塞状态 ────────────────┐                 线程终止
   │                    │                                          │                    │
   │                    │                                          │                    │
start()              阻塞解除                                  导致阻塞的事件             │
   │                    │                                          │                    │
   │                    │                                          │                    │
   └──────────────── 就绪状态 ────────────── 调度 ────────────── 运行状态 ────────────────┘
```
- 请解释 sleep() 和 wait() 的区别？
```
- sleep() 是 Thread 类中定义的方法，到了一定的时间后该休眠的线程可以自动唤醒；
- wait() 是 Object 类中定义的方法，如果想要唤醒，必须使用 notify() 或 notifyAll() 方法才可以唤醒。
```
- 请解释两种比较器的区别？
```
- java.lang.Comparable 是在一个类定义的时候默认实现好的接口，里面存在有 compareTo() 方法；
- java.lang.Comparator 是挽救的比较接口，需要单独定义一个比较规则类，定义有 compare() 和 equals() 方法。
```
