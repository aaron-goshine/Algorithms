
graph = {}
graph["you"] = ["alice", "bob", "claire"]
graph["bob"] = ["anuj", "peggy"]
graph["alice"] = ["peggy"]
graph["claire"] = ["thom", "jonny", "Goshine"]
graph["anuj"] = []
graph["peggy"] = []
graph["thom"] = []
graph["jonny"] = []


class Queque:

    q = []

    def has_any(self):
        return len(self.q) > 0

    def dequeque(self):
        tq = self.q[0]
        self.q = self.q[1:]
        return tq

    def enqueque(self, item):
        self.q = self.q + item


def person_is_seller(person):
    return len(person) == 7


def breath_first_search(graph, name):
    search_queue = Queque()
    search_queue.enqueque(graph[name])
    searched = []
    while search_queue.has_any():
        person = search_queue.dequeque()
        if person not in searched:
            if person_is_seller(person):
                print person + " is a mango seller!"
                return True
            else:
                search_queue.enqueque(graph[person])
                searched.append(person)
    return False


breath_first_search(graph, 'you')
