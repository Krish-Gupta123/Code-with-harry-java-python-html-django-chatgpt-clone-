class calculator:
    def __init__(self,num):
        self.num=num
    def square(self):
        print(f"square of {self.num} = {self.num ** 2}")

    def cube(self):
         print(f"cube of {self.num} = {self.num ** 3}")
    
    def sq_root(self):
         print(f"sq_root of {self.num} = {self.num ** 0.5}")
        
    @staticmethod
    def greet():
        print("Hello , welcome to best calculator of the world")
number = calculator(64)
number.greet()
number.square()
number.cube()
number.sq_root()