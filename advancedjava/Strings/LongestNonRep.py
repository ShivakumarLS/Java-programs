def findLongSS(inp):
    s= set()
    left,maxx=0,0
    longSubString = ""
    for right in range(len(inp)):
        if inp[right] not in s:
            s.add(inp[right])
            maxx = max(maxx,right-left+1)
            longSubString = inp[left:right+1] if len(inp[left:right+1])>len(longSubString) else longSubString
        else:
            while(inp[right] != inp[left]):
                s.remove(inp[left])
                left+=1
            s.remove(inp[left])
            left+=1
            s.add(inp[right])
    return [maxx,longSubString]

print(findLongSS("asbdlkjsadf"))


