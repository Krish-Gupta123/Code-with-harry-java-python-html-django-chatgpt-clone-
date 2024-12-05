def greatest(n1,n2,n3):
    if n1>n2 and n1>n3:
        return n1
    elif n2>n1 and n2>n3:
        return n2 
    elif n3>n1 and n3>n1:
        return n3 

n1 = int(input("enter the value of n1 : "))
n2 = int(input("enter the value of n2 : "))
n3 = int(input("enter the value of n3 : "))



print("the greatest of all numbers is : " + str(greatest(n1,n2,n3)))
