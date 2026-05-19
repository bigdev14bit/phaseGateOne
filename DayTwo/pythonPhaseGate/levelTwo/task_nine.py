print("Age Checker")

while True:
  userInput = int(input("\nEnter Age: "))

  if userInput > 100:
      print("\nVery Old")
  elif userInput > 50:
      print("\nAdult")
  elif userInput > 18:
      print("\nYouth")
  elif userInput > 12:
      print("\nTeenager")
  else:
      print("\nChild")
