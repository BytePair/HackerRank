if __name__ == '__main__':

    students = []

    for _ in range(int(input())):
        name = input()
        score = float(input())

        # create the list
        students.append([name, score])

    # sort list by grade first (highest first) and name second
    students = sorted(students, key=lambda x: (x[1], x[0]))

    # edge case where only one student or all students got the same grade
    if len(students) == 1 or students[0][1] == students[-1][1]:
        print("Error: Only one grade")

    # find second highest grade
    for i in range(1, len(students)):
        if students[i][1] > students[0][1]:
            # print all students with this grade
            j = i
            while students[i][1] == students[j][1]:
                print(students[j][0])
                j += 1
            break
