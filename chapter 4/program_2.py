s1 = int(input("enter marks of student 1 = "))
s2 = int(input("enter marks of student 2 = "))
s3 = int(input("enter marks of student 3 = "))
s4 = int(input("enter marks of student 4 = "))
s5 = int(input("enter marks of student 5 = "))
s6 = int(input("enter marks of student 6 = "))
s7 = int(input("enter marks of student 7 = "))

students_marks = [s1,s2,s3,s4,s5,s6,s7]
students_marks.sort()   # list mai varible_name=variable_name.sort ya koi bhi command naam likhke equal to karke nhi likhe direct likhne ka
print(students_marks)