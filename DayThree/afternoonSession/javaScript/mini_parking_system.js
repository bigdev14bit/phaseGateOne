const prompt = require("prompt-sync") ();

function miniParkingLot(parking) {

   console.log("==========================================================")
   console.log("==========================================================")
   console.log("\nM-I-N-I   P-A-R-K-I-N-G   L-O-T")

   let available_slot = []
   let userStorage = []
   let car_packed = []

   let menu = ("""
         M E N U

        1. Register.
        2. Check Available park slot.
        3. Park car
        4. Remove your car.
   """
   );

   console.log(menu)
   (while true):
    let userInput = int(input("Enter An Option: "))
     if(userInput == 1) {
         return `${MESSAGE}`;
         let firstName = prompt("Enter First Name: ")
         userStorage.push(firstName)

         let secondName = prompt("Enter Second Name: ")
         userStorage.push(secondName)

         let password = prompt("Enter Password: ")
         //string_password = str(password)
         userStorage.push(password)

         return `Registration successful, ${userStorage[0]}"--" ${serStorage[1]}`
     }

     else if(userInput == 2) {
         return "AVAILABLE SLOT"
         if available_slot == 0:
             return "Empty Slots you can choose to park"
         else:
             return `SLOTS:${userStorage[0]}, packed ${available_slot}`)
     }

     else if(userInput == 3) {
         console.log("PARK YOUR CAR.\n20 SLOTS AVAIALBLE.\nPARK YOUR CAR IN A SLOT.")
         let car_name = prompt("Enter Car Name: ")
         car_packed.push(car_name)

         let car_model = prompt("Enter Car Model: ")
         car_packed.push(car_model)

         available_slot.push(car_packed)
         return `${userStorage[0]} You packed  CAR: ${available_slot[0]}`

     elif userInput == 4:
}
miniPackingLot();
