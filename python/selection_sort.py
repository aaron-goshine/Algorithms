
def find_smallest(data):
    smallest_item = data[0]
    smallest_index = 0
    for item in enumerate(data):
        if item[1] < smallest_item:
            smallest_item = item[1]
            smallest_index = item[0]
    return smallest_index


def selection_sort(data):
    sorted_data = []
    for i in range(len(data)):
        smallest_index = find_smallest(data)
        smallest_item = data.pop(smallest_index)
        sorted_data.append(smallest_item)
    return sorted_data


print selection_sort([1, 3, 2, 8, 4, 10])
