
class Calculator  {
  private double n,p ;
  public int  power (int n , int p ) throws Exception {
    this.n = n ;
    this.p = p;
    double temp = Math.pow(n,p);
    int operation = (int)temp ;
    if (0<=n && 0<= p)
      return  operation;
    else 
      throw new Exception("n and p should be non-negative");
  }
}
