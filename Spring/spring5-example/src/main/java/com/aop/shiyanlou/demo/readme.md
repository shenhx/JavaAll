# aop说明
1. 常见概念
~~~
Advices ：表示一个 method 执行前或执行后的动作。
Pointcut ：表示根据 method 的名字或者正则表达式去拦截一个 method 。
Advisor ： Advice 和 Pointcut 组成的独立的单元，并且能够传给 proxy factory 对象。
~~~

2. AspectJ
