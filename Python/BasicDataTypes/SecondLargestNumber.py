if __name__ == '__main__':

    n = int(input())
    arr = map(int, input().split())

    arr = sorted(arr, reverse=True)

    for i in range(1, len(arr)):
        if arr[i] < arr[0]:
            print(arr[i])
            break
