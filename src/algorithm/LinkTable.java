/**
 * 数据结构  (引用+递归): 链表(最简单的单向链表)/动态数组
 */
package algorithm;

class Link { // 负责链表的操作

	// 将Node定义为内部类，表示Node类只为Link类服务
	private class Node { // 负责数据与节点关系的匹配

		private Object data; // 保存节点的数据
		private Node next; // 保存下一个节点

		public Node(Object data) { // 车厢里面一定要保存有数据
			this.data = data;
		}

		// 第1次调用: this = Link.root
		// 第2次调用: this = Link.root.next
		// 第3次调用: this = Link.root.next.next
		public void addNode(Node newNode) { // 处理节点关系
			if (this.next == null) { // 当前节点下一个为空，表示可以保存
				this.next = newNode;
			} else { // 当前节点的下一个不为null
				this.next.addNode(newNode);
			}
		}

		// 第1次调用: this = Link.root
		// 第2次调用: this = Link.root.next
		// 第3次调用: this = Link.root.next.next
		public void toArrayNode() {
			Link.this.retData[Link.this.foot++] = this.data;
			if (this.next != null) { // 现在还有下一个节点
				this.next.toArrayNode();
			}
		}

		// 第1次调用: this = Link.root
		// 第2次调用: this = Link.root.next
		// 第3次调用: this = Link.root.next.next
		public boolean containsNode(Object search) {
			if (search.equals(this.data)) { // 找到了
				return true;
			} else {
				if (this.next == null) { // 没找到
					return false;
				}
				return this.next.containsNode(search);
			}
		}

		// 第1次调用: this = Link.root
		// 第2次调用: this = Link.root.next
		// 第3次调用: this = Link.root.next.next
		public Object getNode(int index) {
			if (Link.this.foot++ == index) { // 索引相同
				return this.data;
			} else {
				return this.next.getNode(index);
			}
		}

		public void setNode(int index, Object newData) {
			if (Link.this.foot++ == index) { // 索引相同
				this.data = newData;
			} else {
				if (this.next == null) {
					return;
				}
				this.next.setNode(index, newData);
			}
		}

		// 第1次调用: this = Link.root.next / previous = Link.root
		// 第2次调用: this = Link.root.next.next / previous = Link.root。next
		public void removeNode(Node previous, Object data) {
			if (this.data.equals(data)) { // 当前节点为要删除节点
				previous.next = this.next; // 删除当前节点
			} else {
				this.next.removeNode(this, data);
			}
		}

	}

	// ------------ 以下为Link类定义 ------------
	private Object[] retData; // 返回类型
	private int foot = 0; // 操作角标
	private int count = 0; // 当前的保存个数
	private Node root; // 属于根节点，没有根节点就无法进行数据的保存

	/**
	 * 向链表中添加数据
	 */
	public void add(Object data) {
		if (data == null) { // 不允许存放null
			return; // 方法调用结束
		}
		// 如果要想进行数据的保存，那么必须将数据封装在Node的节点类里面
		// 如果没有封装则无法确认节点的先后顺序
		Node newNode = new Node(data);
		if (this.root == null) { // 当前并没有根节点
			this.root = newNode; // 第一个节点设置为根节点
		} else { // 根节点已经存在
			// 应该把此时的节点顺序的处理交给Node类自己处理
			this.root.addNode(newNode);
		}
		this.count++;
	}

	/**
	 * 取得链表长度
	 */
	public int size() {
		return this.count;
	}

	/**
	 * 判断链表是否为空
	 */
	public boolean isEmpty() {
		return this.root == null || this.count == 0;
	}

	/**
	 * 链表数据转换为对象数组
	 */
	public Object[] toArray() {
		if (this.count == 0) {
			return null;
		}
		// 现在链表中存在有数据，则开辟制定长度的数组
		// 该数组一定要交给Node类进行处理
		this.retData = new Object[this.count];
		this.foot = 0; // 进行角标清零处理，需要进行角标的操作
		this.root.toArrayNode(); // 将数据的取出处理交给Node类完成
		return this.retData;
	}

	/**
	 * 判断数据是否存在
	 */
	public boolean contains(Object search) {
		// 没有要查询的内容 或者 链表为空
		if (search == null || this.root == null) {
			return false;
		}
		return this.root.containsNode(search);
	}

	/**
	 * 取得指定索引数据
	 */
	public Object get(int index) {
		if (index >= this.count) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	/**
	 * 修改指定索引数据
	 */
	public void set(int index, Object newData) {
		if (index >= this.count) {
			return;
		}
		this.foot = 0;
		this.root.setNode(index, newData);
	}

	/**
	 * 数据删除
	 */
	public void remove(Object data) {
		if (this.contains(data)) { // 如果该数据存在则进行删除处理
			if (this.root.data.equals(data)) { // 首先要判断删除的是否为根节点数据
				this.root = this.root.next; // 根节点变为下一个节点
			} else { // 不是根节点
				this.root.next.removeNode(this.root, data);
			}
			this.count--;
		}
	}

}

public class LinkTable {

	public static void main(String[] args) {
		Link all = new Link();
		System.out.println(all.size() + " && " + all.isEmpty());
		all.add("hello");
		all.add("world");
		all.add("straw");
		System.out.println(all.size() + " && " + all.isEmpty());

		Object[] result = all.toArray();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		System.out.println(all.contains("world"));
		System.out.println(all.contains("wx"));

		System.out.println(all.get(2));
		all.set(2, "2x");
		System.out.println(all.get(2));

		all.remove("hello");
		all.remove("2x");
		System.out.println(all.get(0));
		System.out.println(all.get(1));
	}

}