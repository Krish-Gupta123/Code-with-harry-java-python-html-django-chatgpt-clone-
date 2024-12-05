def total(n):
    if n==0:
        return 0
    else:
       return n + total(n-1) 
    
n = int(input("enter the value of n : "))
print(total(n))