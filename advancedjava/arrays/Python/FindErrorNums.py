def findErrorNums(nums : list) -> int :
    repeating = 0
    nums.sort()

    for i in range(1,len(nums)):
         if nums[i]==nums[i-1]:
            repeating = nums[i] 
            nums[i]=0
    actual_sum = sum(nums)
    natural_sum = len(nums)*(len(nums)+1)/2
    return [repeating ,natural_sum - actual_sum]

print(findErrorNums([1,2,3,3]))