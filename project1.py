import random


def game():
#checking condition for draw if both user and comp choose same thing
    if user == comp:
        return 0

#checking condition for snake
    if user=='s' and comp == 'w':
        return 1
    elif user=='s' and comp == 'g':
        return -1
    
#checking condition for water
    if user=='w' and comp == 's':
        return -1
    elif user=='w' and comp == 'g':
        return 1

#checking condition for gun
    if user=='g' and comp == 's':
        return 1
    elif user=='g' and comp == 'w':
        return -1

user = input("enter s for snake , w for water , g for gun : ")

a = random.randint(1,3) 
# randint is a fuction in python which guess a random number between any two numbers as instructed in program imported from random

if a==1:
    comp = "s"
if a==2:
    comp = "w"
if a==3:
    comp = "g"

print(f"you choose {user}")
print(f"comp choose {comp}")

result = game()

if result == 1:
    print("you won")
elif result== -1:
    print("you lose")
elif result== 0:
    print("draw")
else:
    print("invalid operation")
