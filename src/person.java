import java.util.ArrayList;

public class person implements Comparable<person>{

	private String firstname;
	private String lastname;
	
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	
public person(String name){
		
		
		String[] fullname = new String [3];
		fullname = name.split(" ");

		firstname=fullname[fullname.length-1];
		
		for(int i =0; i<fullname.length-1; i++){
			
			lastname += fullname[i];
		}

	}

	@Override
	public int compareTo(person p) {
		
		if((this.lastname).compareTo(p.lastname)==0){
			return((this.firstname).compareTo(p.firstname));
		}
		else{
			return(this.lastname).compareTo(p.lastname);
		}
	}
}
