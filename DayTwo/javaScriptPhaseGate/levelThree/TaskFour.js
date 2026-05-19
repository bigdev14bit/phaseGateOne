const prompt = require("prompt-sync") ()
let userInput = Number(prompt("Enter Number: "));

for(let index = 1; index < 13; index++) {
  console.log(userInput,"x",index,"=",(userInput * index));
}
