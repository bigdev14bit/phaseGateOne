firstNumber = int(input("Enter First Number: "))
secondNumber = int(input("Enter Second Number: "))
thirdNumber = int(input("Enter Third Number: "))

largest = firstNumber

if secondNumber > largest:
    largest = secondNumber
if thirdNumber > largest:
    largest = thirdNumber
else:
    largest = firstNumber
#secondNumber = firstNumber
#firstNumber = largest

print("First Number:",firstNumber)
print("Second Number:",secondNumber)
print("Third Number:",thirdNumber)

print("Largest Number is:",largest)
