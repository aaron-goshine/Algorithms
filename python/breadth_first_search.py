"""
simple BFS implementation
"""
GRAPH = {}
GRAPH["you"] = ["alice", "bob", "claire"]
GRAPH["bob"] = ["anuj", "peggy"]
GRAPH["alice"] = ["peggy"]
GRAPH["claire"] = ["thom", "jonny", "Goshine"]
GRAPH["anuj"] = []
GRAPH["peggy"] = []
GRAPH["thom"] = []
GRAPH["jonny"] = []


class Queque(object):
    """
    basic Queque classe
    """
    def __init__(self):
        self = self

    _private_q = []

    def has_any(self):
        """
        basic Queque classe
        """
        return len(self._private_q) > 0

    def dequeque(self):
        """
        method to de-q items
        """
        item = self._private_q.pop(0)
        return item

    def enqueque(self, item):
        """
        method to en-q items
        """
        self._private_q = self._private_q + item

    def to_sring(self):
        """
        -
        """
        return str(self._private_q)


def person_is_seller(person):
    """
    comparator
    """
    return len(person) == 7


def breadth_first_search(graph_data, name):
    """
    A basic implementation of the breadth_first_search algo
    """
    search_queue = Queque()
    search_queue.enqueque(graph_data[name])
    searched = []
    while search_queue.has_any():
        person = search_queue.dequeque()
        if person not in searched:
            if person_is_seller(person):
                print person + " is a mango seller!"
                print search_queue.to_sring() + " is th path!"
                print str(searched) + " is th path!"
                return True
            else:
                search_queue.enqueque(graph_data[person])
                searched.append(person)
    return False


breadth_first_search(GRAPH, 'you')
