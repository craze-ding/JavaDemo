// class Car{
// 	int date;
// 	String color;
// 	void run(){
// 		System.out.println(date+"...."+color);
// 	}

// }

/*public class demo{
	int date=3;
	String color;
	public static void main(String[] args) {
		demo arr=new demo();
		arr.date=9;
		arr.color="redf";
		show(new demo());
		//arr.run();
		System.out.println(arr.date+"...."+arr.color);			
		}
	 public static void show(demo d){
		d.date=5;
		d.color="ling";		
	}	
}*/
// 2021.3.10
/* import java.util.Arrays;//导入数组算法包
import java.util.Scanner; */
class oneArrysDemo{
	public static void main(String[] args) {
		/*int[] arr =new int[]{-1,0,2,5,6,9,11,23};	
		
			printArray(arr);
			// selectSort(arr);
			 //bubbloSort(arr);
			 //Arrays.sort(arr);java提供的排序方法
			// selectSort2(arr);
			printArray(arr);
			Arrays.binarySearch(arr,50);java提供的二分查找方法
			System.out.println(Arrays.binarySearch(arr,50));
			 // System.out.println(Sreach(arr,23));
			System.out.println(HalfSearch(arr,30));*/
			/*Scanner sr=new Scanner(System.in);
			int val=sr.nextInt();
			GetWeat(val);*/
			// System.out.println("please input a val")；
			/*toHex(val);
			toOct(val);
			tobBin(val)*/;
			// System.out.println("-----------");
			// System.out.println(Integer.toBinaryString(val));
			//printArray(arr);
			
			//System.out.println("arr["+i+"]="+arr[i]);
			/*int[][] arr=new int[3][];
			System.out.println(arr);//[[I@123772c4
			System.out.println(arr[0]);//null
			System.out.println(arr[0][0]);*/  //NullPointerException

			/*int[][] arr=new int[3][2];//每个以为小数组都初始化两个元素

			System.out.println(arr);//[[I@123772c4
			System.out.println(arr[2]);//[I@2d363fb3
			System.out.println(arr[0][0]);	//0	*/

			int[][] arr={{1,2,3,4},{1,2,3,4,5},{1,2,3,4,5,6}};
			/*arr[0]=new int[3];
			arr[1]=new int[2];
			arr[2]=new int[4];*/
			/*arr[0]=new int[4]{1,2,3,4};//同时使用维表达式和初始化创建数组是非法的
			arr[1]={1,2,3};
			arr[2]={1,2,3,4,5,6};*/
			System.out.println(arr);	//[[I@123772c4
			System.out.println(arr[2]);	//[I@2d363fb3
			System.out.println(arr[0][0]); //0
			/*int sum=0; 	//对二维数组进行累加
			for(int x=0;x<arr.length;x++){
				for(int y=0;y<arr[x].length;y++){
					sum+=arr[x][y];
				}
			}
			System.out.println("sum="+sum);*/
			/*System.out.print("[");
			for(int x=0;x<arr.length;x++){	//对二维数组遍历
				for(int y=0;y<arr[x].length;y++){
					if(y!=arr[2].length-1){
						System.out.print(arr[x][y]+",");
					}
					else{
						System.out.print(arr[x][y]);
					}
					
				}
			}
			System.out.println("]");*/	
		}	
	//遍历数组
	public static void printArray(int[] arr){
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
	//选择排序
	public static void selectSort1(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int n=i+1;n<arr.length;n++){
				if(arr[i]>arr[n]){
					int temp=arr[i];
					arr[i]=arr[n];
					arr[n]=temp;
				}
			}		
		}				
	}
	//冒泡法排序
	public static void bubbloSort(int[] arr){
		for (int x=0;x<arr.length-1;x++){
			for(int y=0;y<arr.length-1-x;y++){
				if(arr[y]>arr[y+1]){
					swap(arr,y,y+1);
					/*int temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;*/
				}
			}
		}
	}
	//交换两个数
	public static void swap(int[] arr,int x,int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	//标识法排序
	public static void selectSort2(int[] arr){
		
		for(int x=0;x<arr.length;x++){
			int num=arr[x],index=x;
			for(int y=x;y<arr.length-1;y++){
			if(num>arr[y]){
				num=arr[y];
				index=y;
			}
		}
		/*int temp=arr[x];
		arr[x]=arr[index];
		arr[index]=temp;*/
		swap(arr,x,index);
		}
	}
	//普通查找
	public static int Search(int[] arr,int key){
		for(int x=0;x<arr.length;x++){
			if(key==arr[x]){
				return x;
			}			
		}
		return -1;	 	
	 }
	 //折半查找
	public static int HalfSearch(int[] arr,int key){
	 	int frist=0;
	 	int end=arr.length-1;
	 	int mid=(frist+end)>>1;
	 	while(frist<=end){
	 		if(key<arr[mid]){
	 		end=mid-1;
	 		}
	 	else if(key >arr[mid]){
	 		frist=mid+1;
	 		}
	 	else{
	 		return mid;
	 		}
	 		mid=(frist+end)>>1;
	 	}
	 	return frist;
	}
	/*查表法实现16进制转换*/
	public static void toHex(int key){
		scale(key,15,4);
	}
	/*查表法实现8进制转换*/
	public static void toOct(int key){
		scale(key,7,3);
	}
	/*查表法实现2进制转换*/
	public static void tobBin(int key){
		scale(key,1,1);
	}	

	public static void scale(int key,int base,int offset ){
		char[] arr1={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr2=new char [64];
		int pos=arr2.length;
		System.out.println("-----------");
		while(key!=0){
			int index=key & base;
			arr2[--pos]=arr1[index];
			key=key >>> offset;
		}
		for(;pos<arr2.length;pos++){
			System.out.print(arr2[pos]);
		}
		System.out.println();			
	}
	/*查找星期天*/
	public static void GetWeat(int val){
		if(val<1 || val>8){
			System.out.println("Error");
		}
		String[] arr={" ","Mon","Tue","Wed","Thur","Fri","Sat","Sun"};
		System.out.println(arr[val]);	
	}
	// pulic static void erArrys()
		
	
}



	


