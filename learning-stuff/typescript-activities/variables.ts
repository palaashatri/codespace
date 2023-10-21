// string reassign and string operation
let movieTitle: string = "Star Wars"
movieTitle = "Star Trek"
movieTitle.toUpperCase
console.log(movieTitle)

// increment
let numCatLives: number = 9;
numCatLives +=1
console.log(numCatLives)

// reassigning
let gameOver : boolean = false;
gameOver =  true
console.log(gameOver)

let randomVar = true
// randomVar = "randomVar" // throws error => string is not assignable to boolean
console.log(randomVar)

let veryRandomVar: any = true
veryRandomVar = "veryRandomVar" // does not throw error because veryRandomVar is "any"
console.log(veryRandomVar)