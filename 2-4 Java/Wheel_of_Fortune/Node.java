
public class Node {
   Object data;
   Object seconddata;
   Node link; 
   
public Node(Object dataToAdd) {
	     data = dataToAdd;
	     link = null;
   }

   public Node(Object data1,Object data2) {
	     data = data1;
	     seconddata=data2;
	     link = null;
 }
   
   public Object getData() {
	   return data; }
   
   public void setData(Object data) { 
	   this.data = data;  }

   public Object getData2() {
		return seconddata;
	}
	public void setData2(Object seconddata) {
		this.seconddata = seconddata;
	}
	
   public Node getLink() { 
	   return link;  }
   
   public void setLink(Node link) {
	   this.link = link;   }   
}
