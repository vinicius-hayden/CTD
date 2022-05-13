for item in [1,3,6,2,5]:
    print(item)

turn = 1;
for turn in range(1,10):
    print("turn "+str(turn))

cars = ('Ferrari', 'Tesla', 'BMW', 'Audi')
for car in cars:
    print(cars)

for i, cars in enumerate(cars):
    print(str(i) + "-" + cars)