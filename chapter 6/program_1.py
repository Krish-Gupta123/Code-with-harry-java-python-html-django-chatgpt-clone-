a = int(input("enter first number"))
b = int(input("enter second number"))
c = int(input("enter third number"))
d = int(input("enter fourth number"))

if(a>b and a>c and a>d):
    print("first number is greatest of all four numbers")
elif(b>a and b>c and b>d):
    print("second number is greatest of all four numbers")
elif(c>a and c>b and c>d):
    print("third number is greatest of all four numbers")
elif(d>a and d>b and d>c ):
    print("fourth number is greatest of all four numbers")
else:
    print("invalid operation")
