#1. Import the random module
#2. Collect userInput
#3. validate user input
#4. ----
import random

print("=" * 70)
print("=" * 70)

print("""
   Welcome To Mini Number Guessing Game.

   Pick a random number between 1 to 100.

   You have 5 attempt to guess the number.

   """)

while True:

  numberGuessed = 0;
  numberOfAttempt = 5;
  rating = 0;
  correctNumber = numberToGuess;

  userInput = int(input("Enter A Number: "))

  numbers_to_guess = random.randint(1, 100)

  print(numbers_to_guess)
