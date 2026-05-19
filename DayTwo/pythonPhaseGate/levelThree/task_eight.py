total = 0

while True:
    userInput = int(input("Enter Number except 0: "))
    if userInput == 0:
        total += userInput
        break
print("Total =",total)
