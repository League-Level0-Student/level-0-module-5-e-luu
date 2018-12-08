
public class ForLoopGauntlet {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	for (int j = 100; j < 101 && j > 0; j--) {
		System.out.println(j);
	}
	for (int a = 0; a < 101; a+=2) {
		System.out.println(a);
	}
	for (int p = 1; p < 100; p+=2) {
		System.out.println(p);
	}
	for (int s = 0; s < 501; s++) {
		if (s%2==0) {
			System.out.println(s+" is even");
		}else {
			System.out.println(s+" is odd");
		}
	}
	for (int z = 7; z < 778; z+=7) {
		System.out.println(z);
	}
	for (int d = 0; d < 13; d++) {
		System.out.println("In "+(2005+d)+" I was "+d+" years old");
	}
	for (int f = 0; f < 3; f++) {
		for (int u = 0; u < 3; u++) {
			System.out.println(f+" "+u);
		}
	}
	for (int w = 1; w < 10; w++) {
		System.out.print(w);
		if(w%3==0)
			System.out.println("");
		else
			System.out.print(" ");
	}
	
	for (int o = 1; o < 101; o++) {
		System.out.print(o);
		if (o%10==0) {
			System.out.println("");
		}else {
			System.out.print(" ");
		}
	}
	for (int q = 0; q < 10; q++) {
	for (int n = 0; n < q; n++) {
		System.out.print("* ");
		
	}
	System.out.println("");
	}
}
}
