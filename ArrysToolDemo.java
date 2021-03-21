class ArrysToolDemo{
	public static void main(String[] args) {		
		int[] arr={1,2,5,8,0,-1,23,-2};
		int maxIndex=ArrysTool.GetIndex(arr);
		System.out.println(arr[maxIndex]);
		ArrysTool.PrintArrys(arr);
		//tool.SelectSort1(arr);
		// tool.PrintArrys(arr);
		ArrysTool.SelectSort2(arr);
		ArrysTool.PrintArrys(arr);
		// tool.BooleanSort(arr);
		// tool.PrintArrys(arr);
		/* int x =tool.Search(arr,23);
		System.out.println(x); */
	}	
}
