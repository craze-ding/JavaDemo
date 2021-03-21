
package mypackage;
import packB.DemoB;//导入packB包中的DemoB类
import packB.*;//导入packB包中的所有类
public class PackageDemo{
	public static void main(String[] args) {
		/*packA.DemoA d=new packA.DemoA();
		d.show();//简单的说:不叫"爹"不行!*/
		DemoB D=new DemoB();
		D.method();		
	}
}