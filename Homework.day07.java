package day07;
//作业讲解
public class Homework {
	
	public static void main(String[] args) {
		/*
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("最小值为:"+min);
		
		int[] arr1 = new int[arr.length+1];
		System.arraycopy(arr,0,arr1,1,arr.length);
		arr1[0] = min;
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		*/
		
		int[] arr = generateArray(8,20);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}

	public static int[] generateArray(int len,int max){
		int[] arr = new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*max);
		}
		return arr;
	}
	
}


















