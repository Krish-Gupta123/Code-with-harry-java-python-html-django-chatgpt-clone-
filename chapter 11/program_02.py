class Animals:
    type = "mammals"

     
class pets(Animals):
    color = "blue"
 

class dog(pets):
    @staticmethod
    def bark():
        print("bow bow !!!")

a = dog()
a.bark()