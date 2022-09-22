package Abstract;

public class Thiskey {
	       String name;

	      
	       void setName( String name ) {
	           this.name = name;
	       }

	      
	       String getName(){
	           return this.name;
	       }



	   

	public static void main(String[] args) {
		
		Thiskey obj = new Thiskey();
      obj.setName("Lakshmipriya");
        System.out.println("obj.name: "+obj.getName());

	}

}
