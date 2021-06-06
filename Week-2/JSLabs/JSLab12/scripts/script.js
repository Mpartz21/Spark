/*Explanation 
One of the frequent uses of loops is iterate over 
data structures (collections of information). In other
words, loops are often used to access and then perform 
some operations on each element in a collection. 

In this lab we will explore using loops to access 
each element in an array. 
*/ 

/*Example*/ 
let toDoList = ["grocery shop", "dishes","laundry", "pay bills"];
console.log("To do list:");
for(let index = 0; index<toDoList.length; index++){
    console.log(toDoList[index]);
}

/*Explanation 
We have a variable that stores the current index.
We use let index = 0 to initialize the starting position. 
Every time our loop finishes an iteration, it will 
increase the value of this variable by some 
amount (usually 1), and it will continue until 
the index variable is equal to or greater than 
the size of our array. In other words, it will 
continue as long as the index variable is less 
than the size.*/

/*Your turn 
Create an array called groceries. 
Assign it some grocery items. 
Then create a loop that prints each item out.*/
var groceries =["Steak","Potatos","Asparagus"];
console.log("Groceries list:");
for(let i = 0; i <groceries.length; i++){
    console.log(groceries[i]);
}




/*Your turn 
Take the below array of integers and iterate
over it. Check if each element is an even number 
and if so, print the index of that element.*/
let numbers = [1, 2, 5, 10, 12, 16, 21, 35, 47, 52];

for(let i = 0; i< numbers.length; i++){
    if(numbers[i] % 2 == 0){
        console.log("Numbers index: " + i);
    }
}