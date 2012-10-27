AWS-Glacier phone screen failure
-------------
I figured I would document my second failure to try and get into Amazon. First
time around (November 14, 2011), I was still in school, flown out directly,
and was grilled for four hours. I thought I did quite well;
all of the "CS Fundamentals" were pretty fresh in my mind then.
Evidently I did not.

This most recent run (October 25, 2012),
to try and get into the AWS Glacier group, I flopped on the first code
screen. I guess I just want it too bad, get all nervous, and McFuckUp (TM).

The last time I have ever written a data structure from scratch was for
Fall 2010 coursework in
[CS4041 - Algorithms and Data Structures](http://www.cs.umn.edu/academics/undergraduate/class_desc/csci4041.php).
All the problems I _normally_ solve are based around gluing pieces of
preexisting software/concepts gleaned from docs together.

I love AWS and wish I could be a part of the awesome group. Maybe someone will
see this, prep better, and get in.

The Simple Problem
-------------
Traverse a family tree that has at its root, the oldest member of the family,
and the leaf nodes are the youngest members. Print out the member names at
each level. Essentially: arbitrary branching factor breadth-first traversal.

My dumbass Approach (1)
-------------
1. Find the maximum depth
2. Iterate: getting the nodes at each level ... building a list
3. Print off the correctly ordered list
4. Confuse self by intermingling recursion and iteration
5. Use up all the interview time without getting anything working

Who the fuck thinks of that???

The Obvious Answer (2)
-------------
1. Get the root, print off the name
2. Print off the name of all the child elements
3. Rinse, Repeat
4. ... store them as the traversal happens
5. Print from the stored queue
6. Make it to the next tech screen

Thanks
-------------
1. Claire - for dealing with my idiocy. What you told me about the development
environment in AWS makes me all the more want to keep trying to get in.
2. Myself - for being able to write integration libraries in how many languages,
tap into various 3rd party services, follow coding standards, and lead a
continuous integration movement; unable to write a tree traversal on the fly
