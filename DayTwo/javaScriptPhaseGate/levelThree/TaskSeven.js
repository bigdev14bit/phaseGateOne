const prompt = require("prompt-sync") ();

let sum = 0;

for(let index = 1; index < 6; index++) {
   let userInput = Number(prompt("Enter Number: "));
   sum += userInput;
}
console.log("Sum =",sum);
