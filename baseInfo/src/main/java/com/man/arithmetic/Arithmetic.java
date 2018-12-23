package com.man.arithmetic;

public class Arithmetic {
	
	public static void main(String[] args) {
		int[] numbers= {23,4,123,42,53,11,33,16,75,56};
		Arithmetic.bubbleSort(numbers);
		
	}
	
	
  /**
    * 冒泡排序是一种简单的排序算法。
    * 它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
    * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
    * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
  * 
    * 冒泡排序
    * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。  
    * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。  
    * 针对所有的元素重复以上的步骤，除了最后一个。
    * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。 
  * @param numbers 需要排序的整型数组
  */
	public static void bubbleSort(int [] numbers) {
		int temp=0;
		int size =numbers.length;		
		int cycleTimes=0;//循环次数		
		for(int i=0;i<size-1;i++) {			
			for(int j=0;j<size-1-i;j++) {
				
				if(numbers[j]>numbers[j+1]) {
					temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
				cycleTimes++;
			}
			System.out.println("第 " + (i+1) + " 次排序-"+Arithmetic.getNumbersStr(numbers));
		}		
		System.out.println("循环次数:"+cycleTimes);
	}
	
	
	public  static String  getNumbersStr(int[] numbers) {
		StringBuffer str=new StringBuffer("[");
		if(numbers!=null && numbers.length>0) {			
			for(int i:numbers) {
				str.append(i+",");
			}
			str.deleteCharAt(str.length()-1);
		}
		str.append("]");
		return str.toString();
	}

}
