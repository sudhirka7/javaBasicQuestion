import java.util.Scanner;

class IntWrapper{
  int value;
  IntWrapper(int a){
    this.value = a;
  }
}

public class Problem {

  public static void vowelConstant(){
    Scanner sc = new Scanner(System.in);
  
    char ch = sc.next().toLowerCase().charAt(0);
    if(!Character.isLetter(ch)){

    }else if(ch  == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
      System.out.println("The character is vowel ");
    } else{
      System.out.println("The character is consonants");
    }
  }

  public static void largest(IntWrapper a, IntWrapper b, IntWrapper c){
    if(a.value > b.value && a.value >c.value ){
      System.out.println("A is greater then B and C");
    }else if(b.value>c.value){
      System.out.println("B is greater then A and C");
    }else{
      System.out.println("C is greater than A and B");
    }
  }
  public static void oddEven(IntWrapper a){
    if(a.value % 2 == 0){
      System.out.println("The no is even");
    }
    else{
      System.out.println("The given no is odd");
    }
  }
  public static void swap(IntWrapper a, IntWrapper b){
    a.value = a.value + b.value;
    b.value = a.value  - b.value;
    a.value = a.value - b.value;
  }

  public static void tableOfn(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=10; i++){
      System.out.println(n +" X "+i+" = "+n*i);
    }
  }
  public static int fibofn(int n){
    if(n == 0) return 0;
    if(n == 1) return 1;
    return fibofn(n-1) + fibofn(n-2);
  }
  public static void fiboSeries(){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    for(int i = 0; i<= n; i++){
      System.out.print("\t"+fibofn(i));
    }
  }
  public static int factorial(int n){
    if(n == 0 ||n== 1) return 1;
    return n * factorial(n-1);
  }
  public static void countDigit(){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int count = 0;
    while (0<n) {
      n /= 10;
      count++;
    }
    System.out.println("The counts of digit is "+count);
  }
  public static void sumDigit(){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int sum = 0;
    while (0<n) {
      sum += n % 10;
      n /= 10;
    }
    System.out.println("The counts of sum is "+sum);
  }

  public static void prime(int n){
    for(int i = 2; i<n; i++){
      if(n%i == 0){
       System.out.println("The given is not prime");
       break;
      }
    }
  }
  public static void main(String[] args) {
    IntWrapper a = new IntWrapper(215);
    IntWrapper b = new IntWrapper(215);
    IntWrapper c = new IntWrapper(30);
    System.out.println(a.value+" "+b.value);
    oddEven(a);
    largest(a, b, c);
    swap(a, b);
    // vowelConstant();
    tableOfn();
    fiboSeries();
    countDigit();
    sumDigit();
    prime(45);
    System.out.println(factorial(5));
    System.out.println(a.value+" "+b.value);
    
  }
}
