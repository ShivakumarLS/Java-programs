strs = ["dfg","fgd","eats"]
anagrams = dict()

for i in strs:
    sorted_string="".join(sorted(list(i)))
    if sorted_string not in anagrams.keys():
        anagrams[sorted_string]=[]
    anagrams[sorted_string].append(i)
print(anagrams)
result=[]
for i in anagrams.values():
    result.append(i)
print(result)    
    