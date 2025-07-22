# 🎓 Student Grade Calculator

A simple and interactive **Java console application** that calculates a student's average grade and assigns a grade category based on user input. This tool is useful for students, teachers, and developers looking to practice Java fundamentals with clean input validation and formatting.

## 📋 Features

- Accepts grades for multiple subjects
- Validates user input (ensures grades are between 0 and 100)
- Calculates average grade
- Classifies final grade into categories (A+, A, B, C, D, F)
- Displays all subject grades in a clean format
- User-friendly command-line interface with box-style formatting

## 📌 Grade Categories

| Average Score | Grade       |
|---------------|-------------|
| 90 - 100      | A+ (Excellent) |
| 80 - 89       | A (Very Good)  |
| 70 - 79       | B (Good)       |
| 60 - 69       | C (Average)    |
| 50 - 59       | D (Pass)       |
| Below 50      | F (Fail)       |

## 💻 Technologies Used

- Java 8+
- Scanner for user input
- Lists for grade storage
- Control structures (loops, conditionals)
- Console formatting

## 🚀 How to Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/student-grade-calculator.git
   cd student-grade-calculator
   
2. **Compile the Java Program:**

   ```bash
   javac StudentGradeCalculator.java
   ```

3. **Run the Program:**

   ```bash
   java StudentGradeCalculator
   ```
## 🧠 Sample Output

```text
╔══════════════════════════════════════╗
║       Student Grade Calculator       ║
╚══════════════════════════════════════╝
Enter the number of subjects: 3
Enter grade for subject #1 (0 - 100): 87
Enter grade for subject #2 (0 - 100): 76
Enter grade for subject #3 (0 - 100): 91

══════════════ Results ══════════════
Subject #1: 87.00
Subject #2: 76.00
Subject #3: 91.00
Average Grade: 84.67
Grade Category: A (Very Good)
═════════════════════════════════════
## 📂 File Structure
student-grade-calculator/
├── StudentGradeCalculator.java
└── README.md



