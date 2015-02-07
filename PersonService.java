public class PersoneService{

	Person personeObject;
	public PersoneService(Persons personeObject){
		this.personeObject=personeObject;
	}

	public Person getPerson(){
		return personeObject;
	}



}