def table(n):
    for i in range(1,11):
       
         print(str(n) +"  x  " + str(i) + " = " + str(n * i))
        
        
    
n = int(input("enter the number whosemultiplication table you want to be printed : "))

print(table (n))