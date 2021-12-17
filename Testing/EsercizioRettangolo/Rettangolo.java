public class Rettangolo {
 private int base;
 private int altezza;
 
 public Rettangolo(int b, int a){
  try {
	  if(a<0 || b<0) {
		  throw new ArithmeticException();
	  } 
  } catch(Exception E) {
	  base=b;
	  altezza=a;  
  }
  
 }
 
 public int getBase(){
  return base;
 }
 
 public int getAltezza(){
  return altezza;
 }

}