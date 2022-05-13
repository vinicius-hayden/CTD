print("Type your name")
Name = str(input())

print(f"Type {Name}'s position")
PlayerPosition = int(input())

if (PlayerPosition==1):
    print(f"Perfect! {Name}'s position was able to impact justice")
elif (PlayerPosition>1):
    print("There's only one position left in order for you to win!")
else:
    print("Unfortunately, he couldn't make it")
