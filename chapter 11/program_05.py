class vector:
    def __init__(self,vec):
        self.vec = vec
        

    def __add__(self,v1):
        newlist = []
        for i in range (len(self.vec)):
            newlist.append(self.vec[i] + v1.vec[i])
        return vector(newlist)
    
    def __mul__(self,v2):
        sum = 0
        for i in range (len(self.vec)):
            sum += self.vec[i]*v2.vec[i]
        return vector(sum)
    
    def __str__(self):
        return f"{self.vec}"
    
num = vector([3,6,8])
num2 = vector([5,3,9])
print(num + num2)
print(num * num2)
        