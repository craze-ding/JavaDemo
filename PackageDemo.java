
package mypackage;
import packB.DemoB;//导入packB包中的DemoB类
//import packB.*;//导入packB包中的所有类
//在javac时-cp 指定classpath
public class PackageDemo{
	public static void main(String[] args) {
		/*packA.DemoA d=new packA.DemoA();
		d.show();//简单的说:不叫"爹"不行!*/
		DemoB D=new DemoB();
		D.method();		
	}
}