print("=" * 70)
print("=" * 70)

print("\nM-I-N-I   P-A-R-K-I-N-G   L-O-T")

available_slot = []
userStorage = []
car_packed = []

menu = """
     M E N U

     1. Register.
     2. Check Available park slot.
     3. Park car
     4. Remove your car.
   """

print(menu)
while True:
  userInput = int(input("Enter An Option: "))
  if userInput == 1:
      print("REGISTER")
      firstName = input("Enter First Name: ")
      userStorage.append(firstName)

      secondName = input("Enter Second Name: ")
      userStorage.append(secondName)

      password = input("Enter Password: ")
      #string_password = str(password)
      userStorage.append(password)

      print("REGISTRATION SUCCESSFUL:",userStorage[0],"--",userStorage[1])

  elif userInput == 2:
      print("AVAILABLE SLOT")
      if available_slot == 0:
          print("Empty Slots you can choose to park")
      else:
          print("SLOTS:",userStorage[0],"packed"available_slot)

  elif userInput == 3:
      print("PARK YOUR CAR.\n20 SLOTS AVAIALBLE.\nPARK YOUR CAR IN A SLOT.")
      car_name = input("Enter Car Name: ")
      car_packed.append(car_name)

      car_model = input("Enter Car Model: ")
      car_packed.append(car_model)

      available_slot.append(car_packed)
      print(userStorage[0],"You packed, CAR:",available_slot[0])

  elif userInput == 4:
      
