// basic function to provide square of a number
function square(num : number) {
    return num * num;
}
square(3);

// basic function to greet a person with string parameter
function greet(person: string){
    return `Hello There, ${person}!`
}
greet("mister");

// multiple parameters arrow function
const doSomething = (person: String, age: number, isFunny: boolean) => {};
doSomething("Chickenface", 10, false);

// set default value for parameter
function hello(person: string = "kenobi"){
    return `Hello There, ${person}!`;
}

hello(); // prints "Hello There, kenobi!"
hello("obi-wan"); // prints "Hello There, obi-wan!"


/**
 * return type annotations
 */

// creates function with return type
const addNums = (x: number, y: number) : number => {
    return x + y;
}

addNums(5,5); // -> 10