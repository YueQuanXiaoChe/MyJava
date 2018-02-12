/**
 * 二叉树
 */
package algorithm;

import java.util.Arrays;

@SuppressWarnings({ "rawtypes", "unchecked" })
class BinaryTree { // 实现一个二叉树
	private class Node {
		private Comparable data; // 保存的操作数据，因为必须是Comparable子类，而且要判断大小
		private Node left; // 保存左边的节点
		private Node right; // 保存右边的节点

		public Node(Comparable data) {
			this.data = data;
		}

		public void addNode(Node newNode) {
			if (this.data.compareTo(newNode.data) > 0) {
				if (this.left == null) {
					this.left = newNode;
				} else {
					this.left.addNode(newNode);
				}
			} else {
				if (this.right == null) {
					this.right = newNode;
				} else {
					this.right.addNode(newNode);
				}
			}
		}
		
		public void toArrayNode() {
			if(this.left != null) {  // 有左节点
				this.left.toArrayNode();
			}
			BinaryTree.this.retData[BinaryTree.this.foot++] = this.data;
			if(this.right != null) {
				this.right.toArrayNode();
			}
		}
	}

	// ---------------------------------------------

	private Node root; // 任何数据结构一定要抓住根
	private int count; // 保存个数
	private int foot = 0;
	private Object[] retData; // 返回数据

	public void add(Object data) {
		if (data == null) {
			return;
		}
		Node newNode = new Node((Comparable) data);
		if (this.root == null) {
			this.root = newNode;
		} else {
			this.root.addNode(newNode);
		}
		this.count++;
	}
	
	public Object[] toArray() {
		this.foot = 0;  // 角标清零
		this.retData = new Object[this.count];
		this.root.toArrayNode();
		return this.retData;
	}
}

public class BTDemo {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.add("B");
		bt.add("x");
		bt.add("A");
		bt.add("G");
		bt.add("i");
		System.out.println(Arrays.toString(bt.toArray()));
	}

}
