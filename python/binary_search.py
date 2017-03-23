'''
A simple implementation of binary search in python
'''


def binary_search(data, item):
    '''
    binary_search, searches a list of items
    and returns the index of the result if found or
    None
    @param data [] - a list of items to search
    @param item - item to search for
    @return number | None - the index at which the item was found
    '''
    low = 0
    high = len(data)

    while low <= high:
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
