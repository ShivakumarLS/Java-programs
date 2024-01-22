def corpFlightBookings(bookings,n):
    result = [0]*n
    for entry in bookings:
        start = entry[0]
        end = entry[1]
        seats = entry[2]
        result[start-1]+=seats
        if end<n :
            result[end]-=seats
        print(result)
    for i in range(1,len(result)):
        result[i]+=result[i-1]
    return result
bookings = [[1,2,10],[2,3,20],[2,5,25]]
print(corpFlightBookings(bookings,5))