package edu.kis.vh.nursery.list;

public class Node {


		private int value;
		private Node prevNode;
		private Node nextNode;



		public Node(int i) {
				value = i;
		}

		protected  int getValue() {
				return value;
		}

		protected Node getPrevNode() {
				return prevNode;
		}

		protected void setPrevNode(Node prevNode) {
				this.prevNode =prevNode;
		}

		protected Node getNextNode() {
				return nextNode;
		}

		protected void setNextNode(Node nextNode) {
				this.nextNode =nextNode;
		}
}
