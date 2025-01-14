class C2dvector:
    def __init__(self,i,j):
        self.icap = i
        self.jcap = j

    def __str__(self):
        return f"{self.icap}i + {self.jcap}j"
    
class C3dvector(C2dvector):
    def __init__(self,i,j,k):
        super().__init__(i,j)
        self.kcap = k

    def __str__(self):
        return f"{ self.icap}i + {self.jcap}j + {self.kcap}k"


v1 = C2dvector(1,2)
v2 = C3dvector(3,5,7)
print(v1)
print(v2)

