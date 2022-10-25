
public class SLL5 {
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
	
	public void print() {
		if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.getData()+" ");
				temp = temp.getLink();
			}
		}
	}
	
	public void complement(String Guess,int counter) {
		if(head==null)
			System.out.println("Linked list is empty");
		else {
			Node temp=head;
			
			for (int i = 1; i <= counter; i++) {
				if(temp!=null) {
					if(temp.getData().toString().equals("_")&&i==counter)
						temp.setData(Guess);
					temp=temp.getLink();
				}
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
}
