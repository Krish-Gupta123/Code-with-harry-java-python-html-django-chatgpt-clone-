


class sample:
    a = "krish"

obj = sample()
obj.a = "harry"

print(sample.a)
print(obj.a)
# answer_challenge - this does not change class attribute

# to change class attribute
sample.a = "vikky"
print(sample.a)