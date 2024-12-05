# (a + ib) (c + id) = (ac - bd) + i(ad + bc).
class complex:
    def __init__(self,r,i):
        self.real = r
        self.imaginary = i

    def __add__(self,a):
        return complex(self.real + a.real , self.imaginary + a.imaginary)
    
    def __mul__(self,a):
        return complex(self.real*a.real - self.imaginary*a.imaginary, self.real*a.real + self.imaginary*a.imaginary)
    
    def __str__(self):
        if self.imaginary<0:
            return f"{self.real} - {-self.imaginary}i"
        else:
            return f"{self.real} + {self.imaginary}i"
   
number = complex(4,6)
number1 = complex(3,5)
print(number + number1)
print(number * number1)
