package model;

import java.util.Arrays;

/**
 * Класс Methods
 */
public class Methods {


	static final int SIZE = 10000000;
	static final int HALF = SIZE / 2;

	private float[] arr1 = new float[HALF];
	private float[] arr2 = new float[HALF];


	Thread first = new Thread(() -> {
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
				Math.cos(0.4f + i / 2));
		}
	});
	Thread second = new Thread(() -> {
		for (int i = 0, j=HALF;  i < arr2.length; i++,j++) {
			arr2[i] = (float) (arr2[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) *
				Math.cos(0.4f + j / 2));
		}
	});


	public void firstMt() {
		float[] arr = new float[SIZE];
		Arrays.fill(arr, 1.0F);

		long a = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
				Math.cos(0.4f + i / 2));
		}
		System.currentTimeMillis();
		System.out.println(System.currentTimeMillis() - a);
		System.out.println("Отработал Метод 1");

	}

	public void secondMt() {

		float[] arr = new float[SIZE];
		Arrays.fill(arr, 1.0F);

		long a = System.currentTimeMillis();

		System.arraycopy(arr, 0, arr1, 0, HALF);
		System.arraycopy(arr, HALF, arr2, 0, HALF);

		first.start();
		second.start();

		try{first.join();
			second.join();}
		catch (InterruptedException e){
			e.printStackTrace();
		}


		System.arraycopy(arr1, 0, arr, 0, HALF);
		System.arraycopy(arr2, 0, arr, HALF, HALF);

		System.currentTimeMillis();
		System.out.println(System.currentTimeMillis() - a);
		System.out.println("Отработал Метод 2");


	}
}