const prompt = require("prompt-sync") ();
let average = 0;

for(let index = 0; index < 3; index++) {
  let numbers = Number(prompt("Enter Number: "));
  average += numbers / 3;
}

console.log("Average: ",average);
