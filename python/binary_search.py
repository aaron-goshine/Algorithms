
def binary_search(data, item):
    low = 0
    high = len(data)

    while(low <= high):
        mid = (low + high) // 2
        current = data[mid]
        if item == current:
            return mid

        if item < current:
            high = mid
        else:
            low = mid
    return None


print binary_search([1, 2, 3, 5, 7], 7)
