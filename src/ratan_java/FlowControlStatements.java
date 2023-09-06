package ratan_java;

public class FlowControlStatements {

	public static void main(String[] args) {
		int a=10;
		if(a<18) {
		System.out.println("true body");	
		}
		else {
			System.out.println("false body");
		}
		int 	i=10;
		do {
			
			System.out.println("test");
			i++; 
		}while(i<10);
for(int k=0;k<10;k++) {
	if(k==6) {
		break; //break will stop the excution
	}System.out.println(k);
}

for(int k=0;k<10;k++) {
	if(k==6) {
		continue; // continue will skip the current iteration
	}System.out.println(k);
}



	}

}
