phy = int(input("enter physics marks"))
chem = int(input("enter chemistry marks"))
maths = int(input("enter maths marks"))

total = float((phy + chem + maths)/300 )

if(total >= 0.4 and phy >= 33 and maths >=33 and chem >= 33):
    print("pass")
else:
    print("fail")