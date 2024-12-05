num = int(input("enter the number = "))
list = [num*i for i in range(1,11)]
print(list)

with open("tables.txt","a") as f:
    f.write(str(list))
    f.write("\n")