# School Millionaire Quiz Game 
This project represents a game with 3 topics to play.

In  Main class we created object app, then called a start() method.

In StartGame class we initialize start() method which provides interface using while loop. 
Also we used try-catch exception in this method. If input is correct, it will create an appropriate object (for topics) and call startquiz() method. 
if not, it must catch InputMismatchException or other exceptions.

Question class contains "question", "answer" fields, "choices" array list.  Class has parameterized  constructor, which set question, choises and answer with keyword this. We use for loop to add choices into array list; to shuffle them we use method shuffle() method. Also Question class contains 3 getters:question, choices and answer.

Topic classes (History, Math and English) has constructor and startquiz() method. 
In constructor, we create a new array list to pass to it questions, options, and answers. 
startquiz() method shows all question with answers one by one using for loop; 
it take input from user after each question and if answer is correct the numCorrect field will be increased. At the end output will be "You got " + numCorrect + " correct answer(s)".
