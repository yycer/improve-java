package com.frankie.demo.innerclass;

/**
 * @author: Yao Frankie
 * @date: 2020/7/29 09:33
 */
public class Out {

    private volatile Inner inner = null;
    private static int num = 2;

    public Inner getInnerInstance(){
        
        if (inner == null){
            synchronized (this){
                if (inner == null){
                    // 1. 分配内存空间
                    // 2. 调用Inner构造函数创建inner对象
                    // 3. 将inner对象指向分配的空间
                    inner = new Inner();
                }
            }
        }
        return inner;
    }


    class Inner{
        public void printNum(){
            System.out.println(num);
        }
    }
}
