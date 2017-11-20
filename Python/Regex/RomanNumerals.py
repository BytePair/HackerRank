import re

if __name__ == '__main__':

    possible_roman_numeral = input()

    print(bool(re.search(r'^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$', possible_roman_numeral)))
