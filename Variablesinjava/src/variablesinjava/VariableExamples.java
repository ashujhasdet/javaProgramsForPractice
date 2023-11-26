// VARIABLES
/*
In java we know that an object stores it state in fields, 
these fields are also called as Variables.
More technically , Variables aret the Named Memory Location 
which are used to store data , so that it can be used later in the program.


In the Java programming language, the terms
"field" and "variable" are both used for same thing;

*/
class VariableExamples 
{
	public static void main(String[] args) 
	{   int a =10;
	    String b = "This is a String , which is a Non Primitive variable";
		System.out.println("Primitive Variable "+a);
		System.out.println(b);
	}
}


/* 
TYPES OF VARIABLES
1. ON THE BASIS OF TYPE OF DATA STORED
  1.Primitive Variables

  The variables which are used to store a primitive value(single value)
  is called as Primitive Variables. 

  Syntax: PrimitiveDataType identifier1, identifier2,......;
  Examples: int a;
            boolean b;
  2.Non-Primitive Variables
  The variable which is used to store a reference to Non-Primitive data
  i.e. multivalued data/grouped data
  is called Non Primitive Variable.
  SYNTAX: NonPrimitiveDataType identifier1,identifier2,.....;
  Example: String s = "Hey!";




2. ON THE BASIS OF SCOPE OF VARIABLE

 1.Instance Variables (Non-Static Fields):
   Technically speaking, objects store their individual states in "non-static fields",
   that is, fields declared without the static keyword.
   Non-static fields are also known as instance variables because their values are unique
   to each instance of a class (to each object, in other words); 
   example , the currentSpeed of one bicycle is independent from the currentSpeed of another.

 2.Class Variables (Static Fields) 
  A class variable is any field declared with the static modifier;
  this tells the compiler that there is exactly one copy of this variable in existence, 
  regardless of how many times the class has been instantiated. example , a field defining
  the number of gears for a particular kind of bicycle could be marked as static since
  conceptually the same number of gears will apply to all instances. 
  example :  static int numGears = 6; would create such a static field. 
  Additionally, the keyword final could be added to indicate that the 
  number of gears will never change.

 3.LOCAL VARIABLES: 
    Similar to how an object stores its state in fields, a method will often store
	its temporary state in local variables. The syntax for declaring a local variable 
	is similar to declaring a field (for example, int count = 0;). There is no special keyword
	designating a variable as local; that determination comes entirely from the location in which 
	the variable is declared — which is between the opening and closing braces of a method. 
	As such, local variables are only visible to the methods in which they are declared;
	they are not accessible from the rest of the class.
    NOTE: We can not use local variable w/o initialization , if we try to use local
          variables w/o initialization we may get Compile Time Error.
	       Local Variables will not be initialized with default value.

4.Parameters: 
   we know that  in the main method of the "Hello World!" application,the signature for the main method 
   is public static void main(String[] args).
   Here, the args variable is the parameter to this method.
   The important thing to remember is that parameters are always classified as "variables" not "fields". 
   This applies to other parameter-accepting constructs as well (such as constructors and exception handlers).


The rules and conventions for naming your variables can be summarized as follows:

Variable names are case-sensitive.
A variable's name can be any legal identifier — an unlimited-length sequence of Unicode letters and digits, 
beginning with a letter, the dollar sign "$", or the underscore character "_".

Convention for Name:

If the name you choose consists of only one word, 
spell that word in all lowercase letters. ex: int a =10; 
If it consists of more than one word, capitalize the first letter of each subsequent word.
ex: int myFirstNumber=10;

NOTE: The Java programming language is statically-typed,
which means that all variables must first be declared before they can be used. 
This involves stating the variable's type and name.

      


*/