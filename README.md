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
