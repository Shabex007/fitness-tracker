# Fitness Tracker 🏋️‍♂️

A console-based fitness tracking application that helps users log exercises, track calories burned, and set fitness goals.

## Features

- 👤 User profile creation (name, weight)
- 📝 Exercise logging (type, duration, date)
- 📊 Exercise history viewing
- 🔥 Calorie burn calculation based on weight and duration
- 🎯 Fitness goal setting and tracking
- 📅 Date tracking for all exercises
- 🖥️ Simple console-based interface

## How to Use

1. Run the program and enter your details
2. Use the menu to:
   - Log new exercises
   - View your exercise history
   - Calculate total calories burned
   - Set or view fitness goals
3. Exit when finished

## Menu Options

1. Log exercise
2. View exercise history
3. Calculate calories burned
4. Set fitness goal
5. View fitness goal
6. Exit

## Technical Implementation

- **User Class**: Stores user information (name, weight, fitness goal)
- **Exercise Class**: Tracks exercise details and calculates calories burned
- **FitnessTracker Class**: Main application logic and menu system
- **Data Storage**: Uses ArrayList to track exercise history
- **Calorie Calculation**: Basic formula based on duration and weight

## Calorie Calculation

The current implementation uses a simple formula:
calories = 5.0 _ duration _ weight

## Example Output

```bash
Welcome to the Fitness Tracker!
Enter your name: John Doe
Enter your weight (kg): 75.5

Menu:
1. Log exercise
2. View exercise history
3. Calculate calories burned
4. Set fitness goal
5. View fitness goal
0. Exit
Enter your choice: 1
Enter exercise type (e.g., running, swimming): running
Enter duration (minutes): 30
Exercise logged successfully!

Menu:
1. Log exercise
2. View exercise history
3. Calculate calories burned
4. Set fitness goal
5. View fitness goal
0. Exit
Enter your choice: 1
Enter exercise type (e.g., running, swimming): swimming
Enter duration (minutes): 45
Exercise logged successfully!

Menu:
1. Log exercise
2. View exercise history
3. Calculate calories burned
4. Set fitness goal
5. View fitness goal
0. Exit
Enter your choice: 2
Exercise History:
Exercise{type='running', duration=30, date=Tue Oct 10 14:25:32 EDT 2023}
Exercise{type='swimming', duration=45, date=Tue Oct 10 14:26:15 EDT 2023}

Menu:
1. Log exercise
2. View exercise history
3. Calculate calories burned
4. Set fitness goal
5. View fitness goal
0. Exit
Enter your choice: 3
Total calories burned: 28312.5

Menu:
1. Log exercise
2. View exercise history
3. Calculate calories burned
4. Set fitness goal
5. View fitness goal
0. Exit
Enter your choice: 4
Enter your fitness goal (e.g., lose 5kg, run 10km): run a marathon
Fitness goal set successfully!

Menu:
1. Log exercise
2. View exercise history
3. Calculate calories burned
4. Set fitness goal
5. View fitness goal
0. Exit
Enter your choice: 5
Your fitness goal: run a marathon

Menu:
1. Log exercise
2. View exercise history
3. Calculate calories burned
4. Set fitness goal
5. View fitness goal
0. Exit
Enter your choice: 0
Exiting...
```
