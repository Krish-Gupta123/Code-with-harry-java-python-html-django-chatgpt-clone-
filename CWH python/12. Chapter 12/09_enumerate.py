list1 = [3, 53, 2, False, 6.2, "Harry"]

# index = 0
# for item in list1:
#     print(item, index)
#     index += 1

for index, item in enumerate(list1):
    print(item, index)# yaha pe item ko pehle rakha hai par index ko bhi pehle rakhke print kar sakte
    #hai index ya item kisse ko bhi pehle print karna ho bas print statement mai waisa order dal dene ka
    #baaki uske upar wala enumerate statement aise ka aise standard hota hai