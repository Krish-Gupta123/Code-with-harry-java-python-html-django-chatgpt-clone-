number = int(input("enter the number whose table is to printed : "))
i=1
while i<=10:
    # print(f" {number}  x  {i}  =  {number*i} ")
    # yeh ek chota sa function hai string har jagah print mai declare karne ke jagah bas f likhe double quotes dalke normally likho jo print karna hai and variable names should be in curly braces 
    # or
    print(str(number) + " x " + str(i) + " = " + str(number*i))
    i=i+1