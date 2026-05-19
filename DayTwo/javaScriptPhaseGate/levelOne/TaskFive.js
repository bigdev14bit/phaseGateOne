const prompt = require("prompt-sync") ();
let temperature_in_celcius = Number(prompt("Enter First Number: "));
let temperature_in_fahrenheit = (temperature_in_celcius * 9/5) + 32;

console.log(temperature_in_celcius,"C","is",temperature_in_fahrenheit,"F");
