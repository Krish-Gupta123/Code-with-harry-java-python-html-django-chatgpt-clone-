# class employee:
#     def hello(self):
#         print("...............using self perameter..........")
#     def hello_1(harry):
#         print("***********using harry incase of self *************")        
# a = employee()
# a.hello()
# a.hello_1()      

# or


class employee:
    def __init__(slf,name):
        slf.name= name
b = employee("krish")
print(b.name)


# ANS :- yes we can change self parameter but better to keep self parameter only instead of slf,harry,etc because
#        if other coders work on our code in future they can get confuse so for their understanding beter too use self parameter