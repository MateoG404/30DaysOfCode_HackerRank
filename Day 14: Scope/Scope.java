
    private int max,min;
      
    public Difference (int[] elements){
      this.elements = elements;
      max = elements[0];
      min = elements[0];

    }
    public void computeDifference(){
      for (int i = 0 ; i< elements.length; i++){
        if (max <elements[i])
        max = elements[i];

        if (elements[i]<min)
        min = elements[i];
      } 
      maximumDifference = Math.abs(max-min);
      }
    
