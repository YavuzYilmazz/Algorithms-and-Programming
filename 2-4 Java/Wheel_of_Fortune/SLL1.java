
public class SLL1 {
    static Node head;
	
    public void add(String dataToAdd) {

		if (head == null) {
			Node newnode = new Node(dataToAdd);
			head = newnode;
		} else if (dataToAdd.compareTo((String) head.getData()) <0) {
			Node newnode = new Node(dataToAdd);
			newnode.setLink(head);
			head = newnode;
		}

		else {
			Node temp = head;
			Node previous = null;

			while (temp != null && dataToAdd.compareTo((String)temp.getData()) > 0) {
				previous = temp;
				temp = temp.getLink();
			}

			if (temp == null) {
				Node newnode = new Node(dataToAdd);
				previous.setLink(newnode);
			} else {
				Node newnode = new Node(dataToAdd);
				newnode.setLink(temp);
				previous.setLink(newnode);
			}
		}
	}
    
	public static int size() {

		int count = 0;

		if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node temp = head;
			while (temp != null) {
				count++;
				temp = temp.getLink();
			}
		}
		return count;
	}
	
	public String search(int randomnumber) {
		String str = null;

		if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node temp = head;
			for (int i = 0; i < randomnumber; i++) {
				if(i==randomnumber-1)
				{
					str=(String)temp.getData();
				}
				else
				{
					temp=temp.getLink();
				}
			}
			}
		return str;
		}
	}

