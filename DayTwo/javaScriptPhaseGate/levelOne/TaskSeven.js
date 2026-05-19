const prompt = require("prompt-sync") ();
let radius = Number(prompt("Enter Radius: "));

let circumference = 2 * 3.1428 * radius;

console.log("Circumference:",circumference);
