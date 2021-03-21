//异常处理之声明方式有两种:1.继承Exception.2.RuningException
class FUShuIndexException extends RuntimeException{
	FUShuIndexException(){
		super();
	}
	FUShuIndexException(String str){
		super(str);
	}
}
class OutOfBoundsException extends RuntimeException{
	OutOfBoundsException(){
		super();
	}
	OutOfBoundsException(String str){
		super(str);
	}
}
/*class FUShuIndexException extends Exception{
	FUShuIndexException(){
		super();
	}
	FUShuIndexException(String str){
		super(str);
	}
}*/
class Demo{
	void methon(int[] arr,int index) throws FUShuIndexException,OutOfBoundsException
	{
		if(index >= arr.length){
			throw new OutOfBoundsException("角标越界"+index);
		}
		if(index <0){
			throw new FUShuIndexException("角标不能为负");
		}
		System.out.println(arr[index]);
	}
}
class ExceptionDemo{
	public static void main(String[] args) throws FUShuIndexException,OutOfBoundsException
	 {
	 	int[] arr=new int[3];
		Demo d=new Demo();
	 	try{
	 		d.methon(arr,0);	
	 	}	 	
	 	catch(OutOfBoundsException out){
	 		System.out.println("角标越界");
	 	}
	 	catch(FUShuIndexException fu){
	 		System.out.println("角标不能为负");
	 	}
	 	catch(Exception e){
	 		
	 	}
	 	finally{
	 		System.out.println("final!");
	 	}
	 	System.out.println("over!");	

	}
}