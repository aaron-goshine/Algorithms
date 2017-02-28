
def quick_sort(data):
    if len(data) < 2:
        return data
    else:
        pivot = data[0]
        less = [i for i in data[1:] if i <= pivot]
        greater = [i for i in data[1:] if i > pivot]
        return quick_sort(less) + [pivot] + quick_sort(greater)


print quick_sort([1, 3, 2, 8, 4, 10])
