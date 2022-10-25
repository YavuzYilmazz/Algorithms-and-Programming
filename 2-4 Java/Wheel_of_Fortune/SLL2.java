
public class SLL2 {
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
			System.out.println(" ");
		else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.getData());
				temp = temp.getLink();
			}
		}
	}
	
		public void delete(Object dataToDelete) {

			boolean flag = true;

			if (head == null)
				System.out.println("Linked list is empty");
			else {

				while (head!=null && head.getData().equals(dataToDelete) == true) {
					head = head.getLink();
					flag = false;
				}

				Node temp = head;
				Node previous = null;
				while (temp != null) {

					if (temp.getData().equals(dataToDelete) == true) {
						previous.setLink(temp.getLink());
						temp = previous;
						flag = false;
					}
					previous = temp;
					temp = temp.getLink();
				}
				if (flag)
					System.out.println("Not Found");
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
