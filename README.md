This is my personal repo containing the code for my project.

The video link is here: https://drive.google.com/file/d/1pjkqihkVX3gAOuuxaihiGeF8_DVAIM6P/view?usp=sharing


*** Notes for the video (audio processing error) ***

*** Question.java ***
The Question class is responsible for making a question object. 
The question object has properties such as id, title, body, author, timestamp, tags, and answers.
The class has a constructor that throws exceptions if the input is not accepted.
The rest of the class has accessor methods for the properties.

*** Answer.java ***
The Answer class is responsible for answers. It has basic properties like the question class.
The properties are id, questionID, body, author, and timestamp.
The rest of the class is accessor methods for the answer object.

*** Questions.java ***
Questions.java is a class responsible for maintaining the list of questions posted to the app.
I decided to use a linked list to represent this. This class contains basic CRUD operations.

*** Answers.java ***
Answers.java is a class responsible for maintaining the list of answers posted to the app.
I decided to use a linked list to represent this. This class contains basic CRUD operations.

*** DiscussionBoard.java ***
This class is responsible for creating the Q&A interface, where students can ask questions
Most of this code is replicable from Team Assignment Phase 1.
To the left, a tag column is visualized so that in the future, students can filter questions based on tags.
In the middle, questions populate each row.
At the bottom of the screen, you have input fields where you can add a new question. Could you add a title and optionally, tags?
Once you submit the question, it will be posted and visualized. The tags will also be shown.
To answer a question, click the message icon to the left of each question in the question column. A popup window displays input for an answer.
Once you submit the answer you are notified and the answer is in the terminal. I need to work further on the visualization of the answers.
