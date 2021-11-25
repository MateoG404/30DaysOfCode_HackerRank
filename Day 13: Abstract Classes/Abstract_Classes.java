
class MyBook extends Book {
  int price ;
  //Constructor 
  MyBook (String title, String author,int price){
    super(title,author);
    this.title = title;
    this.author = author;
    this.price = price;
  }
  void display () {
    System.out.println("Title: "+ title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+price);
  }
}


