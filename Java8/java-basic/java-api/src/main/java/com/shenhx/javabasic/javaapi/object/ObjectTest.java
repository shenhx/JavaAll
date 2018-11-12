package com.shenhx.javabasic.javaapi.object;

import java.net.InterfaceAddress;
import java.util.Arrays;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demo1();
		// demo2();
//		demo3();
		demo4();
	}

	/**
	 * 
	 */
	static void demo1() {

		class Base {
			int count = 2;

		}

		class Mid extends Base {
			int count = 20;
		}

		class Sub extends Mid {
			int count = 200;

			public void print() {
				Sub s = this;
				Mid s2m = s;
				Base s2b = s;
				System.out.println(s.count);// 200
				System.out.println(s2m.count);// 20
				System.out.println(s2b.count);// 2
			}
		}

		Sub sub = new Sub();
		sub.print();

	}

	static void demo2() {
		class Fruit {
			String color = "undefined";

			public Fruit getThis() {
				this.info();
				return this;
			}

			public void info() {
				System.out.println("Fruit方法");
			}
		}

		class Apple extends Fruit {

			@Override
			public void info() {
				System.out.println("Apple方法");
			}

			public void AccessSuperInfo() {
				super.info();
			}

			public Fruit getSuper() {
				return super.getThis();//
			}

			String color = "红色";

			public void print() {
				Apple a = this;
				Fruit f = a.getSuper();
				System.out.println(a == f);
				System.out.println(a.color);
				System.out.println(f.color);
				a.info();
				f.info();
				a.AccessSuperInfo();
				System.out.println("-----------");
				Fruit f2 = f.getThis();
				f2.info();
			}
		}

		Apple apple = new Apple();
		apple.print();

	}

	static void demo3() {
		class Fruit {
			String color = "undefined";

			public final Fruit getThis() {
				return this;
			}

			public void info() {
				System.out.println("Fruit方法");
			}
		}

		class Apple extends Fruit {

			@Override
			public void info() {
				System.out.println("Apple方法");
			}

			public void AccessSuperInfo() {
				super.info();
			}

			public Fruit getSuper() {
				return super.getThis();//
			}

			String color = "红色";

			public void print() {
				Apple a = this;
				Fruit f = a.getSuper();
				System.out.println(a == f);
				System.out.println(a.color);
				System.out.println(f.color);
				a.info();
				f.info();
				a.AccessSuperInfo();
				System.out.println("-----------");
				Fruit f2 = f.getThis();
				f2.info();
			}

		}

		Apple apple = new Apple();
		apple.print();

	}

	/**
	 * final
	 */
	static void demo4() {

		class CommandTest {
			int[] process(IntArrayProductor cmd, int length) {
				int[] result = new int[length];
				for (int i = 0; i < length; i++) {
					result[i] = cmd.product();
				}
				return result;
			}

			void print() {
				CommandTest cTest = new CommandTest();
				final int seed = 5;// 提供给内部类访问的变量需要声明为final
				int[] result = cTest.process(new IntArrayProductor(){ 
					
					@Override
					public int product() {
						// TODO Auto-generated method stub
						return (int)Math.round(Math.random()*seed);
					}
				}, 6);
				System.out.println(Arrays.toString(result));
			}
		}
		CommandTest commandTest = new CommandTest();
		commandTest.print();

	}
}

interface IntArrayProductor {
	int product();
}