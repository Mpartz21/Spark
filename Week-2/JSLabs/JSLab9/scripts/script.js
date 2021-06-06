//Your work goes here.
/*Explanation
Comparison operators 
==, ===, <, >, <=, >= 
Boolean operators 
|, &, ||, &&, !
*/ 

/*Example 
== operator */
console.log("== operator:");
let a = 5; 
let b = 5; 
console.log("5 == 5", a==b);

b = "5"; 
console.log("5 == '5'", a==b);
/*Explanation
== tests if two values are equal. But JavaScript will
coerce (change the datatype) of certain values before 
performing the comparison. */

/*Your turn
Assign 'b' a string that contains numerical digits. Assign the variable 'a'
a number that the will cause == to consider the two 
variables equal. 
Print the result to the console. */ 

b = "0";
a = 0;
console.log("0 == '0'" , a == b);

/*Example 
=== 
Comparison operator that compares the type as well as the 
value. */ 
console.log("\n\n=== operator")
a = "5";
b = 5; 
console.log("5 === '5'", a===b);

/*Example
>, >= */ 
//Works as expected with numbers 
console.log("\n\n > , >= operators")
console.log("5>5",a>b);
console.log("5>=5",a>=b);


//Can be used with strings 
console.log("\n")
console.log("'b'>'a'", "b">"a");
console.log("'a'>='a'", "a">="a");
console.log("'abc'>'abb'", "abc">"abb");

/*Your turn
Compare two numbers using the less than operator.
Print the result. 
Compare two strings using the less than operator. 
*/
console.log("34 < 98" , 34 < 98);
console.log("thisString < thatString" , "thisString" < "thatString" );

/*Example 
The or opertor 
|| 
*/
console.log("\n\nBoolean operators:");
a = false;
b = 5>0;
let solution = a || b;
console.log("false || true", solution);

/*Your turn
Assign solution the result of a and b*/
solution = a && b ;

console.log("false && true",solution);

/*Example
The not operator
! 
*/
solution = !(5>0);
console.log("!(true expression)",solution);

/*Example
What if we apply boolean operations to
nonboolean values? */
console.log("!'somestring'",!("string"));
console.log("false || 56", false || 56);

/*Explanation
Turns out everything in JavaScript essentially has some
boolean value. Everything is truthy unless it's falsy
The values that are falsey are: 
false, 0, null, undefined, "", NaN */

/*Your turn
Copy and paste the next line out of the comment

console.log("!(falsy value)", !____);

Fill in the blank with a falsy value that isn't the keyword false.
*/
console.log("!(falsy value)", !null);

//Finished! Nice work! Remeber these things for 
//the conditional blocks lab. 