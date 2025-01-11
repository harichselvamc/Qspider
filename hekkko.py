
def contains_duplicate(nums):
    count=0
    n=len(nums)
    for i in range(n):
        for j in range(i+1,n):
            if nums[i]==nums[j]:
                count=count+1
    
    return count






nums = [1,1,1,1]
# Output: 4
print(contains_duplicate(nums))