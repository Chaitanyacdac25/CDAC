class ForDemo1{
public static void main(Strings args[]){
	
	/*
	for(int a = 10; ; a--);
	System.out.println(a);	
	}*/
	// the code will run and will be infinite as it consider as true condition if you don't give any

	
	/*
	for(int a = 10;a> =5 ; );
	System.out.println(a);	
	}*/
	// will work infinite

	/*
	int a =10;
	for(;a> =5 ; ){
	System.out.println(a);	
	}*/
	// will work

	/*
	int a =10;
	for(;a> =5 ;System.out.println("helllooo"));{
		System.out.println(a);	
		a--;
	}*/
	// o/p = 10
		helllooo
		9
		helllooo
		8
		.
		.
		.
		5
		helllooo

	/*
	for(; ; );{
		System.out.println(a);	
		
	}
	*/
	/* infinite loop will print :	a
					a
					a

	*/

	
	

	}
}