package edu.kis.vh.nursery.list;

public class IntLinkedList {


		private static final int VALUE_WHEN_EMPTY_ARRAY =-1;
		private Node lastNode;
		private int thisVarIsUnused;


		public void push(int i) {
				if (lastNode == null)
						lastNode = new Node(i);
				else {
						lastNode.setnextNode(new Node(i));
						lastNode.getnextNode().setprevNode(lastNode);
						lastNode = lastNode.getNextNode();
				}
		}

		public boolean isEmpty() {
				return lastNode == null;
		}

		public boolean isFull() {
				return false;
		}

		public int topValue() {
				if (isEmpty())
						return VALUE_WHEN_EMPTY_ARRAY;

				return lastNode.getValue();

		}

		public int pop() {
				if (isEmpty())
						return VALUE_WHEN_EMPTY_ARRAY;

				int ret = lastNode.getValue();
				lastNode = lastNode.getPrevNode();

				return ret;
		}

}
