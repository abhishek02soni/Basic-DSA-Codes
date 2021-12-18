package basic;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=123;
   int t1=n;
   int len = 0;
   while(t1!=0) {
	   len = len + 1 ;
	   t1 = t1/10;
   }
	int t2 = n;
	int arm = 0;
	int rem = 1;
	while(t2!=0) {
		int mul =1;
		rem =  t2%10;
	for(int i=1;i<=len;i++) {
		mul = mul * rem;
	}
    arm = mul + arm;
    t2 = t2/10;
	}
	if(arm == n) {
		System.out.println(n+"armstrong");
	}
	else {
		System.out.println(n + " not");
	}
	}

}
