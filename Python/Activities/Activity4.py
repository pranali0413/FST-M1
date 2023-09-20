user_choice1 = input("Enter a choice (rock, paper, scissors): ".lower())
user_choice2 = input("Enter a choice (rock, paper, scissors): ".lower())
while True:
    if user_choice1 == user_choice2:
        print("It's a tie!")
    elif user_choice1 == 'rock':
        if user_choice2 == 'scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user_choice1 == 'scissors':
        if user_choice2 == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif user_choice1 == 'paper':
        if user_choice2 == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    repeat = input("Do you want to play another round? Yes/No: ").lower()

    if (repeat == "yes"):
        pass

    elif (repeat == "no"):
        raise SystemExit

    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit
# #OUTPUT:
# enter a choice (rock, paper, scissors): rock
# enter a choice (rock, paper, scissors): paper
# Paper wins!
# Do you want to play another round? Yes/No: yes
# Paper wins!
# Do you want to play another round? Yes/No: no
#
# Process finished with exit code 0
