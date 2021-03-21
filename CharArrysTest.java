class nullArgmentException extends RuntimeException{
	nullArgmentException(){
		super();
	}
	nullArgmentException(String str){
		super(str);
	}
}
class CharTool{
	private CharTool(){};
	public static int Search(char[] arr,char c)	//throws nullArgmentException
	{
		if(arr==null)
			throw new nullArgmentException("数组对象没有实体");
		for(int i=0;i<arr.length;i++){
			if(arr[i]==c){
				return i;
			}
		}
		return -1;
	}
}
class CharArrysTest{
	public static void main(String[] args) {
		char[] arr={'h','e','l','l','o','w','o','r','l','d','!'};
		arr=null;		
		int val=CharTool.Search(arr,'w');
		System.out.println("找到的下标:"+val);
	}
}