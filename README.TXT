Project: zuul-better
Authors: Michael Kölling and David J. Barnes

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling
   
This project is a simple framework for an adventure game. In this version,
it has a few rooms and the ability for a player to walk between these rooms.
That's all.

To start this application, create an instance of class "Game" and call its
"play" method.

This project was written as the starting point of a small Java project.

The goal is to extend the game:

  - add items to rooms (items may have weight)
  - add multiple players
  - add commands (pick, drop, examine, read, ...)
  - (anything you can think of, really...)

Read chapter 8 of the book to get a detailed description of the project.


22)MVC is a design pattern that separates a program into the Model, the View, and the Controller.
The Model stores the game data and logic, such as the rooms and items.
The Controller reads the user’s commands and decides what actions to perform, for example moving between rooms.
The View displays information to the user through text printed on the screen.
In World of Zuul, this separation reduces coupling and makes the program easier to understand and modify.


24)The item description should be created in the Item or Room class because that’s where the item information is stored.
The Game class should only print the description when the player enters a room.
Doing it this way keeps the code simpler and avoids mixing game data with printing logic.

