const prompt = require("prompt-sync") ();
let firstNumber = Number(prompt("Enter First Number: "));
let secondNumber = Number(prompt("Enter Second Number: "));

let product = firstNumber * secondNumber;
console.log("Sum =",product);
