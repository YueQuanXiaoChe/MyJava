/**
 * 自定义类加载器
 */
package reflect;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class MyClassLoader extends ClassLoader {
	/**
	 * 实现一个自定义的类加载器的操作，传入类的名称后，要通过指定的文件路径加载
	 * @param className 类名称
	 * @return 类的Class对象
	 * @throws Exception
	 */
	public Class<?> loadData(String className) throws Exception {
		byte[] classData = this.loadClassData(); // 加载类文件的数据信息
		return super.defineClass(className, classData, 0, classData.length);
	}
	
	/**
	 * 通过指定的文件路径进行类的文件加载，就是进行二进制读取
	 * @return 类文件数据
	 * @throws Exception
	 */
	private byte[] loadClassData() throws Exception {
		InputStream input = new FileInputStream(new File("E:" + File.separator + "workspace" + File.separator + "ClassLoaderTest.class"));
		ByteArrayOutputStream bos = new ByteArrayOutputStream(); // 可以有一个方法取得所有的字节内容
		byte[] data = new byte[20]; // 定义读取的缓冲区
		int temp = 0;
		while((temp = input.read(data)) != -1) {
			bos.write(data, 0, temp);
		}
		byte[] ret = bos.toByteArray();
		input.close();
		bos.close();
		return ret;
	}
}

public class ClassLoaderDemo {

	public static void main(String[] args) throws Exception {
		Class<?> cls = new MyClassLoader().loadData("reflect.vo.ClassLoaderTest");
		System.out.println(cls.newInstance());
		System.out.println(cls.getClassLoader()); // reflect.MyClassLoader
		System.out.println(cls.getClassLoader().getParent()); // sun.misc.Launcher$AppClassLoader
		System.out.println(cls.getClassLoader().getParent().getParent()); // sun.misc.Launcher$ExtClassLoader
	}

}
