import java.io.*;

public class SLL3 {
	Node head;
	public void add(String data1,int data2) {

		if (head == null) {
			Node newnode = new Node(data1,data2);
			head = newnode;
		} else if (data2 > (int) head.getData2()) {
			Node newnode = new Node(data1,data2);
			newnode.setLink(head);
			head = newnode;
		}

		else {
			Node temp = head;
			Node previous = null;

			while (temp != null && data2 <= (int) temp.getData2()) {
				previous = temp;
				temp = temp.getLink();
			}

			if (temp == null) {
				Node newnode = new Node(data1,data2);
				previous.setLink(newnode);
			} else {
				Node newnode = new Node(data1,data2);
				newnode.setLink(temp);
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
				System.out.println(temp.getData()+" "+temp.getData2());
				temp = temp.getLink();
			}
		}
	}
	
	public int size() {

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
	
	public void deleteLast() {	
		if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node temp=head;
			Node Previous=null;
			while (temp!=null) {
				if(temp.getLink()==null)
				{
					Previous.setLink(null);
					temp.data=null;
					temp.seconddata=null;
					break;
				}
				else
				{
					Previous=temp;
					temp=temp.link;
				}
			}
		}
	}

	public void printio() throws IOException {
		PrintWriter outputStream=null;
		File f3 = new File((String) "D:\\highscoretable.txt");
	    f3.delete();
	    File f4 = new File((String) "D:\\highscoretable.txt");
	    f4.createNewFile();
	    outputStream = new PrintWriter(new FileWriter("D:\\highscoretable.txt"));
	    if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node temp = head;
			while (temp != null) {
				outputStream.println(temp.getData());
				outputStream.println(temp.getData2());
				temp = temp.getLink();
			}
		}
	    outputStream.close();
		
	}
}
