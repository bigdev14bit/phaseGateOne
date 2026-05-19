const prompt = require("prompt-sync") ();
let length = Number(prompt("Enter Length: "));
let width = Number(prompt("Enter Width: "))

let area = length * width;
console.log("Area:",area);
