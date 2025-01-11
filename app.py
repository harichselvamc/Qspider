class hari():
    def __init__(self,name,age):
        self.name=name
        self.age=age
        print(f"{name} is the data of the {age}")

myname=hari("hari",20)
myname.name="harichselvam"
myname.age=210
myname.work="developer"
print(myname.__dict__)

# print(__name__ is "__main__")





