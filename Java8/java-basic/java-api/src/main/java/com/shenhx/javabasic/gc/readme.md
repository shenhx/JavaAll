# 垃圾回收
1. 学习提纲
~~~
• Java引用的功能和意义；

• Java引用与内存回收之间的关系；

• Java对象在内存中的不同状态；

•软引用的作用和使用软引用的注意点；

•弱引用的作用和使用弱引用的注意点；

•虚引用的作用和使用虚引用的注意点；

• Java内存泄漏的原因；

• Java内存泄漏和C++内存泄漏的差别；

• Java垃圾回收机制的基本算法；

•堆内存的分代回收；

• Young代、Old代和Permanent代的各自存储的对象；

• Young代、Old代和Permanent代的特定及适用的回收算法；

•常见垃圾回收机制对堆内存的回收细节；

•设计开发中内存管理的小技巧。

~~~
2. 常见概念
~~~
- 强引用：程序创建一个对象，并把这个对象赋给一个引用变量，这个引用变量就是强引用。
- 软引用：软引用需要通过SoftReference类来实现，当一个对象只具有软引用时，它有可能被垃圾回收机制回收。
- 弱引用：弱引用通过WeakReference类实现，弱引用和软引用很像，但弱引用的引用级别更低。
~~~
3. 内存泄漏
- 概念：程序运行过程中会不断地分配内存空间，那些不再使用的内存空间应该即时回收它们，从而保证系统可以再次使用这些内存，如果存在无用的内存没有被回收回来，那就是内存泄漏。

4. 垃圾回收
~~~
垃圾回收机制主要完成下面两件事情：

■ 跟踪并监控每个Java对象，当某个对象处于不可达状态时，回收该对象所占用的内存；

■ 清理内存分配、回收过程中产生的内存碎片。
~~~
5. 垃圾回收选项
~~~
下面两个选项用于设置Java虚拟机内存大小。

■ -Xmx：设置Java虚拟机堆内存的最大容量，如java -Xmx256m XxxClass。

■ -Xms：设置Java虚拟机堆内存的初始容量，如-Xms128m XxxClass。

下面选项都是关于Java垃圾回收的附加选项。

■ -XX:MinHeapFreeRatio = 40：设置Java堆内存最小的空闲百分比，默认值为40，如java -XX:MinHeapFreeRatio = 40 XxxClass。

■ -XX:MaxHeapFreeRatio = 70：设置Java堆内存最大的空闲百分比，默认值为70，如java -XX:MaxHeapFreeRatio = 70 XxxClass。

■ -XX:NewRatio = 2：设置Young/Old内存的比例，如java -XX:NewRatio = 1 XxxClass。

■ -XX:NewSize = size：设置 Young代内存的默认容量，如java -XX:NewSize = 64m XxxClass。

■ -XX:SurvivorRatio = 8:设置Young代中eden/survivor的比例，如java -XX:SurvivorRatio = 8 XxxClass。

■ -XX:MaxNewSize = size：设置Young代内存的最大容量，如java -XX:MaxNewSize = 128m XxxClass。

注 意

当设置Young代的内存超过了-Xmx设置的大小时，Young设置的内存大小将不会起作用，JVM会自动将Young代内存设置为与-Xmx设置的大小相等。

■ -XX:PermSize = size：设置 Permanent代内存的默认容量，如java -XX:PermSize = 128m XxxClass。

■ -XX:MaxPermSize = 64m：设置Permanent代内存的最大容量，如java-XX:MaxPermSize = 128m XxxClass。

此处只是介绍了垃圾回收相关的常用选项，关于Java垃圾回收的常用选项请参看Sun官方站点java.sun.com/javase/technologies/hotspot/vmoptions.jsp页面的介绍。
~~~