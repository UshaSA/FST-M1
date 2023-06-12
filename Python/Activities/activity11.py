fruit_shop = {
    "orange": 18,
    "apple": 7,
    "grapes": 24,
    "mango": 9
}

key_to_check = input("What are you looking for? ").lower()

if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")