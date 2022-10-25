
public class SLL4 {
	Node head;
	public void add(Object dataToAdd) {
		if (head == null) {
			Node newnode = new Node(dataToAdd);
			head = newnode;
			}
		else { 
			Node temp = head;
			Node previous = null;

			while (temp != null) {
				previous = temp;
				temp = temp.getLink();
			}

			if (temp == null) {
				Node newnode = new Node(dataToAdd);
				previous.setLink(newnode);
			}
		}
	}
	
	public boolean search(Object item) {
		boolean flag = false;

		if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node temp = head;
			while (temp != null) {
				if (item == temp.getData())
					flag = true;
				temp = temp.getLink();
			}
		}
		return flag;
	}
	
	public Boolean Guess(String item,int counter) {
		Boolean flag=false;

		if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node temp = head;
			for (int i = 1; i <= counter; i++) {
				if (temp != null) {
					if (item.equals(temp.getData().toString())&&counter==i)
						flag=true;
					temp = temp.getLink();
			}
			}
		}
		return flag;
	}
	
}
