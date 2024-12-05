class programmers:
    company = "microsoft"
    def __init__(self,name,age,employee_id,salary):
        self.name=name
        self.age=age
        self.employee_id=employee_id
        self.salary=salary

    def getinfo(self):
        print(f"{self.name}  {self.age} years old from {self.company} has employee id {self.employee_id} and salary {self.salary}")

 
krish = programmers("krish","17","145","50k")
harry = programmers("harry","25","456","1lakh")
krish.getinfo()
harry.getinfo()