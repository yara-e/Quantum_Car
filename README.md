# Quantum Car Project
A car system that can swap engines and keeps the car's speed in sync with the engine's internal cycles.

## 🛠 Design Patterns Used
- **Strategy Pattern:** Used for the `Engine` interface, allowing the Car to switch between Gas, Electric, and Hybrid engines at runtime.
- **Simple Factory Pattern:** The `CarFactory` handles the instantiation logic, keeping the `Main` class clean and decoupled.

### 🚀 Key Logic:
* **The 20:1 Rule:** Every time the car accelerates by 20 km/h, a loop call the engine's internal `increase()` method 20 times. This keeps the car and engine perfectly synchronized.
* **Hybrid Switching:** The Hybrid engine automatically handles the logic of switching from Electric to Gas once the car hits 50 km/h.
* **Safety:** Added checks to make sure the car can't stop while moving (speed must be 0) and stays within the 0-200 km/h limit.

## 📂 Folder Structure
- `src/com/fawry/challenge/`: Contains all logic and engine implementations.
- `Main.java`: A test suite that runs through basic acceleration, engine swapping, and the hybrid threshold.

## 💻 Sample Output
Below is the execution log from the `Main` test suite:

```text
--- CASE 1: Factory Creation & Basic Acceleration ---
Gas Engine received update: Car is moving at 20 km/h.
Car Speed: 20
Gas Engine Internal Speed: 20

--- CASE 2: Engine Replacement ---
Engine successfully swapped to Hybrid.

--- CASE 3: Hybrid Engine ---
Hybrid Status: Below 50 -> Switching to Electric.
Hybrid Status: 50 or Above -> Switching to Gas.
Speed is now 60 km/h. Hybrid should now use Gas Engine.

--- CASE 4: Brake and Stop Requirement ---
Hybrid Status: Below 50 -> Switching to Electric.
Speed should be 0 use brake first
Current speed: 40. Trying to stop...
Hybrid Status: Below 50 -> Switching to Electric.
Hybrid Status: Below 50 -> Switching to Electric.
Speed is 0. Car stopped successfully.

--- CASE 5: Max Speed Limit ---
Can't increase than 200 
Final speed after excessive acceleration: 200 km/h
