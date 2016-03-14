package org.chufan.test;

import java.util.Random;

public class TestRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin Main");
		TestRunable c = new TestRunable();
		c.test("Miss A");
		System.out.println("End Main");
	}
	
	public void test(String name){
		RunFun r = new RunFun(name);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
	class RunFun implements Runnable{
		private Random r = new Random(System.currentTimeMillis());
		private int tNo;
		private String name = "";
		public RunFun(String name){
			this.name = name;
			this.tNo = 0;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(tNo < 100000){
				this.tNo++;
				System.out.println("Name:" + name +" TID:"+Thread.currentThread().getId() +" Count:" + tNo);
//				System.out.println("Name:" + name +" Count:" + tNo);
				try {
					Thread.sleep(r.nextInt(10)*100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
