class twoArrysDemo {
	public static void main(String[] args) {
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
			/*System.out.println(arr);	//[[I@123772c4
			System.out.println(arr[2]);	//[I@2d363fb3
			System.out.println(arr[0][0]); //0*/
			int sum=0; 	//对二维数组进行累加
			for(int x=0;x<arr.length;x++){
				for(int y=0;y<arr[x].length;y++){
					sum+=arr[x][y];
				}
			}
			System.out.println("sum="+sum);
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
	
}