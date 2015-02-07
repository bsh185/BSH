public class PersoneService{

	Person personeObject;
	public PersoneService(Persons personeObject){
		this.personeObject=personeObject;
	}
	public void toString(){
		System.out.print();
	}

	public Person getPerson(){
		return personeObject;
	}

}