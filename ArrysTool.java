/**
创建了一个操作数组的工具类，包括：排序，最值等。
 @author craze
 @version 1.0
 */
public class ArrysTool{
	/**
	 * [ArrysTool description]
	 * @return [description]
	 */
	 private ArrysTool(){}//工具类不需要创建对象所以私有化
	/**
	 * 获取数组最大值
	 * @param  arr 给参数赋一个数组
	 * @return     返回数组最大值的下标
	 */	

	public static int GetIndex(int[] arr){
		int maxIndex=0;
		for(int i=1;i<arr.length;i++){
			if(arr[maxIndex]<arr[i]){
				maxIndex=i;
			}
		}
		return maxIndex;
	}
	/**
	 * [SelectSort1 description]
	 * @param arr [description]
	 */
	public static void SelectSort1(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[x]>arr[y]){
					swap(arr,x,y);
				}
			}
		}
	}
	/**
	 * [swap description]
	 * @param arr [description]
	 * @param x   [description]
	 * @param y   [description]
	 */
	public  static void swap(int[] arr,int x,int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	/**
	 * [PrintArrys description]
	 * @param arr [description]
	 */
	public static void PrintArrys(int[] arr){
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}
			else{
				System.out.print(arr[i]);
			}			
		}
		System.out.println("]");
	}
	/**
	 * [BooleanSort description]
	 * @param arr [description]
	 */
	public static  void BooleanSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=0;y<arr.length-1-x;y++){
				if(arr[y]>arr[y+1]){
					swap(arr,y,y+1);
				}
			}
		}
	}
	/**
	 * [SelectSort2 description]
	 * @param arr [description]
	 */
	public static void SelectSort2(int[] arr){//发现arr[x]没有保存在num中会导致排序失败！暂时没解决！
		for(int x=0;x<arr.length-1;x++){
			int index=x;
			int num=arr[x];
			for(int y=x+1;y<arr.length;y++){
				if(num>arr[y]){
					index=y;
					num=arr[y];
				}				
			}
			swap(arr,x,index);
		}
	}
	/**
	 * [Search description]
	 * @param  arr [description]
	 * @param  key [description]
	 * @return     一个整数
	 */
	public static int Search(int[] arr,int key){
		for(int x=0;x<arr.length;x++){
			if(key==arr[x]){
				return x;
			}		
		}
		return -1;
	}
}