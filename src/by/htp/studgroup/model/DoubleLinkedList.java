package by.htp.studgroup.model;

public class DoubleLinkedList<T> {

	private int length;
	private Node<T> head;
	private Node<T> tail;

	public DoubleLinkedList() {
		length = 0;
		head = null;
		tail = null;
	}

	public DoubleLinkedList(T item) {
		Node<T> newNode = new Node<T>(item, null, null);
		length = 1;
		head = newNode;
		tail = newNode;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public void add(T item) {
		Node<T> node = new Node<T>(item, null, tail);

		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		++length;
	}

	public void addToBegin(T item) {
		Node<T> node = new Node<T>(item, head, null);

		if (head == null) {
			head = node;
			tail = node;
		} else {
			head.setPrev(node);
			head = node;
		}
		++length;
	}

	public Node<T> getNode(int index) {
		if (index >= 0 && index < length) {
			if (index == 0) {
				return head;
			}
			if (index == length - 1) {
				return tail;
			} else {
				Node<T> current = head.getNext();
				for (int i = 1; i < length; i++) {
					if (i == index) {
						return current;
					}
					current = current.getNext();
				}
			}
		}
		System.out.println("There are no such index");
		return null;
	}

	public void add(int index, T item) {
		if (index >= 0 && index < length) {
			if (index == 0) {
				addToBegin(item);
			} else if (index == length - 1) {
				add(item);
			} else {
				Node<T> newNode = new Node<T>(item, getNode(index), getNode(index).getPrev());
				getNode(index).setPrev(newNode);
				getNode(index).getPrev().setNext(newNode);
				++length;
			}
		} else
			System.out.println("There are no such index");
	}

	public void deleteFromEnd() {
		if (head != null) {
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				tail = tail.getPrev();
				tail.getNext().setPrev(null);
				tail.setNext(null);
			}
			--length;
		}
	}

	public void deleteFromBegin() {
		if (head != null) {
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				head = head.getNext();
				head.getPrev().setNext(null);
				head.setPrev(null);
			}
			--length;
		}
	}

	public void deleteNodeFromMiddle(Node<T> node) {
		node.getPrev().setNext(node.getNext());
		node.getNext().setPrev(node.getPrev());
		--length;
	}

	public void deleteItem(T item) {
		Node<T> current = head;

		while (current != null) {
			if (current.getItem().equals(item)) {
				if (current == head) {
					deleteFromBegin();
					break;
				} else if (current == tail) {
					deleteFromEnd();
					break;
				} else {
					deleteNodeFromMiddle(current);
				}
			}
			current = current.getNext();
		}
	}

	public void deleteFromIndex(int index) {
		if (index >= 0 && index < length) {
			if (index == 0) {
				deleteFromBegin();
			}
			if (index == length - 1) {
				deleteFromEnd();
			} else {
				deleteNodeFromMiddle(getNode(index));
			}
		} else
			System.out.println("There are no such index");
	}

	public T findItem(T keyItem) {
		Node<T> current = head;

		while (current != null) {
			if (current.getItem().equals(keyItem)) {
				return current.getItem();
			}
			current = current.getNext();
		}
		System.out.println("Sorry, there are no such item in list!");
		return null;
	}

	public void printList() {
		if (head != null) {
			Node<T> current = head;
			while (current.getNext() != null) {
				System.out.println(current.getItem());
				current = current.getNext();
			}
			System.out.println(current.getItem());
		} else
			System.out.println("The list is empty!");
	}

	public int indexOf(T item) {
		int index = 0;
		for (Node<T> current = head; current != null; current = current.getNext()) {
			if (item.equals(current.getItem())) {
				return index;
			}
			++index;
		}
		return -1;
	}

}
