
public class Person {
    private int age;	

   // Constructor
	public Person(int initialAge) {
  		if (initialAge > 0)
        age = initialAge;
      else{
        System.out.println("Age is not valid, setting age to 0.");
        age = 0;
      }
	}

	public void amIOld() {
  		if (age < 13){
        System.out.println("You are young.");
      }
      else if (13 <= age  && age <18){
        System.out.println("You are a teenager.");
      }
      else {
        System.out.println("You are old.");
      }
        
  }
	public void yearPasses() {
  	age++;
	}

