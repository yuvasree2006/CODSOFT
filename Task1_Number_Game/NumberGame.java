#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
    srand(time(0));
    int number = rand() % 100 + 1;
    int guess, attempts = 0, maxAttempts = 7;

    cout << "Guess the number (1 to 100)\n";

    while (attempts < maxAttempts) {
        cout << "Enter your guess: ";
        cin >> guess;
        attempts++;

        if (guess == number) {
            cout << "Correct! You guessed in " << attempts << " attempts.\n";
            break;
        } else if (guess > number) {
            cout << "Too high!\n";
        } else {
            cout << "Too low!\n";
        }
    }

    if (attempts == maxAttempts)
        cout << "Game Over! The number was " << number << endl;

    return 0;
}
