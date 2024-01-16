inp = "asjhdmbfjhkJMH<BJKHGVB"
result = ""
for i in inp:
    if str(i).isalpha():
        result+=i.swapcase()
print(result)