a  = int(input("enter the number a = "))
b  = int(input("enter the number b = "))
try:
   print(a/b)
except :
   print("infinite")
else:
   print("else is executed only if try is succesfull that is program runs without error")
finally:
   print("finally is executed regaardless of error that is kuch bhi ho jae yeh print hoga he")