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
		
	int index = name.indexOf(' ');					//två olika alternativ
	this.firstname = name.substring(0, index);
	this.lastname = name.substring(index+1);

	
	this.firstname = name.split(" ")[0];			//gör fullname till en array och delar den vid mellanslag, gör de till index 0 respektive 1
	this.lastname = name.split(" ")[1];
}
public String getname(){
	return this.firstname + " " + lastname;
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
