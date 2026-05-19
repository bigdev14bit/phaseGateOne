const prompt = require("prompt-sync") ();
let price = Number(prompt("Enter Price: "));

let tax = price * 1.10;
console.log("Tax :",tax);
