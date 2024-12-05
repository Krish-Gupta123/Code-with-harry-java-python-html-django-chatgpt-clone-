number = int(input("enter the number  : "))
prime = False
for i in range(2,number):
    if(number % i == 0 ):
        prime = True
        break
    
if prime:
    print(str(number) + " is prime")
else:
    print(str(number) + " is non prime")