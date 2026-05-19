console.log("Welcome To Mini number Guessing Game.\nPick a random number between 1 to 100.\nYou have 5 attempt to guess the number.")


const prompt = require("prompt-sync") ();

const userInput = Number(prompt("Enter Number: "));

numberToGuess = Math.floor(Math.random() * 100) + 1;

console.log(numberToGuess);
