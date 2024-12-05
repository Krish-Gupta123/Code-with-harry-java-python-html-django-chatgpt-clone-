# class calculator:
#     def __init__(self,num):
#         self.num=num
#     def getinfo(self):
#         print(f"square of {self.num} = {self.num ** 2}\nsq_root of {self.num} = {self.num ** 0.5}\ncube of {self.num} = {self.num ** 3}")
        
# number = calculator(4)
# number.getinfo()
   


#    OR 



class calculator:
    def __init__(self,num):
        self.num=num
    def square(self):
        print(f"square of {self.num} = {self.num ** 2}")

    def cube(self):
         print(f"cube of {self.num} = {self.num ** 3}")
    
    def sq_root(self):
         print(f"sq_root of {self.num} = {self.num ** 0.5}")
        
number = calculator(64)
number.square()
number.cube()
number.sq_root()
