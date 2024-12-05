number = int(input("enter the number whose table is to printed : "))


limit = int(input("Enter the ending : "))

for i in range(limit,0,-1):
    # print(f" {number}  x  {i}  =  {number*i} ")
    # yeh ek chota sa function hai string har jagah print mai declare karne ke jagah bas f likhe double quotes dalke normally likho jo print karna hai and variable names should be in curly braces 
    # or
    print(str(number) + " x " + str(i) + " = " + str(number*i))
    