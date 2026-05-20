#Liking system, you probably know the like system from facebook and other pages. People can like blog posts, pictures or other items. We want to create the text that should be displayed next to such an items.
#implementing the function which takes an array containing the names of people that like an item. It must return the displa text as shown in the examples:
#1. [] NO ONE LIKES THIS
#2. ["PETER"] PETER LIKES THIS
#3. ["JACOB", "ALEX"] JACOB AND ALEX LIKES THIS
#4. ["MAX", "JOHN", "MARK"] MAX, JOHN, AND MARK, LIKES THIS POST
#5. ["ALEX", "JACOB", "MARK", "MAX"] ALEX, JACOB, AND 2 OTHERS LIKES THIS POST.


def likingSystem(names):

    #likeStorage = []

    #post = "Horizons, Assemble"

    likes = len(names)

    if likes == 0:
        return "no one likes this post"
    elif likes == 1:
        return f"{names[0]} likes this!"
    elif likes == 2:
        return f"{names[0]} and {names[1]} likes this post"
    elif likes == 3:
        return f"{names[0]}, {names[1]}, and {names[2]} likes this post"
    elif likes == 4:
        return f"{names[0]}, {names[1]}, and 2 others like this"

print("\nPOST: Horizons Assembles")
print(likingSystem([]))
print(likingSystem(["peter"]))
print(likingSystem(["jacob", "alex"]))
print(likingSystem(["max", "john", "mark"]))
print(likingSystem(["alex", "jacob", "mark", "max"]))
