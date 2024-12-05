# salary_after_increment = salary*increment
class Employee:
    salary = 1000
    increment = 1.5

    @property
    def salary_after_increment(self):
        return self.salary*self.increment
    
    @salary_after_increment.setter
    def salary_after_increment(self,sal):
         self.increment = sal/self.salary


a = Employee()
print(a.salary_after_increment)
print(a.increment)
a.salary_after_increment = 5000
print(a.increment)