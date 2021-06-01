//Your work belongs in this file.

/*Example*/ 
//Boolean
//True or false values
console.log("Boolean example:"); //Prints the text: Boolean example:
let booleanVariable = true;//creates variable booleanVariable, with value true
console.log(booleanVariable);//Prints booleanVariable's value
console.log(typeof booleanVariable);//Print booleanVariable's type

/*Explanation
typeof is a special operator in JavaScript.
It returns the type of the value or variable that follows.
*/ 

/*Your turn 
Create a variable using the keyword const.
The name of this variable should be candyIsHealthy.
Assign this variable a boolean value.
Print the value of candyIsHealthy to the console.
*/


/*Example*/
//Number
console.log("\nNumber example:");
let number = -12.4;
console.log(number);
console.log(typeof number);
/* Your turn 
Create a variable using the keyword var.
The variable can be named whatever you want. 
Assign it a number */

//Numbers can be expressed within this range
console.log(Number.MIN_VALUE+" to "+ Number.MAX_VALUE);//Prints the range of all Number types in JavaScript.
/*Explanation
Numbers in JavaScript are stored in 64-bit IEEE format
so the smallest they can get is 5*10^(-324) 
and the largest is roughly 1.7977 * 10^(308) */

/*Your turn
Type in this comment, next to Answer, a whole number that you think 
given the above information might not be accurately represented using the
number datatype. 
Answer: 
*/

/*Example*/
console.log("\nBigInt Example");
//BigInt
let bigNumber = BigInt(Number.MAX_VALUE)+1n;
console.log(bigNumber);
console.log(typeof(bigNumber));
/*Explanation
By typing n at the end of a number you indicate to JavaScript
that it is a bigint. Bigints allow you to accurately represent
arbitrarily large whole numbers. */

/*Your turn
Create a variable using the let keyword and try to 
assign it the answer you gave above using big int notation.
Note to raise a number to a power you would use the operator **.
Also note- if you do a calculation with bigints every number that is involved
must be a bigint- having an n appended to it or by being converted using BigInt(). 
*/


/*Example*/
console.log("\n\nString example:");
//String
let string = "This is a String";
let string2 ='single quotes work too';
console.log(string);
console.log(typeof string );
console.log(string2);
console.log(typeof string2 );
/*Your turn
Assign a string value to a variable you created earlier
that holds a number. 
Note you don't need to redefine the variable to assign it a new value.  
Print it to the console.*/ 

/*Explanation 
JavaScript is dynamically typed which allows us to 
first assign a number to a variable and then later
assign a string. A variable can hold any kind of data 
in JavaScript.*/


/*Example*/
//Null
console.log("Null example: ")
let nullVariable = null;
console.log(nullVariable);
console.log(typeof nullVariable);
/*Explanation
Using typeof null is deceiving. 
This result is an "accident" because of the 
way that javascript was first defined. 
The actual type of null is indeed null.

It should be used to represent the absence 
of a value that is intentionality set to not 
have a value.*/

/*Example*/
//Undefined
console.log("Undefined example: ")

let undefinedVariable;
console.log(undefinedVariable);
/*Explanation
Meanwhile undefined is typically the value of 
variables that have not be initialized. */

/*Your turn
Create a variable using either let or var
and print the result of using typeof 
on your variable. 
Then assign your new variable a value and use typeof
again- printing out the result.*/


//The final primitive is Symbol.
//Symbols are created using the function Symbol(). 
//This generates a value with type Symbol that JavaScript is 
//guaranteed to consider unique. 
//Symbols are used in the context of Objects and for now you don't need 
//to worry about the symbol type. 
//We won't talk about symbols much. 

//GREAT WORK!!