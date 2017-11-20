if __name__ == '__main__':

    n = int(input())

    # use map with int() to turn list of strings into ints
    # then turn list of ints into tuple
    # then use hash() from the __builtins__ module
    print(hash(tuple(map(int, input().split()))))
