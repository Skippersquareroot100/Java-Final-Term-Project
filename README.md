# Java Final Term Project

A Java console application that simulates an AIUB-style university portal for course registration and faculty section management.

The application starts from `Start1.java` and provides menu-driven flows for students and faculty members. Students can log in, choose a department, add theory or lab courses, view selected courses, search by course code, remove courses, and log out. Faculty users can add, view, search, and remove theory or lab sections.

## Project Status

This repository currently contains the main application file only:

```text
Start1.java
README.md
```

`Start1.java` imports and depends on a `classes` package that is not currently included in this repository. The missing package is expected to provide these classes:

- `University`
- `Course`
- `Theory`
- `Lab`
- `Section`
- `TSection`
- `LSection`

Because those files are missing, the project cannot compile from this checkout alone. Add the missing `classes` package before running the application.

## Features

- Console-based university portal simulation.
- Student and faculty login paths.
- Basic ID format validation using regular expressions.
- Student course registration by department.
- Faculty section registration for theory and lab sections.
- Course and section search.
- Course and section removal.
- Display selected courses and sections.
- Login history file creation for student and faculty login attempts.

## Application Flow

### Entry Point

The program starts in:

```java
public static void main(String[] args)
```

Inside `main`, a `Start1` object is created and the login flow begins.

### First Menu

The first screen asks whether the user wants to visit `portal.aiub.edu`.

- Press `1` to continue to the portal.
- Other input returns to the same prompt after printing a goodbye message.

### Role Selection

After entering the portal, the user selects:

- `1` for Faculty
- `2` for Student

### Student Flow

The student path asks for:

- Student ID
- Password

The ID is validated against a pattern similar to:

```text
XX-XXXXX-X
XXXX-XXX-X
```

After login, students can select from these departments:

- CSE
- IPE
- EEE
- BBA
- English
- Law

Depending on the department, students can add theory courses, lab courses, or both. They can then go to the next page to show, search, or remove selected courses.

### Faculty Flow

The faculty path asks for:

- Faculty ID
- Password

Faculty users can add sections under the Faculty of Science and Technology. The application supports:

- Theory sections
- Lab sections

Faculty users can then show, search, or remove selected sections.

## Course Areas

The application includes course options for:

- Computer Science and Engineering
- Industrial and Production Engineering
- Electrical and Electronic Engineering
- Business Administration
- English
- Law

Example course names include:

- Complex Variable, Laplace & Z-Transformation
- Introduction to Electric Circuit
- Introduction to Database
- Data Structure & Algorithm
- Programming Language 2
- Organizational Behavior
- Muslim Law
- Writing for Arts and Social Science

## Generated Runtime Files

During login, the application creates local history folders:

```text
History/history
Faculty History/history
```

These files store the entered ID and password values. This is useful for a beginner file-handling demonstration, but it is not safe for a real application because passwords should never be stored in plain text.

## Requirements

- Java Development Kit (JDK) 8 or later
- Missing `classes` package files added to the project

Expected project structure after adding the missing classes:

```text
Java-Final-Term-Project/
├── Start1.java
├── README.md
└── classes/
    ├── University.java
    ├── Course.java
    ├── Theory.java
    ├── Lab.java
    ├── Section.java
    ├── TSection.java
    └── LSection.java
```

## How to Compile

After adding the missing `classes` package, compile the project from the repository root:

```bash
javac Start1.java classes/*.java
```

## How to Run

Run the application from the repository root:

```bash
java Start1
```

## Current Verification Result

Compilation was checked with:

```bash
javac Start1.java
```

Current result:

```text
error: package classes does not exist
error: cannot find symbol: class University
error: cannot find symbol: class Course
error: cannot find symbol: class Theory
error: cannot find symbol: class Lab
error: cannot find symbol: class Section
error: cannot find symbol: class TSection
error: cannot find symbol: class LSection
```

This confirms that the repository needs the missing `classes` package before it can be compiled and executed.

## Image Generation Prompts

Use these prompts to create images or mockups for the project.

### Frontend Prompt

Create a clean desktop UI concept for a university course registration portal inspired by the Java console project. The screen should show an AIUB-style student portal dashboard with a left sidebar for Student, Faculty, Departments, Courses, Sections, Search, and Logout. The main area should show a course registration workflow with department tabs for CSE, IPE, EEE, BBA, English, and Law. Include a table of available courses with course code, course title, type, credit, and an Add button. On the right side, show a selected courses panel with total credits, remove icons, and a compact search field. Use a professional academic design, white and light gray background, deep blue navigation accents, clear typography, subtle borders, realistic spacing, and polished dashboard components. Make it look like a modern web version of a Java console university portal, high resolution, no cartoon style, no fake brand logos.

### Backend Prompt

Create a technical backend architecture diagram for a Java console-based university portal system. Show `Start1.java` as the main entry point connected to login handling, student workflow, faculty workflow, course registration, section management, search, remove, and display modules. Include a `classes` package containing `University`, `Course`, `Theory`, `Lab`, `Section`, `TSection`, and `LSection`. Show file storage outputs for `History/history` and `Faculty History/history`. Use a clean software engineering diagram style with boxes, arrows, package boundaries, method-flow labels, and readable text. The visual should feel like a project documentation diagram for GitHub, with a white background, blue and green accents, monospaced labels for class names, and clear separation between student features and faculty features.

### Visual Prompt

Create a polished hero image for a Java final term project about an AIUB-style university portal. Show a student and faculty registration system represented visually with a laptop displaying a terminal-based Java menu, floating course cards, section cards, department labels like CSE, EEE, BBA, English, Law, and small code snippets in the background. Include subtle academic elements such as a university building silhouette, ID card, course registration checklist, and clean data-flow lines. The mood should be modern, educational, and technical. Use a balanced color palette with deep blue, white, graphite, and small green highlights. Make it suitable for a GitHub README banner, wide aspect ratio, sharp details, realistic UI elements, no clutter, no copyrighted logos, no random text artifacts.

## Limitations

- The current repository is incomplete because the `classes` package is missing.
- The login system validates only the ID format; it does not authenticate against a real database.
- Passwords are written to local files in plain text.
- The program uses recursive menu calls, which is acceptable for a small academic demo but not ideal for larger applications.
- Input handling is basic and may throw exceptions for unexpected input in some menus.

## Suggested Improvements

- Add the missing `classes` package source files.
- Replace recursive menu calls with loops.
- Avoid storing passwords in plain text.
- Add a proper authentication model.
- Add input validation for every menu.
- Split the large `Start1.java` file into smaller controller or service classes.
- Add automated tests for course and section operations.
