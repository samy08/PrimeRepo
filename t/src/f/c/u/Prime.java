package f.c.u;

public class Prime {
public static void main(String args[]){
	System.out.println(isPrime(15));isPrime(5);
}
static String isPrime(int n){
	String str="";
	if(n>0 && n!=1){
		int c=0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
				c++;
		}
		if(c==2){
		str="entered is prime";	
		}
		else{
			str="entered is not prime";
		}
	}
	else{
		str="entered is not prime";
	}
	return str;
}
}
