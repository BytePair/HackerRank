def count_substring(string, sub_string):
    count = 0
    last_pos = string.find(sub_string, 0)
    while last_pos != -1:
        count += 1
        last_pos = string.find(sub_string, last_pos + 1)
    return count


if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()

    count = count_substring(string, sub_string)
    print(count)
