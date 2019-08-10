package com.thread;

import java.util.HashMap;
import java.util.concurrent.Semaphore;

/**
 * @Auther: 王正强
 * @Date: 2019/8/10 18:53
 * @Description:
 */
public class LeetThread1114 {

    /**
     * https://leetcode-cn.com/problems/print-in-order/
     * 我们提供了一个类：
     *
     * public class Foo {
     *   public void one() { print("one"); }
     *   public void two() { print("two"); }
     *   public void three() { print("three"); }
     * }
     * 三个不同的线程将会共用一个 Foo 实例。
     *
     * 线程 A 将会调用 one() 方法
     * 线程 B 将会调用 two() 方法
     * 线程 C 将会调用 three() 方法
     * 请设计修改程序，以确保 two() 方法在 one() 方法之后被执行，three() 方法在 two() 方法之后被执行。
     * 示例 1:
     *
     * 输入: [1,2,3]
     * 输出: "onetwothree"
     * 解释:
     * 有三个线程会被异步启动。
     * 输入 [1,2,3] 表示线程 A 将会调用 one() 方法，线程 B 将会调用 two() 方法，线程 C 将会调用 three() 方法。
     * 正确的输出是 "onetwothree"。
     * 示例 2:
     *
     * 输入: [1,3,2]
     * 输出: "onetwothree"
     * 解释:
     * 输入 [1,3,2] 表示线程 A 将会调用 one() 方法，线程 B 将会调用 three() 方法，线程 C 将会调用 two() 方法。
     * 正确的输出是 "onetwothree"。
     *
     * 解题思路，hash表法
     *
     */
    class Foo {
        public Semaphore first_to_second = new Semaphore(0);
        public Semaphore second_to_third= new Semaphore(0);
        public Foo() {

        }

        public void printFirst(Runnable printFirst) throws InterruptedException {
            printFirst.run();
            first_to_second.release();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            first_to_second.acquire();
            printSecond.run();
            second_to_third.release();
        }

        public void third(Runnable printThird) throws InterruptedException {

            second_to_third.acquire();
            printThird.run();
        }
    }


}
