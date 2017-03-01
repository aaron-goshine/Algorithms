
def simple_search(data, item):
    for i in enumerate(data):
        if item == i[1]:
            return i[0]


print simple_search([1, 3, 4], 4)
print simple_search([1, 3, 4], 0)
