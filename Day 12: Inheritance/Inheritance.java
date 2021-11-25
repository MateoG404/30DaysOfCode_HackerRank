

class Student extends Person{
	private int[] testScores;
    // Constructor 
    public Student(String firstName, String lastName, int idNumber, int [] testScores){
      super(firstName,lastName,idNumber);
      this.testScores = testScores ; 

    }
    public char calculate(){
      int average = 0;
      int cont = 0;
      for (int i = 0 ; i<testScores.length;i++){
        average += testScores[i];
        cont += 1;
      }
      average /= cont;
      if (90 <= average )
        return 'O';
      else if (  80 <= average)
        return 'E';
      else if ( 70 <= average )
        return 'A';
      else if ( 55  <= average)
        return 'P';
      else if (40<= average )
        return 'D';
      else 
        return 'T';
    }
}

