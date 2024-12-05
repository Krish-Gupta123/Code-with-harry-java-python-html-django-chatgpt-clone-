import random
number = random.randint(1,100)
user_guess = None
guesses = 0
print(number)
while(user_guess!= number):
    user_guess=int(input("enter the number : "))
    guesses += 1
    if(user_guess ==  number):
        print("congrats you guessesit right")
    elif(user_guess>number):
        print("lower number please")
    else:
        print("higher number please")

print(f"Number of guesses you took to guess right number = {guesses}")
with open("hiscore.txt","r") as f:
    score = int(f.read())
if (guesses < score):
    print("congrats you have broken the highscore")
    with open("hiscore.txt","w") as f:
      f.write(str(guesses))
# hiscore wali file mai already koi number likhke rakhna warna agar file blank hoga toh error dega isliye koi bhi score 
# pehle se dalke rakhna aur ismai number of guesses jaise jaise less hoga waise waise he voh hiscore mai update ho jaega
# yaha pe hiscore matlab kam number hoga jyada bada number nhi kyuki number of guesses less hona chaiye hiscore ke liye