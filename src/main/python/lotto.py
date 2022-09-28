import random

def lotto_numbers():
    numbers = random.sample(range(1, 46), 6)
    numbers.sort()
    print(numbers)

lotto_numbers()