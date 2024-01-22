def reverse(n):
    res = 0
    while (n!=0):
        res *= 10
        res+= n%10
        n //=10
    return res

def countNicePairs(nums) :
    result =0
    hm = {}
    for i in nums:
        val = i-reverse(i)
        if val not in hm.keys():
            hm[val]=1
        else:
            hm[val]+=1
   
    for i in hm.values():
        result = ((result)+i*(i-1)//2)
    return result

nums = [13, 10, 35, 24, 76 ]
print(countNicePairs(nums))