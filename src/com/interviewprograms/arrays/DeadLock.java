package com.interviewprograms.arrays;

public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object lock1 = new Object();
		Object lock2 = new Object();

		Thread th1 = new Thread(() -> {

			synchronized (lock1) {
				synchronized (lock2) {

					System.out.println("Inside the thread1");

				}

			}
		});
		
		
		Thread th2 = new Thread(() -> {

			synchronized (lock2) {
				synchronized (lock1) {

					System.out.println("Inside the thread2");

				}

			}
		});

		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
