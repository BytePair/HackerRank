if __name__ == '__main__':

    s = input()

    # create dictionary to store results (set to false initially)
    results = {"isalnum": False, "isalpha": False, "isdigit": False, "islower": False, "isupper": False}

    # set to true whenever a class of characters is found
    for c in s:
        # alphanumeric
        if c.isalnum():
            results["isalnum"] = True
            # alphabetic
            if c.isalpha():
                results["isalpha"] = True
                # lowercase
                if c.islower():
                    results["islower"] = True
                # uppercase
                if c.isupper():
                    results["isupper"] = True
            # numeric
            if c.isdigit():
                results["isdigit"] = True

    print(results["isalnum"])
    print(results["isalpha"])
    print(results["isdigit"])
    print(results["islower"])
    print(results["isupper"])
