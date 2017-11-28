import textwrap


def wrap(string, max_width):
    words = []
    word = ""
    for i in range(len(string)):
        # if we are at max width for a line, start new word
        if i > 0 and i % max_width == 0:
            words.append(word)
            word = ""
        word += string[i]
    # add the leftover word
    words.append(word)
    return "\n".join(words)


if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)
